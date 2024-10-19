public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int n)
    {
        if (n == 1 || n == 2)
            return true;
        else
        {
            for(int i=2; i<n; i++)
                if(n % i == 0)
                    return false;
            return true;
        }
    }
}