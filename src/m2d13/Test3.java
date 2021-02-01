package m2d13;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c=new Animal("cat",1,"c");
		Host h1=new Host("wang",c);
		
		Host h2=new Host("wang",new Animal("cat",1,"c"));
		
		System.out.println(h1.equals(h2));
	}

}

class Host{
	String name;
	Animal panhu;
	
	public Host() {
		super();
	}
	public Host(String name, Animal panhu) {
		super();
		this.name = name;
		this.panhu = panhu;
	}
	//此处重写equals判断的是Host之间是否相等
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Host)) {
			return false;
		}
		if(obj==this) {
			return true;
		}
		Host h=(Host)obj;
		return this.name.equals(h.name)&&this.panhu.equals(h.panhu);
				
	}
	
}
class Animal{
	String kind;
	int  age;
	String addr;
	
	
	public Animal() {
		super();
	}
	public Animal(String kind, int age, String addr) {
		super();
		this.kind = kind;
		this.age = age;
		this.addr = addr;
	}
	
	//此处重写equals方法
	//判断的是Animal对象之间是否相等
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Animal))return false;
		if(obj==this)return true;
		Animal a=(Animal)obj;
		return  this.age==a.age&&
				this.addr.equals(a.addr)&&
				this.kind.equals(a.kind);
	}
	
}
