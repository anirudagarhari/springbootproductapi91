package com.spring.api.category;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.api.product.Product;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepo repo;
	
	@GetMapping("/Category")            
	public String listCategory(Model model) {
		List<Category>listcategory = repo.findAll();
		model.addAttribute("listcategory", listcategory);
		return "Category";
	}
	
	@GetMapping("/Category/Create")
	public String showCategory(Model model) {
		model.addAttribute("Category", new Category());
		return "CategoryForm";	
	}
	@PostMapping("/category/save")
	public String saveCategory(Category category) {
		repo.save(category);
		return "redirect:/Category";
	}
}


