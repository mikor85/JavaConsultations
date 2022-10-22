package Consult20220917;

public class Test {

    int myAge;

    public Test(int age) {
        this.myAge = age;
    }

    public static void main(String[] args) {
        Test ivan = new Test(1);
        Test bulat = new Test(2);
        Test nazar = new Test(3);

        String first = "hello";
        String second = "world";

        concatenate(first, second);

        concatenate(second, first);

        concatenate("asd", "qwe");
    }

    public static void concatenate(String a, String b) {
        String c = a + b;
        System.out.println(c);
    }
}
