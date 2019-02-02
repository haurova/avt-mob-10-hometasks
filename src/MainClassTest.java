import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    public int returned = getClassNumber();

    @Test
    public void testGetClassNumber0()
    {
        if (returned > 45) {
            System.out.println("testGetClassNumber0: Check passed! getClassNumber returns " + returned + ", which is more than 45");
        } else {
            System.out.println("testGetClassNumber0: Check failed! getClassNumber returns " + returned + ", which is less than 45.");
        }
    }

    @Test
    public void testGetClassNumber1()
    {
        Assert.assertTrue("testGetClassNumber1: Check failed! getClassNumber returns" + returned + ", which is less than 45.",returned > 45);
    }
}