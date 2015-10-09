package thinking05;

import java.util.Arrays;

/**
 * 数组
 * 
 * @author XiaoY
 * @date: 2015年10月9日 下午10:33:05
 */
public class Test5_8 {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;

		// 复制的了个引用
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a2[i] + 1;
		}

		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a1));
	}
}
