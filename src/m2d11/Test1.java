package m2d11;
/**
 * java���Ե��ַ���String��û����дtoString������equals����
 * 
 * java�л����������͵����ݿ���ʹ�á�==���ж�
 * 
 * java�������������͵�����ͳһʹ��equals�����ж�
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringҲ��һ���࣬�����ڻ�����������
		String st1="aassasa";
		String st2="aadadadad";
		
		String st3=new String("12223");
		String st4=new String("12223");
		//String���Ѿ���дequals����
		System.out.println(st3.equals(st4));
		
		//String���Ѿ���дtoString����
		String st5=new String("wahaha");
		System.out.println(st5.toString());
		System.out.println(st5);
	}

}

