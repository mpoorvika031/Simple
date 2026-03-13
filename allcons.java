public class allcons {
    public static void main(String[] args) {
        
        String s1 = new String();
        s1 = "ABC";
        System.out.println("S1:" + s1);

        char chars[] = {'a','b','c','d'};
        String s2 = new String(chars);
        System.out.println("s2:" + s2);

        String s3 = new String(chars,1,3);
        System.out.println("s3:" + s3);
        
        byte bytes[] = {65,66,67,68};
        String s4 = new String(bytes);
        System.out.println("s4:" + s4);
        

        
    }
}
