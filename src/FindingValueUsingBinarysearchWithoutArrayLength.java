public class FindingValueUsingBinarysearchWithoutArrayLength {
    public static void main(String[] args){
        int[]arr = {1,2,3,5,6,7,8,9,10,11 };
        int key = 6;
        int result = getIndex(arr,key);
        if(result > -1){
            System.out.println("postion: "+result);
        }else {
            System.out.println("NOT FOUND");
        }
    }
    public static int getIndex(int[]arr,int key){
        int start = 1;
        int end = 2;
        end = getEnd(arr,start,end);  // get the end value
        while(arr[end]<key){  // if the end is less then this function will multiply the value by 2 and
                                               // increase the end index till it get the proper value
            int temp = end+(end-start+1) * 2;
            start = end+1;
            end = getEnd(arr,start,temp);
            if(temp>end){
                break;
            }
        }
        return binarySearch(arr,start,end,key); //normal binary search is done using binarySearch method and index is returned
    }

    public static int binarySearch(int[]arr,int start,int end,int key){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==key){
                return mid+1;  //in this we are considering index starts from 1 so mid + 1 is returned
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int getEnd(int[] arr,int start,int end){
        try{
            int value = arr[end];
            return end;
        }catch (ArrayIndexOutOfBoundsException e){
            if(end>start && end>=1){
                end -= 1;
                return getEnd(arr,start,end);
            }
        }
        return end;
    }
}
