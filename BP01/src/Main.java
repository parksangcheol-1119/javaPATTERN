
public class Main {

	public static void main(String[] args) {

		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBluePrint(new LgGramBluePrint());
		
		//factory.setBlueprint(new MacAirBlueprint());
		//factory.setBlueprint(new SonyBlueprint());
		//Computer computer = factory.makeAndGet();
		
		factory.make();
		
		Computer computer =  factory.getComputer();
		
		//Computer computer = new Computer("i7", "16g", "256g ssd");
		
		System.out.println(computer.toString());
	}

}
