public class Animal{
	
	int num = 10;
	
	static int age = 20;
	
	public void eat (){
		System.out.println("Animal is eating");
		}

	public static void sleep(){
		System.out.println("Animal is sleeping");
	}
}

class Cat extends Animal{

	int num = 100;

	static int age = 200;

	@Override
	public void eat (){
		System.out.println("Cat is eating");
	}

	public static void sleep(){
		System.out.println("Cat is sleeping");
	}

}
class Test_Demo {
	public static void main(String[] args) {

		// 父类的引用指向子类 (向上应用类型)
		Animal am = new Cat();

		// 成员方法：编译看左，运行看右（因为普通成员方法可以重写，变量不可以）；
		am.eat();

		// 静态方法：编译看左，运行看左（因为属于类）；
		am.sleep();

		// 成员变量：编译看左，运行看左（因为无法重写）；
		System.out.println(am.num);

		//同上,成员变量
		System.out.println(am.age);
	}
}
