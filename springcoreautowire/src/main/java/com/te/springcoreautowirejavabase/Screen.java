package com.te.springcoreautowirejavabase;

public class Screen {
 private int height;
 private String resolution;
 private String display;
 
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getResolution() {
	return resolution;
}
public void setResolution(String resolution) {
	this.resolution = resolution;
}
public String getDisplay() {
	return display;
}
public void setDisplay(String display) {
	this.display = display;
}
@Override
public String toString() {
	return "Screen [height=" + height + ", resolution=" + resolution + ", display=" + display + "]";
}
 
 
	
	
}