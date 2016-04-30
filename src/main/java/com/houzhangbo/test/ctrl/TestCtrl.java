package com.houzhangbo.test.ctrl;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestCtrl {

	@RequestMapping("/test")
	public String getTest(HttpServletRequest request,HttpServletResponse response
			,String name)
	{
		request.setAttribute("message", null==name?"This is a Test!":name);
		return "index";
	}
}
