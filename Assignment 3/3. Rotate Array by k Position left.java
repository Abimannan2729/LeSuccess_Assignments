import java.util.*;
public class Main
{
    static  void rotatearray(int arr[],int n,int k){
        if(arr.length<=1) return;
        k=k%n;
        if(k==0) return;
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);
    }
    static void swap(int[] arr,int l,int r){
        
        while(l<r){
            int temp= arr[l];
            arr[l]= arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]= sc.nextInt();
		}
		int k= sc.nextInt();
		rotatearray(arr,n,k);
	    	for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}