package com.zjl.vhr.controller;

import com.zjl.vhr.entity.Hr;
import com.zjl.vhr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Hr)表控制层
 *
 * @author makejava
 * @since 2020-08-31 18:25:16
 */

@RestController
public class HrController {

    @Autowired
    HrService hrService;

    @GetMapping("/hello")
    public List<Hr> hello(){
        List<Hr> list = hrService.list();
        return list;
    }

    @GetMapping("/employee/basic/hello")
    public String hello2(){
        return "/employee/basic/hello2";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello3(){
        return "/employee/advanced/hello3";
    }

}