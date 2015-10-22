package thinking13;

import java.util.Scanner;

import org.junit.Test;

/**
 * 扫描输入
 * 
 * @author XiaoY
 * @date: 2015年10月22日 上午10:43:31
 */
public class Test13_7 {

	@Test
	public void test() {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		while (true) {
			input = scanner.nextLine();
			if ("1".equals(input)) {
				scanner.close();
				break;
			}
			System.out.println(input);
		}
	}
}
