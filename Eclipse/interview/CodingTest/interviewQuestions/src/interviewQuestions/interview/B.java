package interviewQuestions.interview;

import java.util.Arrays;

public class B {
	static int sockMerchant(int[] ar) {
	      int count=0;
	      Arrays.sort(ar);
	     int arr[]=new int [100];
	      for(int i=0;i<ar.length;i++){//10 10 10 10 20 20 20 30 50
	    	  Integer I=i;
	    	  
	    	  if (!checkValue(i,arr)||i==0) {
	          int dupCount=1;
	          for(int j=i+1;j<ar.length;j++){
	            
	            if(ar[i]==ar[j]){
	             dupCount++;
	             arr[i]=i;
	             arr[j]=j;
	            }else {
	              break;
	            }
	          }
	           count=count+dupCount/2;
	    	  }
	        }      
	      return count;
	    }
	public static boolean checkValue(int i,int arr[]) {
		for(int j : arr) {
			if (j==i) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
      int arr[]= {1,1,3,1,2,1,3,3,3,3};
      int count=sockMerchant( arr);
      System.out.println(count);
	}

}
