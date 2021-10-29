package home.javapattern;

public class GameMain {

	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		
		character.attact();
		
		character.setWeapon(new Knife());
		character.attact();

		character.setWeapon(new Sword());
		character.attact();
		

		//character.setWeapon(new Knife());
		//character.attack();

	}

}
