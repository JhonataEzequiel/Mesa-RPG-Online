import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Table {
    private Random dice = new Random();
    private ArrayList<Player> players = new ArrayList<Player>();

    public int howManyPlayers()
    {
        return players.size();
    }
    public int rollDice()
    {
        int diceOption, diceQtd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dice that you wanna roll");
        diceOption = sc.nextInt();
        int diceResult = 0;

        while(diceOption < 1 || diceOption >100)
        {
            System.out.println("Enter a valid number!");
            diceOption = sc.nextInt();
        }

        System.out.println("How many dices do you wanna roll?");
        diceQtd = sc.nextInt();

        while(diceQtd <= 0 || diceQtd > 100)
        {
            System.out.println("Enter a number between 0 and 100");
            diceQtd = sc.nextInt();
        }
        for(int i = 0; i<diceQtd; i++)
        {
            diceResult += dice.nextInt(diceOption) + 1;
            if(diceResult-1 == diceOption)
            {
                diceResult--;
            }
        }
        System.out.println("Dice result: " + diceResult);
        return diceResult;
    }
    public void addPlayer(Player player)
    {
        players.add(player);
    }
}
