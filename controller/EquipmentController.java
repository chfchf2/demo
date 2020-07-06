package com.example.demo.controller;

import com.example.demo.dto.EquipmentDto;
import com.example.demo.service.EquipmentServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "装备管理模块")
@RestController
@RequestMapping("/equipment")
public class EquipmentController {
    @Autowired
    EquipmentServiceI equipmentService;
    @ApiOperation("添加设备")
    @PostMapping("/addequipment")
    public EquipmentDto AddEquipment(@ApiParam("设备信息") @RequestBody EquipmentDto eqiupment){
        return equipmentService.UserAddEquipment(eqiupment);
    }
    @ApiOperation("查询所有设备")
    @PostMapping("/AllEquipment")
    public List<EquipmentDto> AllEquipment(){
        return equipmentService.getAllequipment();
    }
    @ApiOperation("查询莫人的设备")
    @PostMapping("/OneEquipment")
    public List<EquipmentDto> OneEquipment(@ApiParam("用户id")@RequestParam Integer userid){
        return equipmentService.getOneequipment(userid);
    }
    @ApiOperation("修改设备信息")
    @PostMapping("/changeequipmentmessage")
    public EquipmentDto changeEquipmentMessage(@ApiParam("用户id")@RequestParam Integer id,
                                               @ApiParam("装备名")@RequestParam String name,
                                               @ApiParam("装备描述")@RequestParam String description,
                                               @ApiParam("放置地点")@RequestParam String place
                                               ){
        return equipmentService.changeEquipmentMessage(id,name,description,place);
    }
    @ApiOperation("删除设备")
    @PostMapping("/deleteEquipment")
    public EquipmentDto deleteEquipment(Integer id){
        return equipmentService.deleteEquipment(id);
    }
    @ApiOperation("分配设备")
    @PostMapping("/forUser")
    public EquipmentDto addEquipmnetForUser(@ApiParam("设备id")@RequestParam Integer id,@ApiParam("分配用户id")@RequestParam Integer userid){
        return equipmentService.addEquipmentForUser(id,userid);
    }
    @ApiOperation("回收设备")
    @PostMapping("/recoveery")
    public EquipmentDto recoveryEquipment(@ApiParam("设备id")@RequestParam Integer id){
        return  equipmentService.recoveryEquipment(id);
    }
 }
