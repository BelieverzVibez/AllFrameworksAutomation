package controlStatement;

public class SwitchCaseConcept {
	public static void main(String[] args) {
		int year =1990;
		switch(year) {
			
		case 1991:
			System.out.println("its not my birth year");
			break;
			
		case 1990:
			System.out.println("my birth year");
			break;
			
		case 1995:
			System.out.println("dddd");
			break;
			
		case 1996:
			System.out.println("aaa");
			break;
			
			default :
				System.out.println("default");
		}
	}
}
