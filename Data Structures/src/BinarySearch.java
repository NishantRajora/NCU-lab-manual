public class BinarySearch {

    int bSearch(int [] array, int num, int low, int high)
    {
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(num == array[mid])
            {
                return mid;
            }
            else if(num > array[mid])
            {
                return bSearch(array, num, mid+1, high);
            }
            else
            {
                return bSearch(array, num, low, mid-1);
            }
        }
        return -1;
    }
    
}
