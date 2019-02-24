public class Sort {
    public static void main(String[]args) {
        int[]mass={1,12,45,13,34,25, 1,0,-123,19};
        sort(mass);
        printArray(mass);

    }
    public static int[] sort(int[]A) {
        for (int i = 0; i < A.length; i++) {
            int minIndex = i;
            for(int j=i+1; j<A.length; j++) {
                if(A[j] < A[minIndex]){
                    minIndex = j;

                }
            }

            int temp =A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;

        }
        return A;
    }

    public static void printArray(int[]A){
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }
}
