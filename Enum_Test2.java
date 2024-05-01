package ObjectOrientedProgramming;

public class Enum_Test2 {

	enum color{
		PURPLE,RED,BLUE;
	}
	public static void main(String[] args) {
			color c1=color.PURPLE;
		for(color s:color.values()) {
			System.out.println(s);
		}
	}

}
