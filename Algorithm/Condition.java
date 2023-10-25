package Algorithm;

import java.util.*;
public class Condition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>60 && b>60 && c>60){
		    System.out.println("Passed");
		}
		else if((a>60 && b>60) || (a>60 && c>60) || (b>60 && c>60)){
		    System.out.println("Promoted");
		}
		else if(a>60 || b>60 || c>60 || (a+b+c<60)){
		    System.out.println("Failed");
		}
	}
}