public class Tester{



    public static void main(String[] args) {
        String s = "This is what i want to crypt";
        String encoded = Hasher.hashing(s);
        System.out.println(s);
        System.out.println(encoded);
        System.out.println(Hasher.isValidePwd(s, encoded));
        
    }
}