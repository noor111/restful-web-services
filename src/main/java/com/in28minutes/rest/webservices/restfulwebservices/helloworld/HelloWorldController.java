package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean(messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale()), null);
	}
	
	@GetMapping(path="/hello-world/name/{name}/groceryitems/{groceryitems}")
	public HelloWorldBean helloWorldBeanGrocery(@PathVariable String name,
										@PathVariable String groceryitems) {
		logger.info("====> Entering helloWorldBeanGrocery: name: {}  grocery: {}", name, groceryitems);
		return new HelloWorldBean(String.format(messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale()) + ", %s", name),
								"foot");
	}

}
