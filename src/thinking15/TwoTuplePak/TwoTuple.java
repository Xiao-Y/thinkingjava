package thinking15.TwoTuplePak;

/**
 * 泛型：元组
 * 
 * @author XiaoY
 * @date: 2015年11月1日 下午8:40:42
 */
public class TwoTuple<A, B> {

	public final A first;
	public final B second;

	public TwoTuple(A first, B second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}
}
