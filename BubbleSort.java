import java.util.Scanner;
public class BubbleSort 
{

		    static void bubbleSort(int[] arr) 
		    {  
		        int n = arr.length;  
		        int temp = 0;  
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(arr[j-1] > arr[j]){  
		                                 //swap elements  
		                                 temp = arr[j];  
		                                 arr[j-1] = arr[j];  
		                                 arr[j] = temp;  
		                         }  
		                          
								  asfouasfuhas
		                 }   
		  
		    }
		    }
		    
		    public static void main(String[] args) { 
		                int n;
		                Scanner s= new Scanner(System.in);
		                n=s.nextInt();
		                int arr[]= new int[n];
		                for(int i=0;i<n;i++)
		                {
		                	arr[i]=s.nextInt(); 
		                }
		                 
		                System.out.println("Array Before Bubble Sort");  
		                for(int i=0; i < arr.length; i++){  
		                        System.out.print(arr[i] + " ");  
		                }  
		                System.out.println();  
		                  
		                bubbleSort(arr);//sorting array elements using bubble sort  
		                 
		                System.out.println("Array After Bubble Sort");  
		                for(int i=0; i < arr.length; i++){  
		                        System.out.print(arr[i] + " ");  
		                }  
		   
		        }  
		}  
		// TODO Auto-generated method stub
