
public class Ass1 {

	public int calculate(int a , int b){
				int c=0;
				c=(a+b);
				return c;
	}
	public int calculate(float d){
		double e=0;
		e=3.14*(d*d);
		int f=(int)e;
		return f;
	}
	public int calculate(long g, long h){
		long i=0;
		i=g*h;
		int in=(int)i;
		return in;
	}
	public int calculate(int m){
		return (m*m);
	}
	public static void main(String args[]){
		Ass1 p=new Ass1();
		int k=p.calculate(3,4);
		int l=p.calculate(3.0345F);
		int n=p.calculate(3L,4L);
		int o=p.calculate(3);
		System.out.println("Add two numbers : "+k);
		System.out.println("area of circle : "+l);
		System.out.println("area of rectangle : "+n);
		System.out.println("area of square : "+o);
		
	}
}
