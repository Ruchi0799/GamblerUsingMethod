package com.bridgelabz.gamblerproblem;

public class GamblerProblem {
    public static int $DAILY = 100;
    public static final int $PERGAME = 1;
    public static final int WIN = 1;
    public static final int LOSE = 0;

    public static void WinOrLose()
    {
        double Action = Math.floor(Math.random() * 10) % 2;
        if ((int) Action == WIN) {
            $DAILY = $DAILY + 1;
            System.out.println("You won $1 your current stake value is : $" + $DAILY);

        } else if ((int) Action == LOSE) {
            $DAILY = $DAILY - 1;
            System.out.println("You lose $1 your current stake value is : $" + $DAILY);
        }
    }

    public static void main(String[] args) {

        WinOrLose();

    }


}
