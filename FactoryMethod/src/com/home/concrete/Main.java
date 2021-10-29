package com.home.concrete;

import com.home.framework.Item;
import com.home.framework.ItmeCreator;

public class Main {

	public static void main(String[] args) {
		ItmeCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		
		creator = new MpCreator();
		creator.create();

	}

}
