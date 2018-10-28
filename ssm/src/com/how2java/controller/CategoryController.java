package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory() {
		ModelAndView mav = new ModelAndView();
		List<Category> list = categoryService.list();
		mav.addObject("list", list);
		// 放入jsp路径
        mav.setViewName("listCategory");
		return mav;
	}
}
