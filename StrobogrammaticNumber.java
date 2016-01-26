public class Solution {
    public boolean isStrobogrammatic(String num) {
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
       
        for(int m=0, n=num.length()-1;m<=n;){
            if(!map.containsKey(num.charAt(m))) return false;
            if(map.get(num.charAt(m))!=num.charAt(n)) return false;
            m++;
            n--;
        }
        
        
        return true;
    }
}