package Com.takeo.jdb28;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> marks=new ArrayList<>();
		
		marks.add(90);
		marks.add(95);
		marks.add(76);
		marks.add(88);
		
		
		// Using Lambda Expression
		marks.forEach(
				(Grade)->
				{
					System.out.println(Grade);
				}
				);

	}

}
