import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class OutputLogic {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void matchesCount(){
        System.out.println("Колличество спичек на столе: " + mainClassLogic.count );
    }

    public static void personMove() {
        int i=0;
        System.out.println("Ваш ход. Введите число спичек: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if(s.equals("1") || s.equals("2") || s.equals("3")){
                mainClassLogic.personMove = Integer.parseInt(s);
            }else{
                System.out.println("Некорректное число спичек. Попробуйте ещё раз.");
                personMove();
            }
        }
        catch (IOException e) {
        }

    }
    public static  void winnerIs(){
        matchesCount();
        if(mainClassLogic.count == 1) {
            if (mainClassLogic.moveCount % 2 == 0) {
                System.out.println("Вы выиграли.");
            } else if (mainClassLogic.moveCount % 2 == 1) {
                System.out.println("Вам досталась последняя спичка. Вы проиграли.");
            }
        }
    }
}
