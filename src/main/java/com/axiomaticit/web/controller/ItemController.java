package com.axiomaticit.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.MessageSource;

import com.axiomaticit.dao.Dao;
import com.axiomaticit.model.Item;
import com.axiomaticit.validator.ItemValidator;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private Dao<Item> daoImpl;
	@Autowired
	private MessageSource messageSource;
	
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
		
		List<Item> items = (List<Item>) daoImpl.getAll(Item.class);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/list");
		mav.addObject("items", items);
		return mav;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getItem(@PathVariable String id) {
		
		Item item = new Item();
		item.setId(id);
		item = (Item) daoImpl.getById(item);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/show");
		mav.addObject("item", item);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editItem(@PathVariable String id) {
		
		Item item = new Item();
		item.setId(id);
		item = (Item) daoImpl.getById(item);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("item/edit");
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
			ModelAndView mav = new ModelAndView();
			mav.setViewName("item/create");
			mav.addObject("item", item);
			return mav;
		}
			
		daoImpl.save(item);
		
		return getItems();
	}
	
	public void setDaoImpl(Dao<Item> daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}