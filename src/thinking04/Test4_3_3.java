package thinking04;

/**
 * for的逗号操作符
 * 
 * @author XiaoY
 * @date: 2015年10月8日 下午10:12:16
 */
public class Test4_3_3 {

	public static void main(String[] args) {
		for (int i = 1, j = i + 10; i < 5; i++, j = 2 * i) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}
