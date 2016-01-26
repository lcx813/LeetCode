/*
how many digits in said guess match your secret number exactly in both digit and position (called "bulls").
how many digits match the secret number but locate in the wrong position (called "cows").
*/
public class Solution {
    public String getHint(String secret, String guess) {
        int counterA=0, counterB=0;
        int[] array=new int[10];
        
        for(int i=0;i<secret.length();i++){
        int a = secret.charAt(i) - '0', b = guess.charAt(i) - '0';
        
        //accurate match (same digit with same position)
        if(a==b) counterA++;
        else{
            
         //if prev part of guess has curr digit in secret
        //then we found a pair that has same digit with different position
        if(array[a]<0) counterB++;
        
        //if prev part of secret has curr digit in guess
        //then we found a pair that has same digit with different position  
        if(array[b]>0) counterB++;
        
        array[a]++;
        array[b]--;
            
        }
            
        }
        return counterA + "A" + counterB + "B";

    }
}