public class LargestPrime {
    public static int getLargestPrime(int number){
        for (int i = number; i > 1; i--){
            if (number % i == 0){
                int count = 0;
                for (int j = i-1; j > 1; j--){
                    if (i % j == 0){
                        count++;
                    }
                }
                if (count == 0){
                    return i;
                }
            }
        }
        return -1;
    }
}
