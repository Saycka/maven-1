public class Hello {
    public static String hello() {
        return "Hello";
    }

    public static String helloAge(int age) {

        System.out.println("no branch");
        System.out.println("branch 2");
        if (age <= 0) {
            throw new IllegalArgumentException();
        }
        return String.format("Hello, %d", age);
    }
}
