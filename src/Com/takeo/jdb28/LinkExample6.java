package Com.takeo.jdb28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LinkExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> addStudents=new ArrayList<>();
		
	 addStudents.add(new Student(1, "Pravin", "Chicago","Prav@gmail.com"));
	 addStudents.add(new Student(2, "Shiva", "India","Shiv@gmail.com"));
	 addStudents.add(new Student(3, "Anshu", "Canada","Anshu@gmail.com"));
	 addStudents.add(new Student(4, "Rojesh", "Texas","Roj@gmail.com"));
	 
	 
	 addStudents.forEach(
			 (stu)->
			 {
				 System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getSadd()+"\t"+stu.getEmail());
			 }
			 );
	 
	 System.out.println("====================================================");
	 
	 //Using Lambda to filter the data
	 Stream<Student> filter = addStudents.stream().filter(s->s.getSid()<2);
	 
	 filter.forEach
	 (s-> 
	 {
		 System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSadd()+"\t"+s.getEmail());
	 }
	 );
	 
		

	}

}
