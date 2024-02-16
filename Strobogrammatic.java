import java.util.*;

public class Strobogrammatic {
    public static boolean isStroboNorm(String n) {
        int i = 0, j = n.length() - 1;
        while (i <= j) {
            if ((n.charAt(i) == '1' && n.charAt(j) == '1') || 
                (n.charAt(i) == '0' && n.charAt(j) == '0') || 
                (n.charAt(i) == '8' && n.charAt(j) == '8') ||
                (n.charAt(i) == '6' && n.charAt(j) == '9') || 
                (n.charAt(i) == '9' && n.charAt(j) == '6')) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isStroboMap(String n){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int i = 0, j = n.length() - 1;
        while (i <= j) {
            if(!map.containsKey(n.charAt(i)) || !map.containsKey(n.charAt(j)))
                return false;
            if(map.get(n.charAt(i)) != map.get(n.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStroboMap("1881"));
        System.out.println(isStroboNorm("18812"));
    }
}
