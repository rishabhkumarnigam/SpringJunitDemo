package com.rishabh.controller;

import com.rishabh.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  ServiceDemo serviceDemo;


  @GetMapping(path = "/gett")
  public String fromClient2(){
   return serviceDemo.getAllDemos();
  }

  @GetMapping(path = "/error")
  public String error(){
    return serviceDemo.getAllDemos();
  }



}
