public class LengethOfLastWord {
    public static void main(String[] args) {
        String str ="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
        String a =s.trim();
        String[] ab = a.split(" ");
        return ab[ab.length-1].length();
    }
}
