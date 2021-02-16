package in.nit.datastructure;

import java.util.Scanner;
 //how to sort a array using bubble sort algorithm
public class Bubblesort {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  integer arr");

		int[] numarr= {4,3,2,6,6,4};
		//int numar=sc.nextInt();
		//int numarr[]=new int[numar];



		for(int i=0;i<numarr.length-1;i++) {

			for(int j=0;j<numarr.length-1-i;j++) {

				if(numarr[j]>numarr[j+1]) {
					temp=numarr[j];
					numarr[j]=numarr[j+1];
					numarr[j+1]=temp;
					//System.out.print(numarr[j]);
				}

			}
		}
		for(int num:numarr) {
			System.out.print("\t"+num);
		}
	}

}
