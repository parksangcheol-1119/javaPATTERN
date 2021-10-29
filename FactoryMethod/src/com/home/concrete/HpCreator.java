package com.home.concrete;

import java.util.Date;

import com.home.framework.Item;
import com.home.framework.ItmeCreator;

public class HpCreator extends ItmeCreator{

	
	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 회복 물약의 정보를 가져옵니다.");
	}
	
	protected void createItemLog() {
		System.out.println("회복 물약을 새로 생성 했습니다"+ new Date());
	}
	
	@Override
	protected Item createItem() {
		//작업
		return new Hppotion();
	}
}
