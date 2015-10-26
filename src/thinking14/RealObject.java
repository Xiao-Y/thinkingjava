package thinking14;

/**
 * 动态代理
 * 
 * @author XiaoY
 * @date: 2015年10月26日 下午8:54:56
 */
public class RealObject implements Interface {

	@Override
	public void doSomething() {
		System.out.println("doSomething.....");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse....." + arg);
	}

}
