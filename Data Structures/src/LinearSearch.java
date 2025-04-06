public class LinearSearch {
    public boolean Search(int [] array, int numberToFind)
    {
        int len = array.length;
        boolean flag = false;
        for(int i = 0;i < len;i++)
        {
            if(array[i] == numberToFind)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
