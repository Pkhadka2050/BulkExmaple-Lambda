package Com.takeo.jdb28;

import Com.takeo.lambda.Addition;

public class AddEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda expression
		Addition ad = ()-> {
			int fno=100;
			int sno=200;
			int result=fno+sno;
			
			System.out.println("The addtion of two numbers is: "+ result);
		};
		ad.add();
		

	}

}
