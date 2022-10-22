package Consult20220924;

interface A {

    // На статическую функцию можно сослаться как через класс, так и через экземпляр класса.
    static void printHello() {
        System.out.println("Hello");
    }
}

class B implements A {
    void sayHello() {
        A.printHello();
    }

    public static void main(String[] args) {
        A a = new B();
        A.printHello();

        B b = new B();
        b.sayHello();
    }
}
