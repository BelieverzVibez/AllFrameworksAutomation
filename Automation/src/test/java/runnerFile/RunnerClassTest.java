package runnerFile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="E:\\Selenium\\Believerz\\Automation\\src\\test\\java\\FeatureFiles\\facebook.feature",
glue="stepDefinitions",
plugin= {"pretty","html:E:\\Selenium\\Believerz\\Automation\\CucumberHtmlReports\\"},
tags= {"@aravind"},  dryRun=false, monochrome=true, strict = true, snippets=SnippetType.CAMELCASE
)
public class RunnerClassTest {
	 private TestNGCucumberRunner testNGCucumberRunner;
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();   
	    }
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
}
