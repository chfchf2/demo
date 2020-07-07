package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data//省略代码中get和set方法
@ApiModel("用户")
@Component
public class UserDto {
    @ApiModelProperty("用户编码")
    private Integer id;
    @ApiModelProperty("登陆名")
    private String loginname;
    @ApiModelProperty("真实姓名")
    private String realname;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("电话")
    private String tel;
    @ApiModelProperty("邮件")
    private String email;
    @ApiModelProperty("类型")
    private int type;
    @ApiModelProperty("最后一次登陆时间")
    private Date last_login_time;
    public UserDto(){
    }
}
