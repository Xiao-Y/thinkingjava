package thinking15.LinkedList;

/**
 * 实现堆栈类
 * 
 * @author XiaoY
 * @date: 2015年11月1日 下午9:24:09
 */
public class LinkedStack<T> {

	/**
	 * 结点类
	 * 
	 * @author XiaoY
	 * @date: 2015年11月1日 下午10:08:08
	 */
	private static class Node<U> {
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		/**
		 * 判断是否结束
		 * 
		 * @return true 为结束
		 * @date 2015年11月1日 下午10:04:33
		 */
		boolean end() {
			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<T>();

	/**
	 * 装载数据<br/>
	 * 堆栈：上一个结点保存下一个结点的地址
	 * 
	 * @param item
	 *            装载的数据
	 * @date 2015年11月1日 下午10:04:21
	 */
	public void push(T item) {
		top = new Node<T>(item, top);
	}

	/**
	 * 弹出数据
	 * 
	 * @return 取出的数据
	 * @date 2015年11月1日 下午10:01:53
	 */
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;// 末端哨兵
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String s : "wo shi zhi ding yi de diu zhan zhi".split(" ")) {
			lss.push(s);
		}

		String s;
		while ((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}
}
