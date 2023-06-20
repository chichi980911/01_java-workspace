package com.kh.part01_stream.model.vo;

public class StreamPrac {
	private String name;
	private String city;
	
	public StreamPrac() {
		
	}

	public StreamPrac(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StreamPrac [name=" + name + ", city=" + city + "]";
	}
	
}
