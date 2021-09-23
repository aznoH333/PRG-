public class main {
    public static void main(String[] args) {
        String input = "BACFAB";
        boolean ba = false;
        boolean ab = false;
        for (int i = 0; i < input.length() - 1; i++) {
            String segment = input.substring(i,i+2);
            if (segment.equals("AB")){ ab = true; i++; }
            if (segment.equals("BA")){ ba = true; i++; }
        }
        //xd
        System.out.println(ba && ab);
    }
}
