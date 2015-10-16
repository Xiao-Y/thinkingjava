package thinking08;

/**
 * 多态：音乐类
 * 
 * @author XiaoY
 * @date: 2015年10月16日 下午11:22:28
 */
public class Music {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
