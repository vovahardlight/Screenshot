import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String name = read.next();


        ScreenShot screenshot1 = new ScreenShot();
        ScreenShot screenshot2 = new ScreenShot(name);
screenshot1.setName("Screenshot");

        System.out.println(screenshot1.getName());
        System.out.println(screenshot2.getName());

    }
}
class ScreenShot{
    private String name;

    ScreenShot(){


    }
    ScreenShot(String name){
this.name=name;

    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}