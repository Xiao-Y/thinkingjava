package thinking15.TwoTuplePak;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

	public final C third;

	public ThreeTuple(A first, B second, C third) {
		super(first, second);
		this.third = third;
	}

	@Override
	public String toString() {
		int endsWith = super.toString().lastIndexOf("]");
		CharSequence sequence = super.toString().subSequence(0, endsWith);
		return sequence + ", third=" + third + "]";
	}
}
