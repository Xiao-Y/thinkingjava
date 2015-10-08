package thinking03;

/**
 * 操作运算符<br/>
 * 后缀：先执行后运算<br/>
 * 前缀：先运算后执行
 * 
 * @author XiaoY
 * @date: 2015年10月7日 下午3:56:38
 */
public class Test3_6 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i = " + i);
		System.out.println("++i = " + ++i);// ++i = 2
		System.out.println("i++ = " + i++);// i++ = 2
		System.out.println("i = " + i);// i = 3
		System.out.println("----------------");
		System.out.println("--i = " + --i);// --i = 2
		System.out.println("i-- = " + i--);// i-- = 2
		System.out.println("i = " + i);// i = 1
	}
}
