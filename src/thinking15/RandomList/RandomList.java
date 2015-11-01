package thinking15.RandomList;

import java.util.ArrayList;
import java.util.Random;

/**
 * 随机数据获取
 * 
 * @author XiaoY
 * @date: 2015年11月1日 下午10:17:04
 */
public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for (String s : "shui ji shu sheng cheng huo qu".split(" ")) {
			rs.add(s);
		}

		for (int i = 0; i < 11; i++) {
			System.out.print(rs.select() + " ");
		}
	}
}
