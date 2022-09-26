public class ArraySum 
{
    public int sumOfArray(Integer[] array, int size) 
    {
        if (size == 0) 
        {
            return 0;
        } else 
        {
            return array[size - 1] + sumOfArray(array, size - 1);
        }
    }
}