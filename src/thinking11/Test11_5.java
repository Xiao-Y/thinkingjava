package thinking11;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import util.MyComparator;
import util.Tools;

public class Test11_5 {

	@Test
	public void test() {
		// [5, 20, 16, 14, 16, 14, 13, 17, 3, 16, 15, 15, 6, 16, 14, 13, 19, 16, 11, 13]
		List<Integer> arrayList = Tools.arrayList(47, 3, 20, 20);
		// [14, 16, 14]
		List<Integer> subList = arrayList.subList(3, 6);
		System.out.println(subList);

		System.out.println(arrayList.contains(14));// true
		System.out.println(arrayList.containsAll(subList));// true
		arrayList.removeAll(subList);
		// [5, 20, 13, 17, 3, 16, 15, 15, 6, 14, 13, 19, 11, 13]
		System.out.println(arrayList);
		Collections.sort(arrayList);
		// [3, 5, 6, 11, 13, 13, 13, 14, 15, 15, 16, 17, 19, 20]
		System.out.println(arrayList);

		Collections.sort(arrayList, new MyComparator());
		// [20, 19, 17, 16, 15, 15, 14, 13, 13, 13, 11, 6, 5, 3]
		System.out.println(arrayList);
	}
}
