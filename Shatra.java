
public class Shatra {
   
	
	int  Roll;
	
	String Name;
	Float Mark;
	Shatra (int R,String N, Float M){
		Roll=102;
		Name = "Raja";
		Mark =85.5f;
		
		System.out.println("Roll is : " +Roll);
		System.out.println("Name is :" +Name);
		System.out.println("Mark is:"  +Mark);
}
	


public static void main(String[]args){

	Shatra s = new Shatra(102,"raja",85.5f);
}
}