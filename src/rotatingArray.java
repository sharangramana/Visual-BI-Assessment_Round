import java.util.*;

// QUESTION 2

public class rotatingArray
{
    public static void rotate_elements(int[] array,int k){
        k = k%array.length;
        int temp,i,j;
        for(j=0;j<k;j++){
            temp=array[array.length-1];
            for(i=array.length-1;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=temp;
        }
        for(i=0;i<array.length;i++){
            System.out.format("%d ",array[i]);
        }
    }

    // second method
    public static void rotate_elements_2(int[] array, int k) {
        k %= array.length;
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
    }
    public static void reverse(int A[], int low, int high)
    {
        for (int i = low, j = high; i < j; i++, j--)
        {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Start Entering the array elements");
        int array[] = new int[size];
        int array2[] = new int[size];
        for(int i=0;i<size; i++) {
            array[i] = sc.nextInt();
            array2[i] = array[i];
        }
        System.out.println("Enter the value of K to rotate K times");
        int k = sc.nextInt();
        //int[] array={1,2,3,4,5,6,7};
        //int k=3;
        System.out.println("First method");
        rotate_elements(array,k);
        System.out.println();
        System.out.println("Second method");
        rotate_elements_2(array2, k);
        for(int i=0;i<array2.length;i++){
            System.out.format("%d ",array2[i]);
        }
    }
}
