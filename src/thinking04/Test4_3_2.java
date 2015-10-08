package thinking04;

/**
 * for的使用
 * 
 * @author XiaoY
 * @date: 2015年10月8日 下午10:06:55
 */
public class Test4_3_2 {

	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			// 判断当前字符是否为小写字母
			if (Character.isLowerCase(c)) {
				System.out.println("value : " + (int) c + " Character : " + c);
			}
		}
	}
}
