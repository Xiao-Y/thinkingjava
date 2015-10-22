package thinking13;

import java.util.Arrays;

import org.junit.Test;

/**
 * 正则表达式<br>
 * 整数型
 * 
 * @author XiaoY
 * @date: 2015年10月22日 上午9:53:37
 */
public class IntegerMatch {

	@Test
	public void test() {
		System.out.println("-12345".matches("-?\\d+"));// true
		System.out.println("12345".matches("-?\\d+"));// true
		System.out.println("+12345".matches("-?\\d+"));// false
		// 可能以一个加号或减号开头，或者什么都没有
		System.out.println("+12345".matches("(-|\\+)?\\d+"));// true
	}

	static String knights = "Then, then you have found the shrubbery, you must cut down the mightiest tree in the forest... with... aherring!";

	private static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}

	@Test
	public void test2() {
		// [Then,, then, you, have, found, the, shrubbery,, you, must, cut, down, the, mightiest, tree, in, the, forest..., with..., aherring!]
		split(" ");// 以空格分割
		// [Then, then, you, have, found, the, shrubbery, you, must, cut, down, the, mightiest, tree, in, the, forest, with, aherring]
		split("\\W+");// 非单词字符
		// [The, the, you have found the shrubbery, you must cut dow, the mightiest tree i, the forest... with... aherring!]
		split("n\\W+");// 字母n后面跟着一个或多个非单词字符
	}

	@Test
	public void test3() {
		String str = IntegerMatch.knights;
		// Then, then you have located the shrubbery, you must cut down the mightiest tree in the forest... with... aherring!
		System.out.println(str.replaceFirst("f\\w++", "located"));// 以f开头的单词替换成located
		// Then, then you have found the banana, you must cut down the mightiest banana in the forest... with... banana!
		System.out.println(str.replaceAll("shrubbery|tree|aherring", "banana"));// 所有出现的都替换成banana
	}
}
