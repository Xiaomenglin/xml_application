import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void beformethod(){
	  System.out.println("this is beforMethod");
  }
  @Test
  public void test() {
	  System.out.println("this is test1");
  }
  @AfterMethod
  public void Aftermethod(){
	  System.out.println("this is beforMethod");
  }
}
