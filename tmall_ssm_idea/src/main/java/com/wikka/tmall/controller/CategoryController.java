package com.wikka.tmall.controller;

import com.wikka.tmall.pojo.Category;
import com.wikka.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("") //表示访问的时候无需额外的地址
public class CategoryController {
	@Autowired //把CategoryServiceImpl自动装配进了CategoryService 接口
	CategoryService categoryService;

	@RequestMapping("admin_category_list") //映射admin_category_list路径的访问
	public String list(Model model){
		/*
		 * 通过categoryService.list()获取所有的Category对象，
		 * 然后放在"cs"中，
		 * 并服务端跳转到 “admin/listCategory” 视图。
		 * “admin/listCategory” 会根据后续的springMVC.xml 配置文件，
		 * 跳转到 WEB-INF/jsp/admin/listCategory.jsp 文件
		 */
		List<Category> cs= categoryService.list();
		model.addAttribute("cs", cs);
		return "admin/listCategory";
	}
}
