import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString0()
    {

        if (getClassString().contains("Hello")) {
            System.out.println("testGetClassString0: Yay! Test passed! There is 'Hello' in the string: " + getClassString());
        } else if (getClassString().contains("hello")) {
            System.out.println("testGetClassString0: Yay! Test passed! There is 'hello' in the string: " + getClassString());
        } else {
            System.out.println("testGetClassString0: Wrong! Test Failed. There is no 'hello' or 'Hello' in the string: " + getClassString());
        }
    }

    @Test
    public void testGetClassString1()
    {
        boolean hello;

        if (getClassString().contains("Hello")) {
            hello = true;
        } else if (getClassString().contains("hello")) {
            hello = true;
        } else {
            hello = false;
        }

        Assert.assertTrue("testGetClassString1: Wrong! Test Failed. There is no 'hello' or 'Hello' in the string: " + getClassString(), hello==true);
    }
}

