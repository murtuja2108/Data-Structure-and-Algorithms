package Strings.StringBuilders;

public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.charAt(3));
        sb.append("mnop");
        System.out.println(sb);
        sb.delete(3,6);//deletes from 3 to 5 index elements
        System.out.println(sb);

        //Insert
        sb.insert(3,'d');
        System.out.println(sb);
    }
}
