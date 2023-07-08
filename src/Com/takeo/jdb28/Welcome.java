package Com.takeo.jdb28;

@FunctionalInterface
interface wish
{
	String say(String name);
}

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wish w=(name)->
		{
			return "Hi it's me "+name;
		};
		System.out.println(w.say("Pravin"));
		

	}

}
