package TestNGConcept;
import org.testng.annotations.Test;
public class FailedTest {
	@Test(groups="all")
	public void retry() {
		System.out.println("all");
	}
	
	@Test(groups="all")
	public void retryiu() {
		System.out.println("smk test");
	}
	
	@Test
	public void retrydiu() {
		System.out.println("all 2");
	}
	
	@Test
	public void retryidu() {
		System.out.println("regression");
	}
	
	@Test
	public void retrssyidu() {
		System.out.println("regress smoke");
	}
}