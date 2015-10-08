package thinking03;

/**
 * 关系操作符<br/>
 * == 和 !==比较的是对象的引用<br/>
 * equals默认比较的是引用
 * 
 * @author XiaoY
 * @date: 2015年10月7日 下午4:05:47
 */
public class Test3_7 {

	public static void main(String[] args) {
		// 两个对象的值相同但是对象的引用不同
		Integer n1 = new Integer(37);
		Integer n2 = new Integer(37);
		System.out.println(n1 == n2);// false
		System.out.println(n1 != n2);// true
		System.out.println(n1.equals(n2));// true
	}
}
