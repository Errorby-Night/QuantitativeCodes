import java.util.*;
class simplesieve{
    public void ssieve(int n){
        boolean flag[] = new boolean[n+1];
        for(int i = 0; i < n; i++){
            flag[i] = true;
        }
        for(int i = 2; i <= (int)(Math.ceil(Math.sqrt(n)) + 1); i++){
            if(flag[i]){
                for(int j = 2; (j * i) <= n; j++){
                    flag[j*i] = false;
                }
            }
        }
        printPrimes(flag, n);
    }

    public void printPrimes(boolean [] flag , int n ){
        System.out.println("The Prime Numbers are: ");
        for(int i = 2; i <= n; i++){
            if(flag[i])
                System.out.print(i+ " ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        simplesieve s = new simplesieve();
        s.ssieve(n);
        sc.close();
    }
}