import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber0()
    {
        if (getLocalNumber == 14) {
            System.out.println("testGetLocalNumber0: Correct! getLocalNumber equals 14: " + getLocalNumber);
        } else {
            System.out.println("testGetLocalNumber0: Error! getLocalNumber is not equal 14: " + getLocalNumber);
        }
    }

    @Test
    public void testGetLocalNumber1()
    {
        Assert.assertTrue( "testGetLocalNumber1: Error! getLocalNumber is not equal 14! It's value is " + getLocalNumber ,getLocalNumber == 14);
    }
}