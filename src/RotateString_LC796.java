public class RotateString_LC796 {
    public static void main(String[] args) {
            String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.substring(1)).append(s.charAt(0));
            s = sb.toString();
            if (s.equals(goal)) return true;
            sb.setLength(0);
        }
        return false;
    }
}
