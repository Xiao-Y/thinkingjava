package thinking05;


/**
 * 非静态测试
 * 
 * @author XiaoY
 * @date: 2015年10月9日 下午10:20:49
 */
public class Test5_7_4_Mugs {

	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}

	Test5_7_4_Mugs() {
		System.out.println("Mugs()");
	}

	Test5_7_4_Mugs(int i) {
		System.out.println("Mugs(" + i + ")");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Test5_7_4_Mugs();
		System.out.println("new Mugs() completed");
		new Test5_7_4_Mugs(1);
		System.out.println("new Mugs(1) completed");
	}
}

class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}
}