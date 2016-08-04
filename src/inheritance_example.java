
abstract class base {
	int base=10;
	base(){
		System.out.println("I am in base");
	}
	
	abstract int base_method(int a);

}

class derived extends base {
	int derived=20;
	derived(){
		System.out.println("I am in derived");
	}
	//@Override
	int base_method(int a) {
		// TODO Auto-generated method stub
		
		return a+5;
	}
}


public class inheritance_example {

	public inheritance_example() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived d = new derived();
		int res = d.base_method(5);
		System.out.println(d.derived);
		
		base b = new derived();
		res = b.base_method(15);
		System.out.println(b.base);
	}

}
