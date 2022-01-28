import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass _mainClassObject = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int actualNumber = _mainClassObject.getLocalNumber();

        int expectedNumber = 14;

        Assert.assertEquals("Expected number is not equals to actual", expectedNumber, actualNumber);
    }

    @Test
    public void testGetClassNumber()
    {
        int actualNumber = _mainClassObject.getClassNumber();

        int conditionNumber = 45;

        Assert.assertTrue("Actual number " + actualNumber + " is not more than: " + conditionNumber, actualNumber > conditionNumber);
    }

    @Test
    public void testGetClassString()
    {
        String actualString = _mainClassObject.getClassString();

        boolean conditionResult = MainClass.containsWords(actualString, new String[]{"hello", "Hello"});

        Assert.assertTrue("Actual string value '" + actualString + "' doesn't contain words 'hello' or 'Hello'", conditionResult);
    }
}
