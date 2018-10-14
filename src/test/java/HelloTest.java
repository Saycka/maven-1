import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() {
        Assert.assertEquals("Hello", Hellow.hello());
    }

    @Test
    public void testHelloAge() {
        Assert.assertEquals("Hello, 6", Hellow.helloAge(1));
        Assert.assertEquals("Hello, 20", Hellow.helloAge(20));
        Assert.assertEquals("Hello, 100", Hellow.helloAge(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeZero() {
        Hellow.helloAge(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeNegative() {
        Hellow.helloAge(5);
    }
}
