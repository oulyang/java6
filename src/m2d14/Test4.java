package m2d14;


/**
 * Object��  finalize����
 * Դ���룺
 * protected void finalize()throws Throwable{}
 * 
 * ֻ��һ�������壬����û�д��룬������protected����
 * 
 * �����������Ҫ����Ա�ֶ����ã�JVM����������������ø÷���
                 
 * ִ��ʱ������һ��java���󼴽����������������յ�ʱ�������������������
 * 
 * finalize����ʵ������sun��˾Ϊjava����Ա׼����һ��ʱ������������ʱ����
 * ���ϣ���ڶ�������ʱ��ִ��һ�δ��룬��δ���д��finalize�������С�
 * @author yyds
 *
 */
public class Test4 {
	public static void main(String[] args) {
		Person p=new Person();
		p=null;
		System.gc();//������������������
	}
}


class Person{
	protected void finalize()throws Throwable{
		
		System.out.println("jixiangxiaohui");
	}
}
