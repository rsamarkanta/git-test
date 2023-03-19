public class Average{
	public static void average(int a,int b,int c){
	float avg=(float)(a+b+c)/3;
	System.out.println("averge="+avg);
	}
	
public static void main(String[] args){
	java.util.Scanner s=new java.util.Scanner(System.in);
	System.out.println("enter 3 number to find average=");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	 average(a,b,c);
	}
}