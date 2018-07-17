package com.springmvc.controller;
import com.springmvc.service.SlUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@Controller
public class main {
    @Resource
    SlUserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html;charset=utf-8");
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        String account = request.getParameter("account");
//        String pass = request.getParameter("pass");
//        UserInfo userInfo = userService.userLogin(account, pass);
//        if (userInfo != null) {
//            return "登陆成功";
//        }
//        //保存信息
//        LoginUserCache.put(userInfo,30*60);
        //判断用户的角色，如果是admin则赋予全部权限，否则根据用户id取得角色id获取相应得权限
        return "用户不存在";

    }

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void upload(@RequestParam(value = "file") MultipartFile file,HttpServletRequest request,HttpServletResponse response) {

    try {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    String address = "";
        try {
            System.out.println("fileName：" + file.getOriginalFilename());
            address = uploadFile(file, "/usr/local/img");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //http://120.76.212.227:8080/image/4e9bca53-ab70-4fdd-977d-5468b035a1d4.jpg
        request.setAttribute("code", "http://120.76.212.227:8080/image/"+address);
    try {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    } catch (ServletException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
//    return "image/"+address;
    }
    public String uploadFile(MultipartFile partFile, String rootPath) throws IllegalStateException, IOException {
        //如果没有该物理路径，则创建
        File fileDir = new File(rootPath);
                 if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        if (partFile != null && partFile.getOriginalFilename() != null && partFile.getOriginalFilename().length() > 0) {
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            String filePath = rootPath + year + "-" + month + "-/";//物理子目录
            File dir = new File(filePath);//没有该子目录则创建
            if (!dir.isDirectory())
                dir.mkdir();

            String fileOriginalName = partFile.getOriginalFilename();
            String newFileName = UUID.randomUUID() + fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
//            String newFileName = fileOriginalName+ fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
            File file = new File(filePath + newFileName);
            //文件写入磁盘
            partFile.transferTo(file);

            //返回存储的相对路径+文件名称
            return newFileName;
        } else
            return null;
    }


}
