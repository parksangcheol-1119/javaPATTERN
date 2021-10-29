package com.home.framework;

public abstract class ItmeCreator {

	public Item create() {
		
		
		
		Item item;
		//step 1
		requestItemsInfo();
		//step2
		item = createItem();
		//step 3
		createItemLog();
		return item;
	}
	
	//아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.
	abstract protected void requestItemsInfo();
	
	//아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성 로그를 남긴다,
	abstract protected void createItemLog();
	
	//아이템을 생성하는 알고르짐
	abstract protected Item createItem();
}
