import java.util.Scanner;
public class LinearSearchs{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){  
        Scanner sc_Milan=new Scanner(System.in);
        System.out.println("Enter size of data:");
        int n=sc_Milan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc_Milan.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc_Milan.nextInt();  
        System.out.println(key+" is found at location: "+(linearSearch(arr, key)+1));    
        System.out.println("kshitiz,08,B");
    }    
}
