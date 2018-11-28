class JBT {
	int variable = 5;
	public static void main(String args[]) {
		JBT obj = new JBT();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println("Value of variable :" + variable);
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}
}
