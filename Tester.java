public class Tester{



    public static void main(String[] args) {
        SDate date1 = new SDate(2020, 1, 1, 5, 4, 7);
        SDate date2 = new SDate(date1);
        System.out.println(date2);        
    }
}