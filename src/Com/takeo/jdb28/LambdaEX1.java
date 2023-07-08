package Com.takeo.jdb28;


interface Sayable
{
	public String say(String name);
}


public class LambdaEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda example
		Sayable s=(name)-> 
		{
			return "Welcome: "+name;
		};
		System.out.println(s.say("Shiva"));

	}

}
