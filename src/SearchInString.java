public class SearchInString {
    public static void main(String[] args) {
        String s= "hello world";
        char t='m';
        System.out.println(strsearch2(s,t));
    }
    static boolean strsearch2(String s, char c){
        if(s.length()==0)
            return false;
        for(char ch:s.toCharArray()){
            if(ch==c)
                return true;
        }
        return false;
    }
    static boolean strsearch(String s, char c){
        if(s.length()==0)
            return false;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i))
                return true;
        }
        return false;
    }
}
