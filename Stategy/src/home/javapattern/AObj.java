package home.javapattern;

public class AObj {

	
	Ainterface ainterface;//<1>
	
	/*
	 어떤 기능을 구현할때 그 책임을 다른 객체에 떠넘기는것, 다른 객체 기능을 빌려서 사용하는것
	 */
	public AObj() {
		ainterface = new Ainterfacelmp();
				//ainterface를 할당하는 소스  추가
	}
	
	// 어떤 AA라는 기능을 사용하기 위해서 Ainterface란 객체의 기능을 호출
	// 한마디로 위임하는 방식을 사용해서 구성
	public void funcAA(){
		
		
		ainterface.funcA();
		ainterface.funcA();
		/*
		 위와 아래는 동일한 기능
		 */
		
		//System.out.println("AAA");
		//System.out.println("AAA");
		
		
		//다른 사람이 ~ 기능이 필요합니다 개발해주세요 라고 해서 개발을 할때
		//개발해준것을 어디에 카피해서 복사 붙여넣기 해주나.
	}
}
