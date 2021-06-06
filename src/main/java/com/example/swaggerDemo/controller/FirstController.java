package com.example.swaggerDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RequestMapping("/base")
@Api(tags = "firstController")  // 设置java文件的展示的名称
@Controller  //表示java文件是controller文件
public class FirstController {

  public FirstController() {
  }

  @RequestMapping(value = "/ignore", produces = "application/json;charset=UTF-8", method = { RequestMethod.GET })
  @ResponseBody
  @ApiIgnore
  public String check() {
    return "";
  }

  @RequestMapping(value = "/first", produces = "application/json;charset=UTF-8", method = { RequestMethod.GET })
  @ApiOperation("第一个接口说明")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "cardId", value = "card Id", required = true, dataType = "long", paramType = "path")
  })
  public String getUser(@PathVariable Long cardId){

    return String.format("getUser");
  }

  @RequestMapping(value = "/second", produces = "application/json;charset=UTF-8", method = { RequestMethod.GET })
  @ApiOperation("第二个接口说明")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "name", value = "input name", required = true, dataType = "string", paramType = "header")
  })
  @ResponseBody
  public String getUserList(@PathVariable String name) {

    return String.format("getUserList %s",name);
  }

  @RequestMapping(value = "/third", produces = "application/json;charset=UTF-8", method = { RequestMethod.GET })
  @ApiOperation("第三个接口说明")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "cardId", value = "cardId", required = true, dataType = "long", paramType = "path")
  })
  @ResponseBody
  public String getCustomer(@PathVariable Long idPerson) {
    return String.format("getCustomer");
  }

  @RequestMapping(value = "/fourth", produces = "application/json;charset=UTF-8", method = { RequestMethod.GET })
  @ApiOperation("第四个接口说明")
  @ResponseBody
  public String getFourth() {

    return "1324";
  }

//  // http://127.0.0.1:8080/first/echo/me_id?v2=zhouv2
//  @GetMapping("/first/{v1}")
//  public String firstApi(@PathVariable("v1") String v1, @RequestParam("v2") String v2) {
//    return "zhouzhou"+v1+"="+v2;
//  }
//
//  // http://127.0.0.1:8080/hello?name=zhou
//  // http://127.0.0.1:8080/hello
//  @GetMapping("/hello")
//  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//    return String.format("hello %s",name);
//  }



}
