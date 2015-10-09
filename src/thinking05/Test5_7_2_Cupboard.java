package thinking05;

/**
 * 测试类3<br/>
 * 先初始化静态对象，如果静态对象中有其它静态对象就先初始化其它对象，再初始化构造函数
 * 
 * @author XiaoY
 * @date: 2015年10月9日 下午9:55:37
 */
public class Test5_7_2_Cupboard {

	Test5_7_2_Bowl bowl3 = new Test5_7_2_Bowl(3);

	static Test5_7_2_Bowl bowl4 = new Test5_7_2_Bowl(4);

	Test5_7_2_Cupboard() {
		System.out.println("Test5_7_2_Cupboard()");
		bowl4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Test5_7_2_Bowl bowl5 = new Test5_7_2_Bowl(5);

	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Test5_7_2_Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Test5_7_2_Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}

	static Test5_7_2_Table table = new Test5_7_2_Table();
	static Test5_7_2_Cupboard cupboard = new Test5_7_2_Cupboard();
	// Test5_7_2_Bowl(4)
	// Test5_7_2_Bowl(5)
	// Test5_7_2_Bowl(1)
	// Test5_7_2_Bowl(2)
	// Test5_7_2_Table()
	// Test5_7_2_Bowl(3)
	// Test5_7_2_Cupboard()
	// f1(2)
	// Creating new Cupboard() in main
	// Test5_7_2_Bowl(3)
	// Test5_7_2_Cupboard()
	// f1(2)
	// Creating new Cupboard() in main
	// Test5_7_2_Bowl(3)
	// Test5_7_2_Cupboard()
	// f1(2)
	// f2(1)
	// f3(1)
}
