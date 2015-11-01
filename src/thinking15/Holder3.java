package thinking15;

/**
 * 泛型的使用
 * 
 * @author XiaoY
 * @date: 2015年11月1日 下午8:34:46
 */
public class Holder3<T> {

	private T a;

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		Holder3<Automobile> h = new Holder3<Automobile>();
		h.set(new Automobile());
		Automobile automobile = h.get();
		System.out.println(automobile);
	}
}
