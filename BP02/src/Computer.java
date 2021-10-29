
public class Computer {

	
	private String cpu;
	private String ram;
	private String storage;
	
	/**
	 * 
	 * @param cpu 씨피유입니다.
	 * @param ram 램입니다.
	 * @param storage 저장소입니다
	 */
	
	public Computer(String cpu, String ram, String storage) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {//객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
								// String 클래스 객체의 toString메소드는 자신이 가진 값을 그대로 리턴
								// File 클래ㅡ 객체의 toString메소드는 자신이 가진 해당 경로값을 리턴
		return cpu+","+ram+","+storage;
	}
}
