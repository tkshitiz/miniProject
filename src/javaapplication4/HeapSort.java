public class HeapSort 
{ 
    public void sort_Milan(int arr[]) 
    { 
        int n = arr.length; 
        for (int i_Milan = n / 2 - 1; i_Milan >= 0; i_Milan--) 
            heapify_Milan(arr, n, i_Milan); 
        for (int i_Milan=n-1; i_Milan>=0; i_Milan--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i_Milan]; 
            arr[i_Milan] = temp; 
            heapify_Milan(arr, i_Milan, 0); 
        } 
    } 
    void heapify_Milan(int arr[], int n, int i) 
    { 
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify_Milan(arr, n, largest); 
        } 
    } 
    static void printArray_Milan(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        int n = arr.length; 
  
        HeapSort ob = new HeapSort(); 
        ob.sort_Milan(arr); 
  
        System.out.println("Sorted array is"); 
        printArray_Milan(arr);
        System.out.println("kshitiz,08,B");
    } 
}
