package com.te.springcoreannotation;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processer {

	@Override
	public void os() {
      System.out.println("That is snapdragon processor");		
	}

	@Override
	public String toString() {
		return "That is snapdragon processor";
	}

}
