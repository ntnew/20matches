public class ComputerLogic {

    public static void move(){

        if(mainClassLogic.moveCount==0){
            mainClassLogic.compMove = 3;
        }
        else {
            //4-ход человека
            mainClassLogic.compMove = 4 - mainClassLogic.personMove;
        }
    }
}
