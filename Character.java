package character;

public class Character {
	private String name;
	private int age;
	
	public Character(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void display()
	{
		System.out.println("CHARACTER: ");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
}
