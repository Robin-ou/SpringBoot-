package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(ModelMap modelMap) {
		modelMap.put("name", "Magical Sam");
		List<String> list = new ArrayList<String>();
		list.add("sam a");
		list.add("sam b");
		list.add("sam c");
		list.add("sam d");
		modelMap.put("list", list);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Robin-ou");
		modelMap.put("map", map);
		return "home";
	}
}
