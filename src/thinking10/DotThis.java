package thinking10;

/**
 * this的使用
 * 
 * @author XiaoY
 * @date: 2015年10月19日 下午8:30:55
 */
public class DotThis {

	/**
	 * DotThis.f()的方法
	 * 
	 * @date 2015年10月19日 下午8:36:12
	 */
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {

		/**
		 * 返回DotThis对象
		 * 
		 * @return DotThis
		 * @date 2015年10月19日 下午8:32:29
		 */
		public DotThis outer() {
			return DotThis.this;
		}
	}

	/**
	 * 获取inner内部类
	 * 
	 * @return Inner
	 * @date 2015年10月19日 下午8:35:28
	 */
	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		dt.f();
		// 方式1：通过方法new来调用
		DotThis.Inner inner = dt.inner();
		inner.outer().f();
		// 方式2：外部类.new的方式
		inner = dt.new Inner();
		inner.outer().f();
	}
}
