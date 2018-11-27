
public class calci implements calculator {
	
	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int res=a+b;
		System.out.println(res);
	}

	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		int res=a-b;
		System.out.println(res);
	}

	@Override
	public void multipy(int a, int b) {
		// TODO Auto-generated method stub
		int res=a*b;
		System.out.println(res);
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		int res=a/b;
		System.out.println(res);
	}

public static void main(String[] args) {
	
int a=10,b=10;
calci c=new calci();
c.add(a, b);
c.subtract(a, b);
c.multipy(a, b);
c.divide(a,b);
}}