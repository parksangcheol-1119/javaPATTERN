
public class LgGramBluePrint extends BluePrint {

	//private Computer computer;
	
	
	private String cpu;
	private String ram;
	private String storage;
	
	public LgGramBluePrint() {
//		computer = new Computer("default","default","default");
	}
	@Override
	public void setCpu() {
		// TODO Auto-generated method stub
//		computer.setCpu("i7");
		cpu = "i7";
	}

	@Override
	public void setRam() {

//		computer.setCpu("8g");
		ram = "8g";
	}

	@Override
	public void setStorage() {

//		computer.setStorage("256g ssd");
		storage = "256g ssd";
	}
	
	public Computer getComputer() {
		return new Computer(cpu, ram, storage);
	}

}
