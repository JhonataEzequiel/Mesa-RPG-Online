import java.util.ArrayList;
import java.util.Scanner;

public class DM {
    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    public void createMonster()
    {
        Scanner sc = new Scanner();
        int monsterCounter, counter;
        System.out.println("How Many monsters you wish to create?");
        monsterCounter = sc.nextInt();
        while(monsterCounter < 1)
        {
            System.out.println("Enter a valid number!");
            monsterCounter = sc.nextInt();
        }

        for(counter = 0; counter < monsterCounter; counter++)
        {
            Monster monster = new Monster();
            monster.setMonster();
            monsters.add(monster);
        }
    }
}
