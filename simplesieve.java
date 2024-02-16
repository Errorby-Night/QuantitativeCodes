import java.util.*;
class simplesieve{
    public static void sieve(int n){

        boolean prime[] = new boolean[n+1];

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(prime[i] == false){
                for(int j = i*i; j <= n; j+=i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 0; i <= n; i++)
            if(!prime[i])
                System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value: ");
        n = sc.nextInt();
        sieve(n);
        sc.close();
    }
}