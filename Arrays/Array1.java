/*Q.) First Index And Last Index                      (BRUTE FORCE: Linear Search)

--Input Format--
A number n
n1
n2
.. n number of elements
A number data


--Output Format--
A number representing first index
A number representing last index....................................


Example: 
          n=10
          [1,2,3,4,4,4,4,4,5,7,8]
          data=4    
        
         O/P: 1st index:3
              2nd index:6
*/

import java.io.*;
import java.util.*;

public class Array1{

public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	int data= sc.nextInt();
	
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	int p=0;
	int i=0;
	int j=arr.length-1;
	
	while(i<arr.length){
		if(arr[i]==data)
		{
			p=i;
			System.out.println("1st position :"+p);
			break;
		}
		i++;
	}
	
	while(j>=p)
	{
		if(arr[j]==data)
		{
			System.out.println("Last position :"+j);
			break;
		}
		j--;
	}
 }

}