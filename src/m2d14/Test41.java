package m2d14;

/**
 * hashCode源代码： public native int hashCode();不是抽象方法，
 * 		带有native关键字，底层调用c++程序
 * 
 * 返回值是哈希值，实际上是一个对象的内存地址经过哈希算法得出来的一个值。
 * 
 * 
 * @author yyds
 *
 */
public class Test41 {
	public static void main(String[] args) {
		Object o=new Object();
		System.out.println(o.hashCode());
}
}

