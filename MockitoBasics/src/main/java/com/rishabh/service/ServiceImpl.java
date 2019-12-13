package com.rishabh.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceDemo{

  @Override
  public String getAllDemos() {
    return "This is Junit Demo";
  }
}
