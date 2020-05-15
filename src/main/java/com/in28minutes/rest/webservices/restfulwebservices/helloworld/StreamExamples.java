package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamExamples {
	
	public static List<String> streamfilterExample(List<String> playWords) {	
		System.out.println("substring of confusing: " + new String("confusing").substring(0, 3));
		List<String> filtered = playWords.stream().filter(playWord -> !playWord.substring(0, 3).equalsIgnoreCase("con")).collect(Collectors.toList());
		return filtered;
	}
	
	public static List<Long> filterUniqueElements(List<Long> numbers) {
		
		List<Long> squaresData = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		return squaresData;		
	}
	
	public static List<ImageSensor> streamPipeline1(List<ImageSensor> imageSensors) {
		
		List<ImageSensor> filteredImageSensors = imageSensors
													.stream()
													.filter(imageSensor -> imageSensor.getElevation() <= 8000)
													.sorted((imageSensor1, imageSensor2) -> {
														return imageSensor1.getId().compareTo(imageSensor2.getId());
													}).
													collect(Collectors.toList());
		return filteredImageSensors;
	}
	
	public static Integer getMaxInteger(List<Integer> integers) {
		
		Integer latestEmpId = integers.stream()
				.max(Integer::compare).get();
		return latestEmpId;
	}
	
	/*
	public static<ImageSensor> getMaxInteger(List<ImageSensor> imageSensors) {
		
		Integer latestEmpId = imageSensors.stream()
				.max(Comparator.comparingLong(ImageSensor::getId))
				.orElseThrow(NoSuchElementException::new);;
	}
	*/

}
