package com.te.springcoreannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Octa implements Processer {

	@Override
	public void os() {
     System.out.println("it is a Octa core Processer");		
	}

	@Override
	public String toString() {
		return "it is a Octa core Processerr";
	}

	

	

	 
}