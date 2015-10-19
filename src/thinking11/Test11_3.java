package thinking11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 元素的操作
 * 
 * @author XiaoY
 * @date: 2015年10月19日 下午11:27:43
 */
public class Test11_3 {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(collection);
		Integer[] moreInts = { 6, 7, 8, 9, 0 };
		collection.addAll(Arrays.asList(moreInts));
		System.out.println(collection);
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		System.out.println(collection);
		Collections.addAll(collection, moreInts);
		System.out.println(collection);
		List<Integer> list = Arrays.asList(17, 18, 19, 20);
		System.out.println(list);
		list.set(1, 111);
		System.out.println(list);
		// list.add(122);
		// System.out.println(list);
	}
}
