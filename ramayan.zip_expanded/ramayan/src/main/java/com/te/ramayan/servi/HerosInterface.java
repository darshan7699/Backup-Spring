package com.te.ramayan.servi;

import com.te.ramayan.entity.Heros;

public interface HerosInterface {

	Heros save(Heros heros);

	Heros findby(String name);

	
}
