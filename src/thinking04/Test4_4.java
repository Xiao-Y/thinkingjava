package thinking04;

import java.util.Random;

/**
 * foreach
 * 
 * @author XiaoY
 * @date: 2015年10月8日 下午10:17:14
 */
public class Test4_4 {

	public void test() {
		Random random = new Random(47);
		float f[] = new float[10];
		for (int i = 0; i < 10; i++) {
			f[i] = random.nextFloat();
		}
		// foreach语法
		for (float x : f) {
			System.out.println(x);
		}
	}
	
	public void test2(){
		for(char c : "An african Swallow".toCharArray()){
			System.out.print(c + " ");
		}
	}

	public static void main(String[] args) {
		Test4_4 t1 = new Test4_4();
		t1.test();
		t1.test2();
	}
}
