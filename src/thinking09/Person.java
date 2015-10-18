package thinking09;

/**
 * 接口：策略模式<br/>
 * 基类
 * 
 * @author XiaoY
 * @date: 2015年10月18日 下午2:36:05
 */
public class Person {

	public void say(String s) {
		System.out.println(s);
	}

	public String name() {
		return getClass().getSimpleName();
	}
}
