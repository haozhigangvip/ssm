package com.hzg.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hzg.ssm.domain.Product;
import com.hzg.ssm.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/findAll")
	public ModelAndView findAll() throws Exception{
		
		 List<Product> ps=productService.findAll();
		 ModelAndView mv=new ModelAndView();
		 mv.addObject("productList",ps);
		 mv.setViewName("product-list");
		 return mv;
	}
}
