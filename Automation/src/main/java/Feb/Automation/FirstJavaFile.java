package Feb.Automation;

import inheritanceConcept.Mother;
import inheritanceConcept.Sister;

public class FirstJavaFile extends Sister{

	public void student1() {
		System.out.println("java");
	}
	
  public void student2() {
		System.out.println("java1");

	}

   public void student3() {
		System.out.println("java2");

   }

   public void student4() {
		System.out.println("java3");

   }

public void student100() {
	System.out.println(129-5);

}

public static void main(String args[]) {
	FirstJavaFile objName = new FirstJavaFile();
	
	objName.multilevel();
	
}
}
