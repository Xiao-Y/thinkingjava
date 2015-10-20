package thinking11;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import util.Tools;

/**
 * 迭代器
 * 
 * @author XiaoY
 * @date: 2015年10月20日 下午8:09:12
 */
public class Test11_6 {

	@Test
	public void test() {
		List<Integer> arrayList = Tools.arrayList(47, 3, 20, 5);
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.print(next + " ");
		}
		System.out.println();
		System.out.println("--------------");
		iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		System.out.println(arrayList);
	}
}
