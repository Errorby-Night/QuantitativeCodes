public class BinaryPalindrome {
    public static boolean isBinPalNorm(int n){
        String bin = Integer.toBinaryString(n);
        int i = 0, j = bin.length() - 1;
        while (i <= j) {
            if(bin.charAt(i) != bin.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isBinPalMod(int n){
        int rev = 0, org = n;

        while (n != 0) {
            rev <<= 1; // rev = rev << 1
            rev |= n&1; // rev = rev | (n & 1)
            n >>= 1;
        }
        return rev == org;
    }

    public static void main(String[] args) {
        System.out.println(isBinPalMod(9));
        System.out.println(isBinPalNorm(27));
    }
}
