package com.jyz.bootproject.modules.sys.controller;

import com.jyz.bootproject.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys")
@Api(tags = "系统用户模块")
public class UserController {

    @GetMapping("/hello")
    @ApiOperation(value = "测试hello接口")
    public R hello(){
        return new R().ok();
    }

}
