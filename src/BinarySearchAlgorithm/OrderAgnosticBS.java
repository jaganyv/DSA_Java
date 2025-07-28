package BinarySearchAlgorithm;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {23,43,56,12,32,34,54,98};
        int target = 12;
        int ans = orderAgnoBs(arr,target);
        System.out.println(ans);
    }
    static int orderAgnoBs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
