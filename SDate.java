
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
        this.year = null;
        this.month = null;
        this.day = null;
        this.hour = null;
        this.min = null;
        this.sec = null;
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
        this.hour = null;
        this.min = null;
        this.sec = null;
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
        if(this.year != null){return this.year;}
        else{return 2020;}
    }

    /**
     * Sets the year
     * @param year in Integer
     * @author Sébastien HERT
     */
    public void setYear(Integer year) {
        this.year = year;
        if(this.month==null){this.month = 1;}
        if(this.day==null){this.day = 1;}
    }

    /**
     * Gets the month
     * @return month in Integer
     * @author Sébastien HERT
     */
    public Integer getMonth() {
        if(this.month != null){return this.month;}
        else{return 1;}
    }

    /**
     * Sets the month
     * @param month in Integer
     * @author Sébastien HERT
     */
    public void setMonth(Integer month) {
        this.month = month;
        if(this.year==null){this.year = 2020;}
        if(this.day==null){this.day = 1;}
    }

    /**
     * Gets the day
     * @return day in Integer
     * @author Sébastien HERT
     */
    public Integer getDay() {
        if(this.day != null){return this.day;}
        else{return 1;}
    }

    /**
     * Sets the day
     * @param day in Integer
     * @author Sébastien HERT
     */
    public void setDay(Integer day) {
        this.day = day;
        if(this.year==null){this.year = 2020;}
        if(this.month==null){this.month = 1;}
    }

    /**
     * Gets the hour
     * @return hour in Integer
     * @author Sébastien HERT
     */
    public Integer getHour() {
        if(this.hour != null){return this.hour;}
        else{return 0;}
    }

    /**
     * Sets the hour
     * @param hour in Integer
     * @author Sébastien HERT
     */
    public void setHour(Integer hour) {
        this.hour = hour;
        if(this.min==null){this.min = 0;}
        if(this.sec==null){this.sec = 0;}
    }

    /**
     * Gets the minute
     * @return min in Integer
     * @author Sébastien HERT
     */
    public Integer getMin() {
        if(this.min != null){return this.min;}
        else{return 0;}
    }

    /**
     * Sets the minute
     * @param min in Integer
     * @author Sébastien HERT
     */
    public void setMin(Integer min) {
        this.min = min;
        if(this.hour==null){this.hour = 0;}
        if(this.sec==null){this.sec = 0;}
    }

    /**
     * Gets the seconde
     * @return sec in Integer
     * @author Sébastien HERT
     */
    public Integer getSec() {
        if(this.sec != null){return this.sec;}
        else{return 0;}
    }

    /**
     * Sets the seconde
     * @param sec in Integer
     * @author Sébastien HERT
     */
    public void setSec(Integer sec) {
        this.sec = sec;
        if(this.min==null){this.min = 0;}
        if(this.hour==null){this.hour = 0;}
    }

    /**
     * ToString method
     * @return the date as a String
     * @author Sébastien HERT
     */
    @Override
    public String toString(){
        String s;
        s = this.getYear()+"/"+feelZero(this.getMonth())+"/"+feelZero(this.getDay());
        if(this.hour != null && this.min != null && this.sec != null){
            s = s+" - "+feelZero(this.hour)+":"+feelZero(this.min)+":"+feelZero(this.sec);
        }
        return s;
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

        return  this.getYear().equals(date.getYear())
                && this.getMonth().equals(date.getMonth())
                && this.getDay().equals(date.getDay())
                && this.getHour().equals(date.getHour())
                && this.getMin().equals(date.getMin())
                && this.getSec().equals(date.getSec());

    }

    /**
     * Is a SDate superior to another one
     * @param date the SDate to compare with
     * @return a Boolean
     * @author Sébastien HERT
     */
    public Boolean isSup(SDate date){
        if (this.getYear() > date.getYear()){return true;}
        else if(this.getYear() < date.getYear()){return false;}
        else{
            if (this.getMonth() > date.getMonth()){return true;}
            else if(this.getMonth() < date.getMonth()){return false;}
            else{
                if (this.getDay() > date.getDay()){return true;}
                else if(this.getDay() < date.getDay()){return false;}
                else{
                    if (this.getHour() > date.getHour()){return true;}
                    else if(this.getHour() < date.getHour()){return false;}
                    else{
                        if (this.getMin() > date.getMin()){return true;}
                        else if(this.getMin() < date.getMin()){return false;}
                        else{
                            if (this.getSec() > date.getSec()){return true;}
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

    
    
}