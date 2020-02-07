public class Tester{



    public static void main(String[] args) {
        SDate date1 = new SDate(2020, 1, 1, 5, 4, 7);
        // SDate date2 = new SDate(2020, 2, 3);
        System.out.println(date1);
        // date1.addSec(12709);
        // date1.addHour(25);
        // date1.addDay(30);
        date1.addTime(5, 15, 15, 78, 45, 56);
        // date1.addDay(15);


        // SDate date3 = new SDate();
        // SDate date4 = new SDate(43,65,0,9,90,76);
        System.out.println(date1);
        // System.out.println(date1.isValid());
        // System.out.println(date2);
        // System.out.println(date2.isValid());
        // System.out.println(date3);
        // System.out.println(date3.isValid());
        // System.out.println(date4);
        // System.out.println(date4.isValid());
        
    }
}