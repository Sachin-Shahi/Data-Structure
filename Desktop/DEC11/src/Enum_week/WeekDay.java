package Enum_week;

/**
 * Created by DAGR8DON on 12/11/16.
 */
public class WeekDay {
    EnumWeek day;
    public WeekDay(){

    }
    public WeekDay(EnumWeek day ){
        this.day=day;
    }

    public void whatToDoToday(){
        switch(day){

            case MONDAY:
                System.out.println("Start reading Data Structure book, Topics ArrayList");
                break;
            case TUESDAY:
                System.out.println("Start reading Data Structure book, Topics LinkedList");
                break;
            case WEDNESDAY:
                System.out.println("Start reading Data Structure book, Topics Stack and Queue");
                break;
            case THURSDAY:
                System.out.println("Start reading Data Structure book, Topics HashMap");
                break;
            case FRIDAY:
                System.out.println("Start reading Data Structure book, Topics HashTable");
                break;
            case SATURDAY:
                System.out.println("Start reading Data Structure book, Topics Sorting Algorithm");
                break;
            case SUNDAY:
                System.out.println("Start reading Data Structure book, Topics Graph and Tree");
                break;
            default:
                System.out.println("Not a valid day. you can sleep");
                break;
        }
    }

}
class TestClass{
    public static void main(String[] args) {
        WeekDay weekDay= new WeekDay(EnumWeek.MONDAY);
        weekDay.whatToDoToday();
    }
}
