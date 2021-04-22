import java.util.Scanner;
public class MonsterAttack{
    private String description;
    private int ddice;//damage dices
    private int diceOp;

    public void setAttack()
    {
        String description;
        int ddice;
        int diceOp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the attack");
        description = sc.nextLine();

        System.out.println("What is the damage dice?");
        diceOp = sc.nextInt();
        while(diceOp < 4 || diceOp > 100)
        {
            System.out.println("Enter a valid number!");
            diceOp = sc.nextInt();
        }

        System.out.println("How many dices? (between 1 and 100)");
        ddice = sc.nextInt();
        while(ddice < 0 || diceOp > 100)
        {
            System.out.println("Enter a valid number!");
            diceOp = sc.nextInt();
        }

        this.description = description;
        this.ddice = ddice;
        this.diceOp = diceOp;
    }
    public void printAttack()
    {
        System.out.print("Name of the Attack: " + description + "\n");
        System.out.print("Damage: " + ddice + "d" + diceOp + "\n");
    }
}
