package thinking14;

import java.lang.reflect.Proxy;

/**
 * 静态代理
 * 
 * @author XiaoY
 * @date: 2015年10月26日 下午9:11:24
 */
public class SimpleDynamicProxy {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("uuuuuu");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		System.out.println("-------------------");
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[] { Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);

	}
}
