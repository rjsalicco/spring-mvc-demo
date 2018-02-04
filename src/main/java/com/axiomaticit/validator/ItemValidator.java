package com.axiomaticit.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.axiomaticit.model.Item;

public class ItemValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Item.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Item item = (Item) target;
		
		if(item.getAuthor() == null || item.getAuthor().length() < 1)
			errors.rejectValue("author", "item.author.empty.error");
		
		if(item.getContent() == null || item.getContent().length() < 1)
			errors.rejectValue("content", "item.content.empty.error");
			
		if(item.getContent() == null || item.getContent().length() < 10)
			errors.rejectValue("content", "item.content.min.error");
			
		if(item.getContent() == null || item.getContent().length() > 50)
			errors.rejectValue("content", "item.content.max.error");
		
		if(item.getTitle() == null || item.getTitle().length() < 1)
			errors.rejectValue("title", "item.title.empty.error");
	}
}