package com.wikka.tmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wikka.tmall.pojo.Category;
import com.wikka.tmall.service.CategoryService;

@Controller
@RequestMapping
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("admin_category_list")
	public String list(Model model)
	{
		List<Category> categoryList = categoryService.list();
		model.addAttribute("categoryList", categoryList);
		return "admin/categoryList";
	}
}
