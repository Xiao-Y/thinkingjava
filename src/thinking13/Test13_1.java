package thinking13;

import org.junit.Test;

/**
 * 字符串操作
 * 
 * @author XiaoY
 * @date: 2015年10月20日 下午10:29:20
 */
public class Test13_1 {

	/**
	 * 转大写
	 * 
	 * @param s
	 * @return
	 * @date 2015年10月20日 下午10:33:36
	 */
	public static String upcase(String s) {
		return s.toUpperCase();
	}

	String q = "qweqweqw";

	@Test
	public void test() {
		System.out.println(Test13_1.upcase(q));
		System.out.println(q);
		// 转小写
		System.out.println(q.toLowerCase());
	}
}
