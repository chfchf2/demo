package com.example.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("装备")
public class EquipmentDto {
    @ApiModelProperty("装备id")
    private Integer id;
    @ApiModelProperty("装备名字")
    private String name;
    @ApiModelProperty("装备描述")
    private String description;
    @ApiModelProperty("装备编码")
    private String code;
    @ApiModelProperty("装备价格")
    private float price;
    @ApiModelProperty("放置地点")
    private String place;
    @ApiModelProperty("分配id")
    private int userid;
    @ApiModelProperty("分配时间")
    private Date add_time;
}
