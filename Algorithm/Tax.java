package Algorithm;

import java.util.*;
public class Tax
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int tax=0;
	    if(n>0 && n<=180000){
	        tax=0;       
	    }
	    else if(n>180000 && n<=300000){
	        tax=10;
	    }
	    else if(n>300000 && n<=500000){
	        tax=20;
	    }
	    else if(n>500000 && n<=1000000){
	        tax=30;
	    }
	    double res= n+((n*tax)/100);
	    System.out.println(res);
	}
}
