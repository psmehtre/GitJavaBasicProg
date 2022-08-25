
public class Helloworld {

	public static void main(String[] args) {
		
		child c = new child();
		c.a();
		c.b();
		c.c();

		child1 k = new child1();
		k.d();
		k.e();
	}

}
interface abc{
	void a();
	void b();
	void c();
}

interface abc2{
	void a();
}
class child implements abc,abc2{

	@Override
	public void a() {
		System.out.println("this is A method with 100% abstraction");
	}

	@Override
	public void b() {
		System.out.println("this is B method with 100% abstraction");
		
	}

	@Override
	public void c() {
		System.out.println("this is C method with 100% abstraction");
	}
	
}

abstract class abstract1{
	abstract void d();
	abstract void e();
	
}

abstract class abstract2{
	abstract void d();
	abstract void e();
	
}
class child1 extends abstract1{

	@Override
	void d() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void e() {
		// TODO Auto-generated method stub
		
	}
	
}