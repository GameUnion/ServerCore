package info.xiaomo.core.ai.quadtree;

/**
 * 数据
 *
 * @author JiangZhiYong
 */
public abstract class Data<T> implements Comparable<Data<T>> {

	private T value;

	public Data(T value) {
		super();
		this.value = value;
	}

	/**
	 * 获取数据
	 *
	 * @return
	 */
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}


}