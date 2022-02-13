package name.gieffe;

/**
 * This is a class.
 */
public class Hello {
    /**
     * This is a constructor.
     */
    public Hello() {
    }

    /**
     * Greet a person or an object.
     *
     * @param s who/what you want greet
     * @return a String with your greeting
     */
    public String greet(String s) {
        return String.format("Hello, %s!", s);
    }
}
