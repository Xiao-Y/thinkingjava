package thinking14;

/**
 * 动态代理测试
 * 
 * @author XiaoY
 * @date: 2015年10月26日 下午8:58:47
 */
public class SimpleProxyDemo {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("12121");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		System.out.println();
		consumer(new SimpleProxy(new RealObject()));
	}
}
