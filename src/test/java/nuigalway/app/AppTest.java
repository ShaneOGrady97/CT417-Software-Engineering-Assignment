package nuigalway.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
    	Student s1 = new Student("Joe",21,"12/12/1997","16000000");
		String studentTest= "Joe21";
        assertTrue( s1.getID().equals(studentTest) );
    }
}
