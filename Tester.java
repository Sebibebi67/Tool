public class Tester{



    public static void main(String[] args) {
        SDate date1 = new SDate(2020, 1, 1, 5, 4, 7);
        // SDate date2 = new SDate(2019, 10, 22);
        // SDate date2 = new SDate(date1);
        // System.out.println(date2);
        System.out.println(date1);
        // System.out.println(date2);
        date1.removeTime(19, 45, 67, 89, 79, 90);
        // date1.removeDay(71);
        // date2.addDay(71);
        System.out.println(date1);
        // System.out.println(date2);
        // date1.removeDay(31);
    }
}