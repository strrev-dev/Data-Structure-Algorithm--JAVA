public class BinarySearch {
    public static int BinarySearchNumber(int numbers[], int key){
        int start= 0,end= numbers.length -1;
        while(start<=end){
            int mid = (start + end)/2 ;
            if ( numbers[mid] == key){
             return mid;
            }
            else if( numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;

            }
    }
    return -1;
}
    
    public static void main(String[] args){
         int numbers[]= {2,3,4,5,6,7,8,9,13,14,19};
         int key = 9;
         System.out.print("Index of the Key number  is : " + BinarySearchNumber(numbers,key));

    }
}
