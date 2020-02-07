
/**
 * Describes a non-deprecated Date class
 * @author Sébastien HERT
 */
public class SDate{

    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer min;
    private Integer sec;

    /**
     * Constructor
     * @author Sébastien HERT
     */
    public SDate(){
        this.year = 2020;
        this.month = 1;
        this.day = 1;
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    /**
     * Constructor
     * @param date in SDate
     * @author Sébastien HERT
     */
    public SDate(SDate date){
        this.year = date.getYear();
        this.month = date.getMonth();
        this.day = date.getDay();
        this.hour = date.getHour();
        this.min = date.getMin();
        this.sec = date.getSec();
    }

    /**
     * Constructor
     * @param year in Integer
     * @param month in Integer
     * @param day in Integer
     * @author Sébastien HERT
     */
    public SDate(Integer year, Integer month, Integer day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    /**
     * Constructor
     * @param year in Integer
     * @param month in Integer
     * @param day in Integer
     * @param hour in Integer
     * @param min in Integer
     * @param sec in Integer
     * @author Sébastien HERT
     */
    public SDate(Integer year, Integer month, Integer day, Integer hour, Integer min, Integer sec){
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    /**
     * Gets the year
     * @return year in Integer
     * @author Sébastien HERT
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Sets the year
     * @param year in Integer
     * @author Sébastien HERT
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Gets the month
     * @return month in Integer
     * @author Sébastien HERT
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Sets the month
     * @param month in Integer
     * @author Sébastien HERT
     */
    public void setMonth(Integer month) {
        this.month = month;
    }

    /**
     * Gets the day
     * @return day in Integer
     * @author Sébastien HERT
     */
    public Integer getDay() {
        return this.day;
    }

    /**
     * Sets the day
     * @param day in Integer
     * @author Sébastien HERT
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Gets the hour
     * @return hour in Integer
     * @author Sébastien HERT
     */
    public Integer getHour() {
        return this.hour;
    }

    /**
     * Sets the hour
     * @param hour in Integer
     * @author Sébastien HERT
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * Gets the minute
     * @return min in Integer
     * @author Sébastien HERT
     */
    public Integer getMin() {
        return this.min;
    }

    /**
     * Sets the minute
     * @param min in Integer
     * @author Sébastien HERT
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * Gets the seconde
     * @return sec in Integer
     * @author Sébastien HERT
     */
    public Integer getSec() {
        return this.sec;
    }

    /**
     * Sets the seconde
     * @param sec in Integer
     * @author Sébastien HERT
     */
    public void setSec(Integer sec) {
        this.sec = sec;
    }

    /**
     * ToString method
     * @return the date as a String
     * @author Sébastien HERT
     */
    @Override
    public String toString(){
        return this.getYear()+"/"+feelZero(this.getMonth())+"/"+feelZero(this.getDay())+" - "+feelZero(this.hour)+":"+feelZero(this.min)+":"+feelZero(this.sec);
    }

    /**
     * Creates a String with 
     * @param i in Integer
     * @return I as a String
     */
    public String feelZero(Integer i){
        if( i < 10 ){
            return "0"+i;
        }else{
            return Integer.toString(i);
        }
    }

    /**
     * Are 2 SDates equals
     * @param date the sDate to compare with
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean equals(SDate date){

        return  this.year.equals(date.getYear())
                && this.month.equals(date.getMonth())
                && this.day.equals(date.getDay())
                && this.hour.equals(date.getHour())
                && this.min.equals(date.getMin())
                && this.sec.equals(date.getSec());

    }

    /**
     * Is a SDate superior to another one
     * @param date the SDate to compare with
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isSup(SDate date){
        if (this.year > date.getYear()){return true;}
        else if(this.year < date.getYear()){return false;}
        else{
            if (this.month > date.getMonth()){return true;}
            else if(this.month < date.getMonth()){return false;}
            else{
                if (this.day > date.getDay()){return true;}
                else if(this.day < date.getDay()){return false;}
                else{
                    if (this.hour > date.getHour()){return true;}
                    else if(this.hour < date.getHour()){return false;}
                    else{
                        if (this.min > date.getMin()){return true;}
                        else if(this.min < date.getMin()){return false;}
                        else{
                            if (this.sec > date.getSec()){return true;}
                            else{return false;}
                        }
                    }
                }                            
            }   
        }
    }

    /**
     * Is a SDate inferior to another one
     * @param date the SDate to compare with
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isInf(SDate date){
        return !this.equals(date) && !this.isSup(date);
    }

    /**
     * Checks if the SDate is valid or not
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValid(){
        return  this.isValidMonth()
                && this.isValidDay()
                && this.isValidHour()
                && this.isValidMin()
                && this.isValidSec();
    }

    /**
     * Checks if the month is valid
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValidMonth(){
        return this.month <= 12 && this.month > 0;
    }

    /**
     * Checks if the day is valid depeding on the month and the year
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValidDay(){
        return this.day > 0 && this.day <= this.getDaysPerMonth();
    }

    /**
     * Checks if the hour is valid (24-hour clock)
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValidHour(){
        return this.hour >= 0 && this.hour < 24;
    }

    /**
     * Checks if the minutes are valid
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValidMin(){
        return this.min >=0 && this.min < 60;
    }

    /**
     * Checks if the seconds are valid
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isValidSec(){
        return this.sec >=0 && this.sec < 60;
    }

    /**
     * Gives the number of days in the month of the SDate
     * @return the number of days
     * @author Sébastien HERT
     */
    public int getDaysPerMonth(){
        if (this.month<8){
            if(this.month%2==1){return 31;}
            else if (this.month == 2){
                if (this.year%4 == 0){return 29;}
                else{return 28;}
            }else{return 30;}
        }else{
            if(this.month%2==0){return 31;}
            else{return 30;}
        }
    }

    /**
     * Adds a time to the SDate
     * @param year the number of years to add
     * @param month the number of months to add
     * @param day the number of days to add
     * @param hour the number of hours to add
     * @param min the number of minutes to add
     * @param sec the number of secondes to add
     * @author Sébastien HERT
     */
    public void addTime(Integer year, Integer month, Integer day, Integer hour, Integer min, Integer sec){
        this.addSec(sec);
        this.addMin(min);
        this.addHour(hour);
        this.addDay(day);
        this.addMonth(month);
        this.addYear(year);
    }

    /**
     * Adds a time to the SDate
     * @param year the number of years to add
     * @param month the number of months to add
     * @param day the number of days to add
     * @author Sébastien HERT
     */
    public void addTime(Integer year, Integer month, Integer day){
        this.addDay(day);
        this.addMonth(month);
        this.addYear(year);
    }

    /**
     * Adds a number of years to the Sdate
     * @param year the number of years to add
     * @author Sébastien HERT
     */
    public void addYear(Integer year){
        year = Math.abs(year.intValue());
        this.year = this.year+year;
    }

    /**
     * Adds the number of months to the Sdate
     * @param month the number of months to add
     * @author Sébastien HERT
     */
    public void addMonth(Integer month){
        month = Math.abs(month.intValue());
        if ((this.month+month)%12 != 0){this.month = ((this.month+month)%12);}
        else{this.month = 12;}
        this.addYear((this.month)/12);
    }

    /**
     * Adds the number of days to the Sdate
     * @param day the number of days to add
     * @author Sébastien HERT
     */
    public void addDay(Integer day){
        day = Math.abs(day.intValue());
        if ((this.day+day)%this.getDaysPerMonth() != 0){
            this.day = (this.day+day)%(this.getDaysPerMonth());}
        else{this.day = this.getDaysPerMonth();}

        this.addMonth((this.day)/this.getDaysPerMonth());
    }

    /**
     * Adds the number of hours to the Sdate
     * @param hour the number of hours to add
     * @author Sébastien HERT
     */
    public void addHour(Integer hour){
        hour = Math.abs(hour.intValue());
        int q = (this.hour+hour)/24;
        this.hour = (this.hour+hour)%24;
        this.addDay(q);
    }

    /**
     * Adds the number of minutes to the Sdate
     * @param min the number of minutes to add
     * @author Sébastien HERT
     */
    public void addMin(Integer min){
        min = Math.abs(min.intValue());
        int q = (this.min+min)/60;
        this.min = (this.min+min)%60;
        this.addHour(q);
    }

    /**
     * Adds the number of seconds to the Sdate
     * @param sec the numbere of secondes to add
     * @author Sébastien HERT
     */
    public void addSec(Integer sec){
        sec = Math.abs(sec.intValue());
        int q = (this.sec+sec)/60;
        this.sec = (this.sec+sec)%60;
        this.addMin(q);
    }

    
    
}