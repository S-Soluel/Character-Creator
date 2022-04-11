package character;

public class NPC extends Character{
	private String career;
	private String hometown;
	
	public NPC(String n, int a, String c, String h)
	{
		super(n, a);
		career = c;
		hometown = h;
	}
	
	public String getCareer()
	{
		return career;
	}
	
	public void setCareer(String c)
	{
		career = c;
	}
	
	public String getHometown()
	{
		return hometown;
	}
	
	public void setHometown(String h)
	{
		hometown = h;
	}
	
	@Override 
	public void display()
	{
		System.out.println("NPC: ");
		System.out.println();
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Career: " + career);
		System.out.println("Hometown: " + hometown);
	}
	
}
