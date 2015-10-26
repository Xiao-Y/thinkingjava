package thinking14;

public class ClassCase extends Building {

	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		// 接收参数对象，并将其转型为Class引用的类型
		House house = houseType.cast(b);
		house = (House) b;
	}
}

class Building {

}

class House extends Building {

}