package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Product;
import com.service.ProductTopService;


@Controller
@RequestMapping()
public class ProductTopController {

    @Autowired
    ProductTopService productTopService;
    
	//productTopに遷移
	@GetMapping("/")
	public String top() {
		return "redirect:/productTop";
	}   
	
	@GetMapping("/productTop")
	public String index(Model model) {		
		
    	List<Product> product = productTopService.searchAll();
		model.addAttribute("productlist", product);
		return "index";
	}	
}   
