package com.sy.controller;

import com.sy.pojo.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/example")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	@RequestMapping(value="/form")
	public void user(@ModelAttribute Sample sample, ModelAndView mav){
		logger.info("请求信息:{}",sample.toString());
	}

	@PostMapping(value="/rect")
	public ModelAndView redirectPage(ModelAndView mav){
		mav.setViewName("sview");
		mav.getModel().put("email","juniter@outlook.com");
		return mav;
	}
}
