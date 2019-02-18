
public class IF_Else_Ladder {
public static void main(String[] args) {
	int a=0;
	int b=20;
	int c=30;
	if(a>b && a>c) {
		System.out.println("the greatest number is a");
	}
	else if(b>a && b>c)
		System.out.println("the greatest number id b");
	else {
		System.out.println("the gretaest number is c");
	}
}
}
