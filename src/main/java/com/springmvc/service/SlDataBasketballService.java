package com.springmvc.service;

import com.springmvc.dao.SlDataBasketballMapper;
import com.springmvc.pojo.SlDataBasketballWithBLOBs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("SlResultNumService")
public class SlDataBasketballService {
    @Resource
    private SlDataBasketballMapper basketballMapper;

    public int insert(SlDataBasketballWithBLOBs withBLOBs) {
        int ret = this.basketballMapper.insert(withBLOBs);
        if (ret > 0) {
            return ret;
        }
        return 0;
    }
}
