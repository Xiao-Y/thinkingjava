package thinking11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import util.Tools;

/**
 * map的使用<br/>
 * 统计随机数出现的次数
 * 
 * @author XiaoY
 * @date: 2015年10月20日 下午9:23:06
 */
public class Test11_10 {

	@Test
	public void getCount() {
		List<Integer> arrayList = Tools.arrayList(47, 0, 200, 20000);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer arr : arrayList) {
			Integer in = map.get(arr);
			if (in == null) {
				map.put(arr, 1);
			} else {
				map.put(arr, map.get(arr) + 1);
			}
		}

		Collection<Integer> values = map.values();
		Integer value = Collections.max(values);
		List<Integer> keys = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(value)) {
				keys.add(entry.getKey());
			}
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		System.out.println("出现最多次的值为：" + keys);
		System.out.println("出现的次数为：" + value);
	}
}
