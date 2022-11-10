package oopsconcept;

import java.beans.Statement;

public class Demo {
	{
		class student
		{
			int id;
			String name,address,course;
			float fees;
			
			void setData(int i,String n,String add,String c,float f)
			{
				id=i;
				name=n;
				address=add;
				course=c;
				fees=f;
			}
			
			void displayData()
			{
				System.out.println("Id:"+id);
				System.out.println("Name:"+name);
				System.out.println("Address:"+address);
				System.out.println("Course:"+course);
				System.out.println("Fees:"+fees);
			}

	public static void main(String[] args) {
		Student prasad=new Student();
		prasad.setData(101,"prasad","sangamner","java",2000.0f); //calling/invoke method
		prasad.displayData();
		
		Student rupali=new Student();
		rupali.setData(101,"rupali","Ashwi","Autocad",5000.0f);
		rupali.displayData();
		
	}

}
}


	}


