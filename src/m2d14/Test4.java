package m2d14;


/**
 * Object类  finalize方法
 * 源代码：
 * protected void finalize()throws Throwable{}
 * 
 * 只有一个方法体，里面没有代码，而且用protected修饰
 * 
 * 这个方法不需要程序员手动调用，JVM垃圾回收器负责调用该方法
                 
 * 执行时机：当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用
 * 
 * finalize方法实际上是sun公司为java程序员准备的一个时机，垃圾销毁时机，
 * 如果希望在对象销毁时机执行一段代码，这段代码写到finalize方法体中。
 * @author yyds
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Person p=new Person();
		p=null;
		System.gc();//建议启动垃圾回收器
	}
}


class Person{
	protected void finalize()throws Throwable{
		
		System.out.println("jixiangxiaohui");
	}
}
