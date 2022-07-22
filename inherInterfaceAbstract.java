public class inherInterfaceAbstract {
    public static void main(String[] ar) {
        A ob = new B();
        B ob1 = new B();
        ob.run();
        // ob1.run();
        ob1.run2();
    }
}

abstract class C {
    public abstract void run2();
}

interface A {
    /*
     * no need to add abstract keyword as any method declared inside an
     * interface is by default a public abstract method.
     */

    void run();
}

class B extends C implements A {
    public void run() {
        System.out.println("hi B 1");
    }

    public void run2() {
        System.out.println("hi B 2");
    }
}
