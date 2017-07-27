package core.day05;/*
this语句 :用于构造函数之间进行互相调用。

this语句只能定义在构造函数的第一行。因为初始化要先执行。
*/

class Person
{
	private String name;
	private int age;
	
	{
		
		System.out.println("code run");
	}
	
	Person()
	{
		//this("hah");
		System.out.println("person run");
	}
	Person(String name)
	{
		//this();
		this.name =name;
	}
	Person(String name,int age)
	{
		//this(name);
		//this.name = name;
		this.age = age;
		
	}

}

public class  PersonDemo4
{
	public static void main(String[] args) 
	{
		new Person();
		//Person p = new Person("lisi",30);
		//Person p1 = new Person("lisi2",36);

	}
}
