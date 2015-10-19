package thinking10;

/**
 * 内部类
 * 
 * @author XiaoY
 * @date: 2015年10月19日 下午7:13:48
 */
public class Parcel2 {

	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania..");
		Parcel2 p2 = new Parcel2();
		Parcel2.Destination destination = p2.to("12121");
		Parcel2.Contents contents = p2.contents();
	}
}
