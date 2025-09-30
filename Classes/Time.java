package ClassesDemo;
 public class Time  {
     int hour;
     int minute;
    double second;

    Time()  {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    Time(int hour, int minute, double second)  {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void display(){
        System.out.println(hour  +" " + minute + " " +second);
    }

   
public static void main(String[] args) {
    Time t1=new Time();
    t1.display();
    Time t2=new Time(2,60,60);
    t2.display();
}


 }
 
 
