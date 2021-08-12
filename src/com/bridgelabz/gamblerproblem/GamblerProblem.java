package com.bridgelabz.gamblerproblem;
import java.lang.Math;
public class GamblerProblem {
    public static int $DAILY = 100;
    public static final int $PERGAME = 1;
    public static final int WIN = 1;
    public static final int LOSE = 0;
    public static int TOTALAMOUNT = 100;
    public static int WinningAmount,LosingAount,stake;
    //public static int[] array1;

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

    public static int[] CalculateAmountLostOrWon(int days){
        int[] array1=new int[days];
        for(int i=0;i<days;i++)
        {

            int x=TerminateGame();
            array1[i]=x;
            TOTALAMOUNT=TOTALAMOUNT+x;
            System.out.println("The amount won in " + days + " days is : $" +TOTALAMOUNT);


        }
        return array1;
    }
    public static void PrintAmountWonDaily(int[] array1)
    {
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]==WinningAmount)
            {
                System.out.println("Day " +i+ " You Won. Your total amount is " +array1[i] );
            }
            else if(array1[i]==LosingAount)
            {
                System.out.println("Day " +i+ " You lose. Your total amount is " +array1[i] );
            }
            //System.out.println("The amount won on day " + i + " is " +array1[i]);
        }
    }

    public static void main(String[] args) {

        //WinOrLose();
        int i = TerminateGame();
        System.out.println(i);
        //CalculateAmountLostOrWon(30);
        int[] array2=CalculateAmountLostOrWon(30);
        PrintAmountWonDaily(array2);

    }


}
