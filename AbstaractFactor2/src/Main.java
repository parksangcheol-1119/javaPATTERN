import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import linux.LinuxGuiFac;
import mac.MacGuiFac;

public class Main {

	public static void main(String[] args) {
/*
		GuiFac fac = new LinuxGuiFac();
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
	
		button.click();//버튼에는 click를 만들어놨으니까. 이 부분 없으면 위 버튼부분 오류
		System.out.println(area.getText());//getText = 텍스트박스 내 문자열을 가져오는 메소드
	*/	
		

		GuiFac fac = new MacGuiFac();//이렇게 하면 맥부분을 가져온다.
		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
	
		button.click();//버튼에는 click를 만들어놨으니까. 이 부분 없으면 위 버튼부분 오류
		System.out.println(area.getText());//getText = 텍스트박스 내 문자열을 가져오는 메소드
	}

}
