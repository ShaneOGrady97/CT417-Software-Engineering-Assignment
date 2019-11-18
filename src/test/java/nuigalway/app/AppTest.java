package nuigalway.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
<<<<<<< HEAD:src/test/java/nuigalway/app/AppTest.java
    	Student s1= new Student("Joe",21,"12/12/1997", "16000000");
=======
    	Student s1 = new Student("Joe",21,"12/12/1997","16000000");
>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e:src/test/java/nuigalway/app/AppTest.java
		String studentTest= "Joe21";
        assertTrue( s1.getID().equals(studentTest) );
    }
}
