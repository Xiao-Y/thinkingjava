package util;

import java.util.Comparator;

/**
 * List的数据比较器，由大到小
 * 
 * @author XiaoY
 * @date: 2015年10月20日 下午7:55:32
 */
public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
