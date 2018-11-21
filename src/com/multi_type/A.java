class A {
    public String run(D obj) {
        return ("A & D");
    }

    public String run(A obj) {
        return ("A & A");
    }



}
class B extends A {
    public String run(B obj) {
        return ("B & B");
    }
    public String run(A obj) {
        return ("B & A");
    }
}
class C extends B {}
class D extends B {}


//注意：优先级从高到低：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
class Test {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("1--" + aa.run(b));
        System.out.println("2--" + aa.run(c));
        System.out.println("3--" + aa.run(d));

// 4中 ab 在编译时取决于左边 A 的类型，运行时为右边 B 的类型，
// 所以编译时包含了参数为 A、D 的 run 方法，而运行时传递给 run 方法的参数类型为 B，
// 所以对应的方法为 A 类中参数为 A 类型的 run 方法，
// 而由于 ab 在运行时右侧的 B 类中重写了 A 类中参数为 A 类型的 run 方法，
// 所以运行时最终执行了 B 类中重写的参数为 A 类型的 run 方法（所以类 B 中参数为 B 的 run 方法其实是 B 类特有的重载方法，而不是重写方法）
        System.out.println("4--" + ab.run(b));

// 5中 ab 在编译时取决于左边 A 的类型，运行时为右边 B 的类型，所以编译时包含了参数为 A、D 的 run 方法，而运行时传递给 run 方法的参数类型为 C，C 又最终继承自 A，
// 所以对应的方法为 A 类中参数为 A 类型的 run 方法，而由于 ab 在运行时右侧的 B 类中重写了 A 类中参数为 A 类型的 run 方法，
// 所以运行时最终执行了 B 类中重写的参数为 A 类型的 run 方法（所以类 B 中参数为 B 的 run 方法其实是 B 类特有的重载方法，而不是重写方法）。
        System.out.println("5--" + ab.run(c));

        System.out.println("6--" + ab.run(d));

        System.out.println("7--" + b.run(b));

        System.out.println("8--" + b.run(c));

        System.out.println("9--" + b.run(d));
    }
}
