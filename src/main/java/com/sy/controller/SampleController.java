package com.sy.controller;

import com.sy.pojo.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/example")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	@RequestMapping(value="/form")
	public void user(@ModelAttribute Sample sample, ModelAndView mav){
		logger.info("请求信息:{}",sample.toString());
	}

	@GetMapping(value="/rect")
	public ModelAndView redirectPage(ModelAndView mav){
		logger.info("重定向至新页面0");
		mav.setViewName("sview");
		mav.getModel().put("email","juniter@outlook.com");
		return mav;
	}
	@GetMapping(value="/rect1")
	public ModelAndView redirectPage1(ModelAndView mav){
		logger.info("重定向至新页面1");
		mav.setViewName("/sview");
		mav.getModel().put("email","juniter@outlook.com");
		return mav;
	}
	@GetMapping(value="/rect2")
	public ModelAndView redirectPage2(ModelAndView mav){
		logger.info("重定向至新页面2");
		mav.setViewName("templates/sview");
		mav.getModel().put("email","juniter@outlook.com");
		return mav;
	}
	@GetMapping(value="/rect3")
	public ModelAndView redirectPage3(ModelAndView mav){
		logger.info("重定向至新页面3");
		mav.setViewName("/templates/sview");
		mav.getModel().put("email","juniter@outlook.com");
		return mav;
	}
}
