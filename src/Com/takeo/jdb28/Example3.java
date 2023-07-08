package Com.takeo.jdb28;

@FunctionalInterface
interface Addable
{
	int add(int fno, int sno);
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad=(fno,sno)->
		{
			return fno+sno;
		};
		
		System.out.println(ad.add(100, 200));
		
		int result = ad.add(250, 125);
		
		System.out.println("Addition of two numbers: "+ result);

	}

}
