package sub5;

public class Sedan extends Car {

	
	private int cc;
	
	public Sedan(String name, String color, int speed)  {
		super(name, color, speed);
		this.cc = cc;
	}
	
	
	
	
	public void speedTurbo()    {
		this.speed  += 20;
				
	}
	
	public void show()  {
		System.out.println("차랑명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
		System.out.println("배기량 : "+cc);
		
		
	}
}
