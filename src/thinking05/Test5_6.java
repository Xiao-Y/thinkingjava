package thinking05;

/**
 * 初始值
 * 
 * @author XiaoY
 * @date: 2015年10月9日 下午9:35:59
 */
public class Test5_6 {

	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	public void printIntitalValue(){
		System.out.println("boolean-->" + t);//false
		System.out.println("char-->" + c);//[]
		System.out.println("byte-->" + b);//0
		System.out.println("int-->" + i);//0
		System.out.println("long-->" + l);//0
		System.out.println("float-->" + f);//0.0
		System.out.println("double-->" + d);//0.0
	}
	
	public static void main(String[] args) {
		Test5_6 t = new Test5_6();
		t.printIntitalValue();
	}
}
