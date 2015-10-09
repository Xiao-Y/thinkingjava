package thinking05;

/**
 * 测试类2
 * 
 * @author XiaoY
 * @date: 2015年10月9日 下午9:52:21
 */
public class Test5_7_2_Table {

	static Test5_7_2_Bowl bowl1 = new Test5_7_2_Bowl(1);

	Test5_7_2_Table() {
		System.out.println("Test5_7_2_Table()");
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Test5_7_2_Bowl bowl2 = new Test5_7_2_Bowl(2);
}
