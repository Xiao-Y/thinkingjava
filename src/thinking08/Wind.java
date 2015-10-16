package thinking08;

/**
 * 多态：吹响号角
 * 
 * @author XiaoY
 * @date: 2015年10月16日 下午11:20:55
 */
public class Wind extends Instrument {

	@Override
	public void play(Note n) {
		// super.play(n);
		System.out.println("Wind.play()");
	}
}
