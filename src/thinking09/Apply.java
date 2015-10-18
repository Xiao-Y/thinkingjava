package thinking09;

/**
 * 策略模式<br/>
 * 测试类
 * 
 * @author XiaoY
 * @date: 2015年10月18日 下午2:41:14
 */
public class Apply {

	public static void process(Person p, String s) {
		p.say(s);
	}

	public static void main(String[] args) {
		String s = "I Love You !";
		process(new Men(), s);
		process(new Women(), s);
	}
}
