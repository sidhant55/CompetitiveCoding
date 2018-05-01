/* Java program for Merge Sort */
import java.util.*;
class merge1
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static int a[];
    void merge(float arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        float L[] = new float [n1];
        float R[] = new float [n2];

        int left[]=new int [n1];
        int right[]=new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
        {
            L[i] = arr[l + i];
            left[i]=a[l+i];
        }
        for (int j=0; j<n2; ++j)
        {
            R[j] = arr[m + 1+ j];
            right[j]=a[m + 1+ j];
        }
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] < R[j])
            {
                arr[k] = L[i];
                a[k]=left[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                a[k]=right[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            a[k]=left[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            a[k]=right[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(float arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    // Driver method
public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
 
        int t=in.nextInt();
        float arr[]=new float [t];
        a=new int [t];
        for (int i=0;i<t;i++)
        {
            a[i]=i+1;
            float a=in.nextFloat();
            float b=in.nextFloat();
            float c=b/a;
            arr[i]=c;
        }
 
        merge1 ob = new merge1();
        ob.sort(arr, 0, arr.length-1);
 
        for (int i=t-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}