package com.te.springcoreannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Value("64 Mega Pixel")
	private String pixel;
	@Value("Sony")
	private String lense;
	@Value("4")
	private int camras;

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public String getLense() {
		return lense;
	}

	public void setLense(String lense) {
		this.lense = lense;
	}

	public int getCamras() {
		return camras;
	}

	public void setCamras(int camras) {
		this.camras = camras;
	}

	@Override
	public String toString() {
		return "Camera [pixel=" + pixel + ", lense=" + lense + ", camras=" + camras + "]";
	}
	

}
