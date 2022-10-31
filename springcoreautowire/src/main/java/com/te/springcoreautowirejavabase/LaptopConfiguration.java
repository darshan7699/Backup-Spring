		package com.te.springcoreautowirejavabase;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LaptopConfiguration {
	@Bean(autowire = Autowire.BY_NAME)
	public Laptop getLaptop() {
		Laptop laptop = new Laptop();
		//Screen screen = new Screen();
		laptop.setName("Hp");
		laptop.setOs("Ryzen");
		laptop.setPrice(43000);
		//laptop.setSc(screen);
	
		return laptop;
	}
	@Bean(name="sc")
	public Screen getScreen() {
		Screen screen = new Screen();
		screen.setDisplay("1080px");
		screen.setHeight(25);
		screen.setResolution("HD");
		return screen;
		
	}
	@Bean
	@Scope
	public Screen getScreen1() {
		Screen screen = new Screen();
		screen.setDisplay("Amoled");
		screen.setHeight(25);
		screen.setResolution("1200PX");
		return screen;
		
	}

}