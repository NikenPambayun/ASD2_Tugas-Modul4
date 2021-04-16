package Tugas4;
public class No_2 {
    public static void BubbleSort(int[] A) {
        int i=1, j, n = A.length;
        int temp;
        while(i<n) {
            j = n-1;
            while(j>=i) {
                if(A[j-1]>A[j]) {
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static void Tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        No_2.Tampil(A);
        No_2.BubbleSort(A);
        No_2.Tampil(A);
        
        System.out.println();
        System.out.println("RR. Niken Pambayun Dyah Setyawati");
    }
}
