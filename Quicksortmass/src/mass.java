public class mass {
    private static void QuickSort(int[] array, int left, int right) {
        int index = partition(array,left,right);
        if(left<index-1)
            QuickSort(array,left,index-1);
        if(index<right)
            QuickSort(array,index,right);
    }
    private static int partition(int[] array, int left,int right) {
        int pivot =  array[(left+right)/2];
        while(left<=right) {
            while(array[left]<pivot)
                left++;
            while(array[right]>pivot)
                right--;
            if(left<=right){
                int tmp = array[left];
                array[left]= array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,4,13,5,89,102,2,1};
        QuickSort(arr,0, arr.length -1);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
