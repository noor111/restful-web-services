package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.in28minutes.rest.webservices.restfulwebservices.filtering.SomeDynamicBean;

@RestController
public class DynamicFilteringController {
	
	@GetMapping("/filtering-dynamic")
	public MappingJacksonValue retrieveSomeBean() {
		SomeDynamicBean someBean = new SomeDynamicBean("value1","value2","value3");		
		MappingJacksonValue mapping = doGenericFiltering(someBean, new String[]{"field1","field2"}, "SomeBeanFilter");		
		return mapping;
	}
	
	@GetMapping("/filtering-dynamic-list")
	public MappingJacksonValue retrieveListOfSomeBean() {
		
		List<SomeDynamicBean> list = Arrays.asList(new SomeDynamicBean("value1","value2","value3"), new SomeDynamicBean("value4","value5","value6"));						
		MappingJacksonValue mapping = doGenericFiltering(list, new String[]{"field2","field3"}, "SomeBeanFilter");
		return mapping;
	}
	
	private MappingJacksonValue doGenericFiltering(Object mappingValue, String[] fieldNames, String filterName) {
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fieldNames);		
		FilterProvider filters = new SimpleFilterProvider().addFilter(filterName, filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(mappingValue);
		mapping.setFilters(filters);
		return mapping;		
	}

}
