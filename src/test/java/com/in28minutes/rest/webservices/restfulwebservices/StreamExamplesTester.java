package com.in28minutes.rest.webservices.restfulwebservices;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.ImageSensor;
import com.in28minutes.rest.webservices.restfulwebservices.helloworld.StreamExamples;

public class StreamExamplesTester {
	
	@Test
	public void streamFilterTest() {
		
		List<String> playWords = Arrays.asList("adjudicate", "abductions", "confusing", "obliterate", "pronunciate", "decorate");
		List<String> filtered = StreamExamples.streamfilterExample(playWords);
		assertTrue(filtered.size() == 5);
		
	}
	
	@Test
	public void filterUniqueElementsTests() {
		List<Long> numbers = Arrays.asList(6L,3L,6L,8L,5L,9L,9L,3L,4L,2L);
		List<Long> filtered = StreamExamples.filterUniqueElements(numbers);
		System.out.println("Size of distinct longs: " + filtered.size());
		assertTrue(filtered.size() == 7);
	}
	
	@Test
	public void pipelineTest1() {
		List<ImageSensor> imageSensors = buildImageSensorData();
		System.out.println("Size of image sensor data: " + imageSensors.size());
		List<ImageSensor> filteredImageSensors = StreamExamples.streamPipeline1(imageSensors);
		System.out.println("Size of filtered image sensor data: " + filteredImageSensors.size());
		assertTrue(filteredImageSensors.size() == 3);
	}
	
	@Test
	public void maxIntegerTest1() {
		List<Integer> integers = Arrays.asList(5,8,25,43,16,92,57,77,43,83);
		Integer maxInteger = StreamExamples.getMaxInteger(integers);
		System.out.println(String.format("Max Integer: %d", maxInteger));
		assertTrue(maxInteger == 92);
	}
	
	@Test
	public void maxIntegerTest2() {
		List<ImageSensor> imageSensors = buildImageSensorData();
		
	}
	
	public List<ImageSensor> buildImageSensorData() {
		
		List<ImageSensor> imageSensors = new ArrayList<ImageSensor>();
		
		ImageSensor imageSensor = new ImageSensor();
		imageSensor.setId(1001L);
		imageSensor.setElevation(24000D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(43.748D);
		
		imageSensors.add(imageSensor);
		
		imageSensor = new ImageSensor();
		imageSensor.setId(1002L);
		imageSensor.setElevation(4000D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(72.821D);
		
		imageSensors.add(imageSensor);
		
		imageSensor = new ImageSensor();
		imageSensor.setId(1003L);
		imageSensor.setElevation(13000D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(110.203D);
		
		imageSensors.add(imageSensor);
		
		imageSensor = new ImageSensor();
		imageSensor.setId(1004L);
		imageSensor.setElevation(4900D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(81.211D);
		
		imageSensors.add(imageSensor);
		
		imageSensor = new ImageSensor();
		imageSensor.setId(1005L);
		imageSensor.setElevation(24000D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(19.983D);
		
		imageSensors.add(imageSensor);
		
		imageSensor = new ImageSensor();
		imageSensor.setId(1006L);
		imageSensor.setElevation(7210D);
		imageSensor.setWidth(600D);
		imageSensor.setReading(30.326D);
		
		imageSensors.add(imageSensor);
		
		return imageSensors;
		
		
	}

}
