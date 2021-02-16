package in.nit.coreTest;

public class ArrayCount
{
	static int j=0;
	static int c1=0,c2=0,c3=0,c4=0,c5=0;
	public static void main(String args[])
	{
//take a array and count each element separately and display
		int a[]={1,3,5,3,1,6,4,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)	{++c1;}
			else if(a[i]==3) {++c2;}
			else if(a[i]==5) {++c3;}
			else if(a[i]==6) {++c4;}
			else if(a[i]==4) {++c5;}

		}
		System.out.println("count of 1 is ="+c1);

		System.out.println(" count of 3 is="+c2);
		System.out.println(" count of 5 is="+c3);
		System.out.println(" count of 6 is="+c4);
		System.out.println("count of 4 is="+c5);
	}
}

/* dyanamically we can take arrray and count ,display
 * 
 * int count; Scanner sc=new Scanner(System.in); System.out.println(“enter the
 * number of elements in the array”); int num=sc.nextInt(); int array[]=new
 * int[num]; System.out.println(“enter the array elements”); for(int
 * i=0;i<num;i++) { array[i]=sc.nextInt(); } Arrays.sort(array);
 * System.out.println("elemetns count:"); for(int i=0;i<num;) { count=1; for(int
 * j=i+1;j<num;j++) { if(array[i]==array[j]) { count=count+1; } } if(count==1) {
 * System.out.print(array[i]+":"+count+","); i=i+count; } else if(count!=1) {
 * System.out.print(array[i]+":"+count+","); i=i+count; } }
 */

