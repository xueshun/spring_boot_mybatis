package com.xue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.xue.entity.Demo;
import com.xue.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/likeName")
	@ResponseBody
	public List<Demo>  likeName(String name){
		
		/*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 */
		PageHelper.startPage(1, 2);
		//List<Demo> likeName = demoService.likeName(name);
		List<Demo> likeName = demoService.likeName(name);
		return likeName;
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public Demo findById(String id) {
		Demo demo = demoService.findById(Long.valueOf(id));
		return demo;
	}
	
	@RequestMapping("/save")
	public Demo save(){
		Demo demo = new Demo();
		demo.setName("张三");
		demoService.save(demo);
		return demo;
	}
}
