public class CharacterExtractionDemo {
    public static void main(String[] args) {
        String s1 = "Hello World";
        char ch = s1.charAt(6);
        System.out.println("Character at index 6 using CharAt() : " + ch);

        char chars[] = new char[5];
        s1.getChars(0, 5, chars, 0);
        System.out.println("First 5 characters using getChars() : " + new String(chars));

        String s2 = "Java Programming";
        byte bytes[] = s2.getBytes();
        System.out.println("Bytes of s2 using getBytes() :");
        for(int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }

        String s3 = "Hello";
        char chs[] = s3.toCharArray();
        System.out.println("\nCharacters in s3 using toCharArray() :");
        for(int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "");
        }
    }
    
}
