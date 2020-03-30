import java.io.IOException;

public class mainClassLogic {
    public static int  moveCount = 0;
    public static int count = 20;
    public static int personMove = 0;
    public static int compMove = 0;



    public static void main(String[] args)  {
        while (count > 1) {

            OutputLogic.matchesCount();

            if (moveCount % 2 != 0) {

                OutputLogic.personMove();
                //ход человека
                count-=personMove;

            } else if (moveCount % 2 == 0) {
                //ход компьютера

                ComputerLogic.move();
                count-= compMove;
                System.out.println("Ход компьютера. Количетво выбранных спичек: " + compMove );
            }
            moveCount++;
        }
        OutputLogic.winnerIs();
    }
}
