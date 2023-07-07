public class GoalParserINfo {
    public static void main(String[] args) {
        String c = "G()(al)";
        System.out.println(interpret(c));
    }
    public static String interpret(String c) {
        String s="";
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='G'){
                s += c.charAt(i);
            }else if(c.charAt(i)=='(' && c.charAt(i+1)==')'){
                s+="o";
            }else if(c.charAt(i)=='(' && c.charAt(i+1)=='a'){
                s+="al";
            }
        }
        return s;

    }
}
