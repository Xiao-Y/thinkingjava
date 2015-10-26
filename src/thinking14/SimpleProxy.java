package thinking14;

/**
 * 动态代理
 * 
 * @author XiaoY
 * @date: 2015年10月26日 下午8:58:18
 */
public class SimpleProxy implements Interface {

	private Interface proxyIed;

	public SimpleProxy(Interface proxyIed) {
		this.proxyIed = proxyIed;
	}

	@Override
	public void doSomething() {
		System.out.println("SimpleProxy--->doSomething");
		proxyIed.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy--->somethingElse---->" + arg);
		proxyIed.somethingElse(arg);
	}
}
