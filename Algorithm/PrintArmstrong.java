package Algorithm;

import java.util.*;
class PrintArmstrong
{
    
    static boolean checkArmstrong(int n){
        int temp=n;
	    int sum=0;
	    while(temp>0){
	        int k = temp%10;
	        sum=sum+(k*k*k);
	        temp/=10;
	    }
	    return sum==n;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    for(int i=100;i<=999;i++){
	        if(checkArmstrong(i)){
	            System.out.print(i+" ");
	        }
	    }
	}
}
