package com.wikka.tmall.service.impl;

import com.wikka.tmall.mapper.CategoryMapper;
import com.wikka.tmall.pojo.Category;
import com.wikka.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //声明当前类是一个Service类
public class CategoryServiceImpl implements CategoryService {

	@Autowired //通过自动装配@Autowired引入CategoryMapper
	CategoryMapper categoryMapper;
	public List<Category> list() {
		return categoryMapper.list();
	}
}
