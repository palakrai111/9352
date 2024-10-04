package Strog;

public class enumexample {
	
	enum Season{WINTER,RAINY,SUMMER,SPRING}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(Season x: Season.values())
	{
		System.out.println(x);
	}

	}

}
