
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012,3));
		
		
		Cat yo = navi.copy();
		yo.setName("yo");
		//yo.setAge(new Age(2013,32));
		yo.getAge().setYear(2013);
		yo.getAge().setValue(2);
		
		
		System.out.println(navi.getName());//Cat@ee7d9f1
		System.out.println(navi.getAge().getYear());//2012
		
		
		System.out.println(yo.getName());//Cat@ee7d9f1
		System.out.println(yo.getAge().getYear());//2013
		
		System.out.println(navi.getAge().getValue());//2
		System.out.println(yo.getAge().getValue());//2
	}

}
