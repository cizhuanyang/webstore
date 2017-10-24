package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	//处理授权验证的方法
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login() {
      return "login";
   }
}
