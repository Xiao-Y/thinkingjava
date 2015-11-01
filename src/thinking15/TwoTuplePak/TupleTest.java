package thinking15.TwoTuplePak;

public class TupleTest {

	static TwoTuple<String, Integer> f() {
		return new TwoTuple<String, Integer>("billow", 24);
	}

	static ThreeTuple<Amphibian, String, Integer> g() {
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "billow", 23);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> f = f();
		ThreeTuple<Amphibian, String, Integer> g = g();
		System.out.println(f);
		System.out.println(g);
	}
}
