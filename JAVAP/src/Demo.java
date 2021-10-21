import java.util.Scanner;

public class Demo {
	
   public static void main(String[] args) {
	   
	  System.out.println("Welocome to Employee Management Tool "); 
	  System.out.println("Enter your choice"+"\t"+"1 to ADD"+"\t"+"2 to View" + "\t" +"Any'NO'other than '1'&'2' to Exit" );
	   Scanner a=new Scanner (System.in);
	   int add=a.nextInt();
	   
	   if (add==1){
		   
		   System.out.println("Enter EMP ID");
		  int EMP_ID=a.nextInt();
		  
		  System.out.println("Enter Salary details");
		  Float salary = a.nextFloat();
		  
		  System.out.println("Enter Experience details");
		  Double Experience=a.nextDouble();
		  
		  System.out.println("Enter EMP Name");
		  String name=a.nextLine();
		  
		  
		  System.out.println("Employee details successfully added");
		   
	   }
	   else if (add==2){
		  
		   
			 System.out.println("EMPID"+"\t"+"EMPName"+"\t"+" Salary"+"\t"+"Experience");
			   String b[][] = new String[2][5];
			   
			   b[0][0]="1";
			   b[0][1]="MSK";
			   b[1][0]="2";
			   b[1][1]="James";
			   b[0][2]="10000";
		      b[0][3]="20000";
		      b[0][4]="2";
		      b[1][3]="3";
			   System.out.println(b[0][0]  +"\t" + b[0][1]+"\t"+   b[0][2]+"\t"+b[0][4]);
			   
			   System.out.println( b[1][0] + "\t"+ b[1][1]+"\t"+b[0][3]+"\t"+ b[1][3]);
			  }
	   
	   else {
		    System.out.println("Successfully logged out from application");
		   }
}
}