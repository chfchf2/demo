package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags="用户管理模块接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl UserService;
    @ApiOperation("获取单个用户信息")
    @GetMapping("/{id}")
    public UserDto getUser(@ApiParam("用户id") @PathVariable Integer id){
        return UserService.getUser(id);
    }
    @ApiOperation("用户注册")
    @PostMapping("/register")
    public UserDto addUser(@ApiParam("用户注册信息")@RequestBody UserDto user){
         return UserService.addUser(user);
    }
    @ApiOperation("用户登陆")
    @PostMapping("/load")
    public UserDto loadUser(@ApiParam("登录名")@RequestParam String loginname,@ApiParam("密码")@RequestParam String password){
        return UserService.loadUser(loginname,password);
    }
    @ApiOperation("获取所有用户信息")
    @PostMapping("/getAlluser")
    public List<UserDto> Alluser(){
        return UserService.getAllusers();
    }
    @ApiOperation("重置密码")
    @PostMapping("/restPassword")
    public UserDto RestPassword(@ApiParam("用户id")@RequestParam Integer id,@ApiParam("重置密码")@RequestParam String password){
        return UserService.UserRestPassword(id,password);
    }
}
