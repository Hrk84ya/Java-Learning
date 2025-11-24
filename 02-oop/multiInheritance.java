//Multiple inheritance using interface
interface A {
    void a();
}
interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("a");
    }
    public void b() {
        System.out.println("b");
    }
}

class multiInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
    }
}