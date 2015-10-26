package thinking14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 动态代理
 * 
 * @author XiaoY
 * @date: 2015年10月26日 下午9:10:40
 */
public class DynamicProxyHandler implements InvocationHandler {

	private Object proxIed;

	public DynamicProxyHandler(Object proxIed) {
		this.proxIed = proxIed;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("******proxy:" + proxy.getClass() + ",method:" + method + ",args:" + Arrays.toString(args));
		return method.invoke(proxIed, args);
	}

}
