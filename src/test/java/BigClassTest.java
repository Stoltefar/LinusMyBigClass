import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BigClassTest {

    BigClass testObject;

    @Test
    public void testConstructor1() {
        testObject = new BigClass();
        assertInstanceOf(BigClass.class,testObject);
    }
    @Test
    public void testConstructor2() {
        testObject = new BigClass(20);
        assertInstanceOf(BigClass.class,testObject);
    }
    @Test
    public void testConstructor3() {
        testObject = new BigClass(30,"Hej");
        assertInstanceOf(BigClass.class,testObject);
    }
    @Test
    public void testConstructor4() {
        testObject = new BigClass("Hej");
        assertInstanceOf(BigClass.class,testObject);
    }
    @Test
    public void testSetNumber() {
        testObject = new BigClass();
        testObject.setNumber(10);
        int actual = testObject.getNumber();

        int expected = 10;
        assertEquals(actual,expected);
    }
    @Test
    public void testGetNumber() {
        testObject = new BigClass();
        int expected = 0;
        int actual = testObject.getNumber();

        assertEquals(actual, expected);
    }
    @Test
    public void testNegativeNumber() {
        testObject = new BigClass();
        testObject.setNumber(-1);
        int actual = testObject.getNumber();
        int expected = 0;

        assertEquals(actual,expected);
    }
    @Test
    public void checkSetText() {
        testObject = new BigClass();
        testObject.setText("hej");
        String expected = "hej";
        String actual = testObject.getText();

        assertEquals(actual, expected);
    }
    @Test
    public void checkGetText() {
        testObject = new BigClass();

        String actual = testObject.getText();
        String expected = null;

        assertEquals(actual,expected);
    }

    @Test
    public void checkTextToUpperCase() {
        testObject = new BigClass("kanskelitetext");
        testObject.textToUppercase();
        String actual = testObject.getText();
        String expected = "KANSKELITETEXT";

        assertEquals(actual,expected);
    }

}
