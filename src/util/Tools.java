package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 工具类
 * 
 * @author XiaoY
 * @date: 2015年10月20日 下午7:20:49
 */
public class Tools {

	/**
	 * 数据生成器
	 * 
	 * @param seed
	 *            种子
	 * @param min
	 *            最小，默认为0
	 * @param max
	 *            最大，默认为100
	 * @param count
	 *            生成的数量，默认100
	 * @return
	 * @date 2015年10月20日 下午7:34:51
	 */
	public static List<Integer> arrayList(Integer seed, Integer min, Integer max, Integer count) {
		Random random = null;
		if (seed != null) {
			random = new Random(seed);
		} else {
			random = new Random();
		}
		if (min == null) {
			min = 0;
		}
		if (max == null) {
			max = 100;
		}
		if (count == null) {
			count = 100;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			list.add(random.nextInt(max - min + 1) + min);
		}
		System.out.println(list);
		return list;
	}
}
