package thinking03;

/**
 * 逻辑操作符<br/>
 * && 与运算，只有运算两边都为true时为true，否则为fasle <br/>
 * || 或运算，当运算两边有一边为true时就为true，否则为false <br/>
 * 短路：一旦能够明确无误地确定整个表达式的值，就不再计算表壳式余下部分
 * 
 * @author XiaoY
 * @date: 2015年10月7日 下午4:12:31
 */
public class Test3_8 {

	public static boolean test1(int val) {
		System.out.println("test(" + val + ")");
		System.out.println("return: " + (val < 1));
		return val < 1;
	}

	public static boolean test2(int val) {
		System.out.println("test(" + val + ")");
		System.out.println("return: " + (val < 2));
		return val < 2;
	}

	public static boolean test3(int val) {
		System.out.println("test(" + val + ")");
		System.out.println("return: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		// 一旦能够明确无误地确定整个表达式的值，就不再计算表壳式余下部分
		System.out.println(test1(0) && test2(2) && test3(4));
		// test(0)
		// return: true
		// test(2)
		// return: false
		// false
	}
}
