package Algorithm;

import java.util.*;
public class Search
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = new int[]{1,2,36,3,6,9,10};
	    int n = sc.nextInt();
	    int flag =0;
	    
	    for(int i=0;i<arr.length-1;i++){
	        for(int j=0;j<arr.length-i-1;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    
	    
	    int mid=(arr.length-1)/2;
	    int first=0;
	    int last =arr.length-1;
	    while(first<=last){
	        if(arr[mid]<n){
	            first=mid+1;
	        }
	        else if(arr[mid]==n){
	            flag=1;
	            break;
	        }
	        else{
	            last=mid-1;
	        }
	        mid=(first+last)/2;
	    }
	    if(first>last){
	        System.out.println("Not Found");
	    }
	    else{
	        System.out.println("Found");
	    }
	}
}