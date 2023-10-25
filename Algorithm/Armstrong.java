package Algorithm;
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int temp=n;
	    int sum=0;
	    while(temp>0){
	        int k = temp%10;
	        sum=sum+(k*k*k);
	        temp/=10;
	    }
	    if(sum==n){
	        System.out.println("Armstrong");
	    }
	    else{
	        System.out.println("Not Armstrong");
	    }
	}
}
