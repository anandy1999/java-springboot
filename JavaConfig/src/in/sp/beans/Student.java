package in.sp.beans;

public class Student {

      private String name;
      private int rollNo;
      
      public String getName()
      {
    	  return name;
      }
      
      public int getRoll()
      {
    	  return rollNo;
      }
      
      
      public void setName(String name)
      {
    	  this.name=name;
      }
      
      
      public void setRoll(int rollNo)
      {
    	  this.rollNo=rollNo;
      }
      
      
      public void display()
      {
    	  System.out.println("name is "+ name);
    	  System.out.println("Roll no is "+ rollNo);
      }
      
      
	

}
