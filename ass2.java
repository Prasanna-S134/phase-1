//19.07.2022 Assignment2
public class ass2 {
	ass2(){
		System.out.println("default is printed");
		String s="the value is:";
	}
	ass2(int d){
		int a=d;
		areasquare(a);
	}
	ass2(int l,int b){
		int a=l,c=b;
		arearec(a,c);
	}
	ass2(float l){
		float a=l;
		areacir(a);
	}
	void areasquare(int f){
		int are=f*f;
		System.out.println("value of square "+are);
	}
	void arearec(int f,int l){
		int are=f*f;
		System.out.println("value of rectangle "+are);
	}
	void areacir(float f){
		float are = f*f*3.14F;
		System.out.println("value of circle "+are);
	}
	void arearob(int r,int s){
		int are=r*s/2;
		System.out.println("value of rombus "+are);
	}
	void areatri(float b,float h){
		float are=b*h/2;
		System.out.println("value of triangle "+are);
	}
	public static void main(String[] args) {
		ass2 s=new ass2();
		ass2 s1=new ass2(3);
		ass2 s2=new ass2(2,8);
		ass2 s3=new ass2(4.5F);
		ass2 s4=new ass2();
		s4.arearob(10, 20);
		s4.areatri(10.0F, 20.0F);

	}

}
