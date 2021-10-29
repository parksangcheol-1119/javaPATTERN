package home.javapattern;


public class index {

	/*
	 	학습 목표
	 	
	 	인터페이스 개념을 이해한다.
	 		사전적 의미  : 키보드나 디스플레이 따위처럼 사람과 컴퓨터를 연결하는 장치
	 		
	 			두 객체간을 연결하는 접점을 인터페이스라고 볼 수 있다.
	 			
	 			기능에 대한 선언과 구현 분리 = 선언은 따로 하고 구현은 다른 파일에서 구현한다.
	 			
	 			기능을 사용하는 통로 
	 	
	 	
	 	
	 	델리게이트 개념을 이해한다
	 		사전적 의미 : 위임하다.
	 		
	 			코드에서는 떠넘기다. 두 객체와의 관계에서 델리게이트라 한다.
	 			어떤 기능을 구현할때 그 책임을 다른 객체에 떠넘기는것, 다른 객체 기능을 빌려서 사용하는것
	 	
	 	
	 	
	 	
	 	
	 	전략패턴 개념을 이해한다.
	 	(스트레지티 패턴)
	 		: 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
	 						기본 설계
	 		
	 		Client
	 	strategy: Strategy 
	 						↖
	 							Strategy
	 						AbstractAlgorithm():void
	 					↗			↑				↖
	 		StrategyA				↑				StrategyC
	 	AbstractAlgorithm():void	↑			AbstractAlgorithm():void
	 								↑
	 							StrategyB
	 						AbstractAlgorithm():void
	 		
	 		
	 		
	 		예를 들면 
	 		
	 		요구사항 :
	 			신작 게임에서 캐릭터와 무기를 구현해보세요
	 			무기는 두가지 종류가 있습니다.
	 			
	 			칼
	 			
	 			검
	 			
	 */
}
