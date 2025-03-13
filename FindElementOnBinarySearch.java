public class FindElementOnBinarySearch{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,5,8,9,10,14,18,20,23,29,34,68,77,90,103};    
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,103));
    }

    public static int findElement(int[] arr,int start,int end,int key){
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] ==  key){
                result = mid;
                break;
            }else if(key < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }   
        return result;
    }

    public static int recursiveBinarySearch(int[] arr,int start,int end,int key){
        if(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] ==  key){
                return mid;
            }else if(key < arr[mid]){
                return recursiveBinarySearch(arr, start, mid-1, key);
            }else{
                return recursiveBinarySearch(arr, mid+1, end, key);
            }
        }else{
            return -1;
        }
    }
}
