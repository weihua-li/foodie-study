package com.howard.controller;

import com.howard.enums.YesOrNo;
import com.howard.pojo.Carousel;
import com.howard.service.CarouselService;
import com.howard.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Howard
 * @Date: 2021/8/12 10:30
 */

@Api(value = "首页",tags = {"首页展示的相关接口"})
@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    @ApiOperation(value = "首页轮播图",notes = "获取所有轮播图",httpMethod = "GET")
    @GetMapping("/carousel")
    public JSONResult carousel(){

        List<Carousel> list = carouselService.queryAll(YesOrNo.YES.type);

        return JSONResult.ok(list);
    }

}
