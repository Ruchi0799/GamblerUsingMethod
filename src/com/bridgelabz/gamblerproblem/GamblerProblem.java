package com.bridgelabz.gamblerproblem;
import java.lang.Math;
public class GamblerProblem {
    public static int $DAILY = 100;
    public static final int $PERGAME = 1;
    public static final int WIN = 1;
    public static final int LOSE = 0;
    public static int TOTALAMOUNT = 100;
    public static int WinningAmount,LosingAount,stake;
    public static int[] array1;

    public static void WinOrLose()
    {
        double Action = Math.floor(Math.random() * 10) % 2;
        if ((int) Action == WIN) {
            stake = stake + 1;
            System.out.println("You won $1 your current stake value is : $" + stake);

        } else if ((int) Action == LOSE) {
            stake = stake - 1;
            System.out.println("You lose $1 your current stake value is : $" + stake);
        }
    }

    public static int TerminateGame()
    {
        LosingAount=(int) Math.round($DAILY*50/100);
        WinningAmount=(int) Math.round($DAILY + ($DAILY*50/100));
        stake=$DAILY;
        boolean stop=true;
        while (stop==true)
        {
            WinOrLose();
            if(stake==WinningAmount)
            {
                stop=false;
                System.out.println("You WON");
            }
            else if(stake==LosingAount)
            {
                stop=false;
                System.out.println("You LOSE");
            }
        }
        return stake;
    }

    public static void CalculateAmountLostOrWon(int days){
        for(int i=0;i<days;i++)
        {
            array1=new int[days];
            int x=TerminateGame();
            array1[i]=x;
            TOTALAMOUNT=TOTALAMOUNT+x;
            System.out.println("The amount won in " + days + " days is : $" +TOTALAMOUNT);

        }

    }
    public static void main(String[] args) {

        //WinOrLose();
        int i = TerminateGame();
        System.out.println(i);
        CalculateAmountLostOrWon(30);

    }


}
