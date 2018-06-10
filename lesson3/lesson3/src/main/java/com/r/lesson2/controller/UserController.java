package com.r.lesson2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r.lesson2.dao.UserInfoRepository;
import com.r.lesson2.entity.UserInfo;

@RestController
public class UserController {

	@Autowired
	private UserInfoRepository u;

	@RequestMapping("/index")
	public String index() {
		return "hello Vue 2.0";
	}

	@RequestMapping("/getAll")
	public List<UserInfo> getAllUerInfo() {
		List<UserInfo> list = u.findAll();
		return list.isEmpty() ? null : list;
	}

	@RequestMapping("/getById/{id}")
	public UserInfo getById(@PathVariable("id") long id) {
		return u.findById(id).isPresent() ? u.findById(id).get() : null;
	}
}
