public class CRT {
    
    static int remainder(int size, int div[], int rem[]){
        int j, x = 1;
        while(true){
            for(j = 0; j < size; j++){
                if(x % div[j] != rem[j])
                    break;
            }
            if(j == size)
                return x;
            x++;
        }
    }
    
    public static void main(String[] args) {
        int d[] = {3, 5, 7};
        int r[] = {2, 3, 2};
        int x = remainder(3, d, r);
        System.out.println(x);
    }
}
