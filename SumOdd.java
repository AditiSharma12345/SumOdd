public class SumOdd {
    public static boolean isOdd(int number)
    {
        if(number<0 || (number%2)==0)
        {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        if(start<=end && start>0 && end>0)
        {
            for(int i=start;i<=end;i++)
            {
                if(isOdd(i))
                {
                    sum =  sum + i;
                }
            }
            return sum;
        }
        return -1;

    }
}
