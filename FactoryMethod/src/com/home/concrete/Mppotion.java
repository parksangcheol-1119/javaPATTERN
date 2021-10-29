package com.home.concrete;

import com.home.framework.Item;

public class Mppotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복!");
	}
}
