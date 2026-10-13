package Strings;

public class UpdateEvenPositionsInString {
    public static void main(String[] args) {
        String s="Murtuja";
        String s1="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                s1 +='a';
            }
            else{
                s1+=s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
