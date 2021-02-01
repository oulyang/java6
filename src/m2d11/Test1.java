package m2d11;
/**
 * java语言的字符串String有没有重写toString方法和equals方法
 * 
 * java中基本数据类型的数据可以使用“==”判断
 * 
 * java中引用数据类型的数据统一使用equals方法判断
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String也是一个类，不属于基本数据类型
		String st1="aassasa";
		String st2="aadadadad";
		
		String st3=new String("12223");
		String st4=new String("12223");
		//String类已经重写equals方法
		System.out.println(st3.equals(st4));
		
		//String类已经重写toString方法
		String st5=new String("wahaha");
		System.out.println(st5.toString());
		System.out.println(st5);
	}

}

