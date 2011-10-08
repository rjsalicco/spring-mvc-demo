package org.axiomaticit.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.axiomaticit.model.Item;
import org.axiomaticit.validator.ItemValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class ItemController {

	public ItemController() {}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new ItemValidator());
	}
	
	@RequestMapping("")
	public ModelAndView welcome() {
		return getItems();
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView getItems() {
		
		List<Item> items = new ArrayList<Item>();
		
		Item item1 = new Item();
		item1.setId(new Long(1));
		item1.setAuthor("RJ Salicco");
		item1.setTitle("The Title 1");
		item1.setContent("This is some incredible content. Realistically it is some great content.");
		
		Item item2 = new Item();
		item2.setId(new Long(2));
		item2.setAuthor("RJ Salicco");
		item2.setTitle("The Title 2");
		item2.setContent("This is some incredible content. Realistically it is some great content.");
		
		Item item3 = new Item();
		item3.setId(new Long(3));
		item3.setAuthor("RJ Salicco");
		item3.setTitle("The Title 3");
		item3.setContent("This is some incredible content. Realistically it is some great content.");
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/list");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getItem(@PathVariable Long id) {
		
		Item item = new Item();
		item.setId(id);
		item.setAuthor("RJ Salicco");
		item.setTitle("The Title");
		item.setContent("This is some incredible content. Realistically it is some great content.");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/show");
		mav.addObject("item", item);
		return mav;
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView newItem() {
		Item item = new Item();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/create");
		mav.addObject("item", item);
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveItem(@Valid Item item, BindingResult result) {
		if(result.hasErrors()) {
			return newItem();
		}
		return getItems();
	}
}