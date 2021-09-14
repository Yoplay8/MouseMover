import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String args[]) {
        try {
            int hours = 12;
            int minutes = 0;
            int totalTime = (hours * 60) + minutes;
            Robot robot = new Robot();
            while(totalTime >= 1){
                System.out.println(totalTime / 60 + " hours " + totalTime % 60 + " minutes left");
                //System.out.println("ctrl+f2 to kill");
                totalTime--;
                robot.mouseMove(36, 636);
                TimeUnit.MINUTES.sleep(1);
                robot.mouseMove(36, 631);
//                robot.mouseMove(667, 91);
//                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//                TimeUnit.MILLISECONDS.sleep(400);
//                robot.mouseMove(491, 91);
//                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//                TimeUnit.MILLISECONDS.sleep(400);
            }
        } catch (Exception e) {
        }
    }
}
