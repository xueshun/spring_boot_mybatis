package com.xue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xue.entity.Demo;
import com.xue.mapper.DemoMapper;

@Service
public class DemoService {
	
	@Autowired
	private DemoMapper demoMapper;
	
	public List<Demo> likeName(String name){
		return demoMapper.likeName(name);
	}
	
	@Transactional
	public void save(Demo demo) {
		demoMapper.save(demo);
	}
	
	/**
	 * 通过ID查询
	 * @param id
	 * @return
	 */
	public Demo findById(Long id) {
		return demoMapper.getById(id);
	}
}
