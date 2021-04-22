import java.util.ArrayList;
import java.util.Scanner;
public class Monster {
    private int maxHP;
    private int currentHP;
    private String name;
    private int state;
    private ArrayList<MonsterAttack> attacks = new ArrayList<MonsterAttack>();

    public void setMonster()
    {
        int Acounter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the name of the monster?");
        name = sc.nextLine();

        System.out.println("How many hit-points does the monster have?");
        maxHP = sc.nextInt();
        while(maxHP < 1)
        {
            System.out.println("Enter a valid number!");
            maxHP = sc.nextInt();
        }

        currentHP = maxHP;
        state = 1;

        System.out.println("How many attacks does the monster have?");
        Acounter = sc.nextInt();
        while(Acounter < 1)
        {
            System.out.println("Enter a valid number!");
            Acounter = sc.nextInt();
        }

        for(int counter = 0; counter<Acounter; counter++)
        {
            MonsterAttack attack = new MonsterAttack();
            attack.setAttack();
            attacks.add(attack);
        }

    }
    public void setCurrentHP(int damage)
    {
        currentHP -= damage;
        if(currentHP <= 0)
        {
            state = 0;
        }
    }
    public void printMonster()
    {
        System.out.println("Name of the monster: " + name);

        System.out.println("MAX HP: " + maxHP);

        System.out.println("Current HP: " + currentHP);

        System.out.print("State: ");
        if(state == 0)
        {
            System.out.println("DEAD");
        }else{
            System.out.println("ALIVE");
        }

        int attacksCounter = attacks.size();
        for(int counter = 0; counter<attacksCounter; counter++)
        {
            attacks.get(counter).printAttack();
        }

    }
}
