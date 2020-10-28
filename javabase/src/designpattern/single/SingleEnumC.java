package designpattern.single;

/**
 * <p>
 *枚举实现单例模式
 * <p>
 *
 * @author wudingjia
 * @date 2020-10-15 13:45
 */
public class SingleEnumC {

	private SingleEnumC() {

	}

	static enum Singleton {
		INSTANCE;
		private SingleEnumC singleEnumC;
		private Singleton(){
			singleEnumC = new SingleEnumC();
		}
		public SingleEnumC getSingleEnumC(){
			return singleEnumC;
		}

	}
	public static SingleEnumC getInstance(){
		return Singleton.INSTANCE.getSingleEnumC();
	}
}
