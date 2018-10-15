public class Hello {
    public static String hello() {
        return "Hello";
    }

    public static String helloAge(int age) {

        System.out.println("branch master");
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        return String.format("Hello, %d", age);
    }
}
