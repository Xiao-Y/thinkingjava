package thinking09;

/**
 * 策略模式<br/>
 * 继承类
 * 
 * @author XiaoY
 * @date: 2015年10月18日 下午2:40:05
 */
public class Women extends Person {

	@Override
	public void say(String s) {
		System.out.println("women : " + s);
	}
}
