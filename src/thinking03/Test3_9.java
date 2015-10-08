package thinking03;

/**
 * 直接常量<br/>
 * 
 * @author XiaoY
 * @date: 2015年10月7日 下午4:38:39
 */
public class Test3_9 {

	public static void main(String[] args) {
		int i1 = 0x2f;
		System.out.println(i1);// 47
		// 转换成二进制
		System.out.println(Integer.toBinaryString(i1));// 101111

		int i2 = 0X2F;
		System.out.println(i2);// 47
		// 转换成二进制
		System.out.println(Integer.toBinaryString(i2));// 101111

		long i3 = 0x7f;
		System.out.println(i3);// 127
		// 转换成二进制
		System.out.println(Long.toBinaryString(i3));// 1111111

		TestE();
	}

	// 指数记数法，e表示10
	public static void TestE() {
		float f = 1e-43f;// 表示1*10~-43方
		System.out.println(f);
		double d = 1e-43;
		System.out.println(d);
	}
}
