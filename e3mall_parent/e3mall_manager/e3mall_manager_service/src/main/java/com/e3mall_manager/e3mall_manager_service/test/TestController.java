package com.e3mall_manager.e3mall_manager_service.test;

import com.e3mall_manager.e3mall_manager_dao.auto.TbUserMapper;
import com.e3mall_manager.e3mall_manager_pojo.auto.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
    private TbUserMapper tbUserMapper;

    @RequestMapping("/select")
    public TbUser selectUser(){

        TbUser tbUser = this.tbUserMapper.selectByPrimaryKey(7L);

        System.out.println(tbUser);
        return tbUser;
    }
}
