package linux;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class LinuxGuiFac implements GuiFac{

	@Override
	public Button createButton() {
		//리눅스 관련된 네이티브 소스에서 버튼을 어떻게 구현할지 소스가 들어가는곳
		
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
			
		}

}
