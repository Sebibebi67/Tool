public class Tester{



    public static void main(String[] args) {
        SDate date1 = new SDate(2020, 1, 1, 5, 4, 7);
        System.out.println(date1);
        date1.removeTime(19, 45, 67, 89, 79, 90);
        System.out.println(date1);
    }
}