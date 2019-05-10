import org.junit.Test;

/**
 * Created by Arrome on 2019/4/27.
 */
public class DayTest {

    @Test
    public void compare(){
        Day[] days = new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        for (int i = 0; i <days.length ; i++) {
            System.out.println("day["+i+"].ordinal():"+days[i].ordinal());
        }

        //compareTo方法，内部通过ordinary()值比较
        System.out.println(days[0].compareTo(days[1]));
    }

    @Test
    public void getEnumObject(){
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++){
            Day day = days[i];
            System.out.println(day.ordinal() + "---" + day.name());
        }
    }

    @Test
    public void getClassTest(){
        Class<?> clazz = Day.MONDAY.getDeclaringClass();
        System.out.println(clazz.getName());
    }

    @Test
    public void getFromEnum(){
        Day day1 = Enum.valueOf(Day.class,"MONDAY");
        System.out.println("Monday's name:" + day1.name());
        System.out.println("Monday's ordinal:" + day1.ordinal());
    }
}
