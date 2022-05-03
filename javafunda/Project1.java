package javafunda;
import java.util.*;
public class Project1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String EmpDet[][]=new String[8][8];
		String DA[][]=new String[6][3];
		System.out.println("Enter the Employee Details : ");
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				EmpDet[i][j]=sc.next();
			}
		}
		System.out.println();
		System.out.println("Enter the DA with designation : ");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<3;j++)
			{
				DA[i][j]=sc.next();
			}
		}
        int Bas,HR,D,I,Sal=0;
		
		//System.out.println(Arrays.toString(EmpDet));
		//System.out.println(Arrays.toString(DA));
		System.out.println("Enter an Employee No. ");
		int en=sc.nextInt();
		int imp=0;
		int imp1=0;
		int flag=0;
		for(int i=1;i<8;i++)
		{
			
			int n=Integer.parseInt(EmpDet[i][0]);
			if(en == n)
			{
				flag=0;
				imp=i;
				break;
			}
			else
			{    
				flag=1;	
			}
		}
		if(flag ==1)
		{
			System.out.println("There is no Employee with empid : "+en);
		}
		else if(flag == 0)
		{
			Bas=Integer.parseInt(EmpDet[imp][5]);
			HR=Integer.parseInt(EmpDet[imp][6]);
			I=Integer.parseInt(EmpDet[imp][7]);
			for(int i=1;i<6;i++)
			{
				//System.out.println(EmpDet[imp][3]);
				//System.out.println(DA[i][0]);
				if(EmpDet[imp][3].equals(DA[i][0]))
				{
					imp1=i;
					D=Integer.parseInt(DA[i][2]);
					
				    Sal=Bas+HR+D-I;

				}
			}
			System.out.println("EmpNo.   EmpName   Department   Designation   Salary");
			System.out.println(en+"      "+EmpDet[imp][1]+"         "+EmpDet[imp][4]+"      "+DA[imp1][1]+"       "+Sal);
			
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}

//EmpNo EmpName JoinDate DesignationCode Department Basic HRA IT
//1001 Ashish 01/04/2009 e R&D 20000 8000 3000
//1002 Sushma 23/08/2012 c PM 30000 12000 9000
//1003 Rahul 12/11/2008 k Acct 10000 8000 1000
//1004 Chahat 29/01/2013 r FrontDesk 12000 6000 2000
//1005 Ranjan 16/07/2005 m Engg 50000 20000 20000
//1006 Suman 1/1/2000 e Manufacturing 23000 9000 4400 
//1007 Tanmay 12/06/2006 c PM 29000 12000 10000


//DesignationCode Designation DA
//e Engineer 20000
//c Consultant 32000
//k Clerk 12000
//r Receptionist 15000
//m Manager 40000


