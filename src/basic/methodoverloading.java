package basic;

public class methodoverloading {
void operations() {
	int a=10,b=30;
	System.out.println("method with zero arguments:"+(a+b));
}
void operations(int a, int b) {
	System.out.println("method with zero arguments:"+(a+b));
}
void operaions(int a) {
	int c=20;
	System.out.println("method with zero arguments:"+(a+c));
}
void operations(float a) {
	int c=20;
	System.out.println("method with zero arguments:"+(a+c));
}
	public static void main(String[] args) {
		methodoverloading m1=new methodoverloading();
	m1.operations();
	m1.operations(12);
	m1.operations(12.34f);
	m1.operations(12, 34);
	}
	
	}

