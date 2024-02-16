import java.util.*;
public class SegmentedSieve {
    public static void SegSieve(int l, int h){
        boolean nonPrime[] = new boolean[h + 1];
        for(int i = 2; i*i <= h; i++){
            int sm = (l / i) * i;
            if(sm < l)
                sm += i;
            for(int j = sm; j <= h; j+=i)
                nonPrime[j] = true;
        }
        for(int i = l; i < h; i++)
            if(!nonPrime[i])
                System.out.print(i + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        SegSieve(10, 30);
    }
}
