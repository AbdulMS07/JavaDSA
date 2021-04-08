//code By M.Shaihu Abdul Kadhir

import java.util.*;

public class BinarySearchIterative{
    public static void main (String[] args) {
        
        BinarySearchIterative bs = new BinarySearchIterative();
        Scanner scan = new Scanner(System.in);	
        
        System.out.println("Enter the size of the array: ");
        int n=scan.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array elements in sorted: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        System.out.println("Enter the element to find: ");
        int k=scan.nextInt();
        
        int result,first=0;
        result=bs.binarySearch(arr,first,n-1,k);
        if(result==-1){
             System.out.println("There is no such element");
        }else{
             System.out.println("The key element "+k+" is found at index "+result);
        }
       
        scan.close();
    }
    public int binarySearch(int arr[],int first,int last,int key){
        while(last>=first){
            int mid = (int)first+(last-first)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                last=mid-1;
            }
            if(key>arr[mid]){
                first=mid+1;
            }
          
        }
       return -1;
    }
	
}