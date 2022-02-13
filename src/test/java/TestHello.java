import static org.junit.Assert.*;

import name.gieffe.Hello;
import org.junit.Before;
import org.junit.Test;

public class TestHello {

    private Hello hello;

    @Before
    public void setup() {
        hello = new Hello();
    }

    @Test
    public void helloShouldIncludeTheOneBeingGreeted() {
        String s = "World";
        assertTrue(hello.greet(s).contains(s));
    }

    @Test
    public void helloShouldIncludeGreetingPhrase() {
        String s = "World";
        assertNotSame(hello.greet(s), s);
    }
}
