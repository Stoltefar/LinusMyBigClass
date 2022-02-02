import org.junit.jupiter.api.Test;

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
}
