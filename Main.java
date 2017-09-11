import java.util.Date;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		while(true)
		{
			System.out.println("Select option");
			System.out.println("1. ADD STUDENTs");
			System.out.println("2.Get All Student details");

			System.out.println("3. ADD STUDENT BEING");
			System.out.println("4. ADD STUDENT AT LATE");
			StudentGroup sg=new StudentGroup();
			System.out.println("Enter u r input:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: break;
				case 2: sg.setStudents();
					break;
			}
			
		}

	}

}
