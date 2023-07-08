package Com.takeo.jdb28;

import java.util.ArrayList;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Shiva");
		al.add("Rani");
		al.add("Pravin");
		al.add("Anu");
		
		//for loop
		//for()
		// iterator
		//listIterator()
		
		al.forEach(
				(name)->
		{
			System.out.println(name);
		}
		);

	}

}
