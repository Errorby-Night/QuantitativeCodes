public class EulersPhi {
    public static int totient(int n){
        int res = n;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                while(n % i == 0)
                    n /= i;
                res -= res/i;
            }
        }
        if(n > 1)
            res -= res / n;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(totient(8));

    }
}
