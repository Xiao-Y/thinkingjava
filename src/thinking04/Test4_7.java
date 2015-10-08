package thinking04;

/**
 * break,continue
 * 
 * @author XiaoY
 * @date: 2015年10月8日 下午10:47:43
 */
public class Test4_7 {

	public static void main(String[] args) {
		int i = 0;
		outer: for (; true;) {
			inner: for (; i < 10; i++) {
				System.out.println("i = " + i);
				if (i == 2) {
					System.out.println("continue");
					continue;
				}

				if (i == 3) {
					System.out.println("break");
					i++;
					break;
				}

				if (i == 7) {
					System.out.println("continue outer");
					i++;
					continue outer;
				}

				if (i == 8) {
					System.out.println("break outer");
					break outer;
				}

				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
	}
}
