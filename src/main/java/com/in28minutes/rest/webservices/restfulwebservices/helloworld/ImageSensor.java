package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class ImageSensor {
	
	private Long id;
	private Double elevation;
	private Double width;
	private Double reading;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getElevation() {
		return elevation;
	}
	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getReading() {
		return reading;
	}
	public void setReading(Double reading) {
		this.reading = reading;
	}

}
