import java.util.Arrays;

public class IncrementalSieve {
    public static void incSieve(int l, int h){
        boolean prime[] = new boolean[h+1];
        Arrays.fill(prime, true);

        for(int i = 2; i * i <= h; i++){
            if (prime[i]){
                for(int j = i * i; j <= h; j+= i)
                    prime[j] = false;
            }
        }
        for(int i = l; i <= h; i++)
            if(prime[i])
                System.out.print(i + " ");
    }    
    public static void main(String[] args) {
        incSieve(100, 200);
    }
}
