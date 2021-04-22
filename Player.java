//libraries
import java.util.Scanner;
import java.util.Random;

public class Player
{
    private String name;
    private int level;
    private int maxHP;
    private int currentHP;
    private int status[] = new int[6];
    private double modifiers[] = new double[6];
    private int xp;
    private int class_;
    private int lifeDice;
    private Race race = new Race();
    /* status disclaimer
    1 - Strength
    2 - Dexterity
    3 - Constituion
    4 - Intelligence
    5 - Wisdom
    6 - Charisma
    */

    /* Class diclaimer
    1 - Barbarian
    2 - Bard
    3 - Warlock
    4 - Cleric
    5 - Druid
    6 - Sorcerer
    7 - Warrior
    8 - Rogue
    9 - Mage
    10 - Monk;
    11 - Paladin
    12 - Ranger
    */

    public void showClassMenu()
    {
        System.out.println("What class is your character? Enter the number corresponding to your class");
        System.out.println("1 - Barbarian");
        System.out.println("2 - Bard");
        System.out.println("3 - Warlock");
        System.out.println("4 - Cleric");
        System.out.println("5 - Druid");
        System.out.println("6 - Sorcerer");
        System.out.println("7 - Warrior");
        System.out.println("8 - Rogue");
        System.out.println("9 - Mage");
        System.out.println("10 - Monk");
        System.out.println("11 - Paladin");
        System.out.println("12 - Ranger");
    }
    public void setPlayer(String name, int level, int maxHP, int currentHP, int status[], double modifiers[],
    int xp, int class_, int lifeDice, Race race)
    {
        this.name = name;
        this.level = level;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.status = status;
        this.modifiers = modifiers;
        this.xp = xp;
        this.class_ = class_;
        this.lifeDice = lifeDice;
        this.race = race;
    }
    public void setLifeDice(int class_)
    {
        int brk = 1;
        Scanner sc = new Scanner(System.in);
        while(brk != 0)
        {
            switch(class_)
            {
                case 1:
                    this.lifeDice = 12;
                    brk = 0;
                    break;
                case 2:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 3:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 4:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 5:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 6:
                    this.lifeDice = 6;
                    brk = 0;
                    break;
                case 7:
                    this.lifeDice = 10;
                    brk = 0;
                    break;
                case 8:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 9:
                    this.lifeDice = 6;
                    brk = 0;
                    break;
                case 10:
                    this.lifeDice = 8;
                    brk = 0;
                    break;
                case 11:
                    this.lifeDice = 10;
                    brk = 0;
                    break;
                case 12:
                    this.lifeDice = 10;
                    brk = 0;
                    break;
                default:
                    System.out.println("Enter a valid Number!");
                    class_ = sc.nextInt();
                    brk = 1;
                    break;
            }
        }
    }
    public void setModifiersAndStatus(int setupOption)
    {
        Random dice = new Random();
        Scanner sc = new Scanner(System.in);
        race.setRace();
        int option;
        if(setupOption == 0)
        {
            System.out.println("You have 6 values to allocate:");
            System.out.println("15 14 13 12 10 8");
            Integer dataValues[] = new Integer[6];

            dataValues[0] = 15;
            dataValues[1] = 14;
            dataValues[2] = 13;
            dataValues[3] = 12;
            dataValues[4] = 10;
            dataValues[5] = 8;
            
            int counter = 0;
            while(counter < 6)
            {
                System.out.println("Wich atribute do you want to put the " + dataValues[counter].toString() + " value?");
                System.out.println("1 - Strength");
                System.out.println("2 - Dexterity");
                System.out.println("3 - Constitution");
                System.out.println("4 - Intelligence");
                System.out.println("5 - Wisdom");
                System.out.println("6 - Charisma");
                option = sc.nextInt();
                while(option < 1 || option > 6)
                {
                    System.out.println("Enter a valid number!");
                    option = sc.nextInt();
                }
                if(counter == 0)
                {
                    if(option == 1)
                        this.status[0] = 15;
                    if(option == 2)
                        this.status[1] = 15;
                    if(option == 3)
                        this.status[2] = 15;
                    if(option == 4)
                        this.status[3] = 15;
                    if(option == 5)
                        this.status[4] = 15;
                    if(option == 6)
                        this.status[5] = 15;
                }
                if(counter == 1)
                {
                    if(option == 1)
                        this.status[0] = 14;
                    if(option == 2)
                        this.status[1] = 14;
                    if(option == 3)
                        this.status[2] = 14;
                    if(option == 4)
                        this.status[3] = 14;
                    if(option == 5)
                        this.status[4] = 14;
                    if(option == 6)
                        this.status[5] = 14;
                }
                if(counter == 2)
                {
                    if(option == 1)
                        this.status[0] = 13;
                    if(option == 2)
                        this.status[1] = 13;
                    if(option == 3)
                        this.status[2] = 13;
                    if(option == 4)
                        this.status[3] = 13;
                    if(option == 5)
                        this.status[4] = 13;
                    if(option == 6)
                        this.status[5] = 13;
                }
                if(counter == 3)
                {
                    if(option == 1)
                        this.status[0] = 12;
                    if(option == 2)
                        this.status[1] = 12;
                    if(option == 3)
                        this.status[2] = 12;
                    if(option == 4)
                        this.status[3] = 12;
                    if(option == 5)
                        this.status[4] = 12;
                    if(option == 6)
                        this.status[5] = 12;
                }
                if(counter == 4)
                {
                    if(option == 1)
                        this.status[0] = 10;
                    if(option == 2)
                        this.status[1] = 10;
                    if(option == 3)
                        this.status[2] = 10;
                    if(option == 4)
                        this.status[3] = 10;
                    if(option == 5)
                        this.status[4] = 10;
                    if(option == 6)
                        this.status[5] = 10;
                }
                if(counter == 5)
                {
                    if(option == 1)
                        this.status[0] = 8;
                    if(option == 2)
                        this.status[1] = 8;
                    if(option == 3)
                        this.status[2] = 8;
                    if(option == 4)
                        this.status[3] = 8;
                    if(option == 5)
                        this.status[4] = 8;
                    if(option == 6)
                        this.status[5] = 8;
                }
                counter++;
            }
        }
        if(setupOption == 1)
        {
            for(int counter = 0; counter < 6; counter++)
            {
                int d6[] = new int[4];
                int sum;
                d6[0] = dice.nextInt(6)+1;
                d6[1] = dice.nextInt(6)+1;
                d6[2] = dice.nextInt(6)+1;
                d6[3] = dice.nextInt(6)+1;
                for(int dcounter = 0; dcounter<4; dcounter++)
                {
                    if(d6[dcounter+1]>=d6[dcounter])
                    {
                        d6[dcounter] = d6[dcounter+1];
                    }
                }
                this.status[counter] = d6[0] + d6[1] + d6[2];
            }
        }
        for(int counter = 0; counter<6; counter++)
        {
            this.status[counter] += race.bonus[counter];
        }
        for(int counter = 0; counter<6; counter++)
        {
            this.modifiers[counter] = (double) (this.status[counter] - 10)/2;
            if(this.status[counter]%2 != 0)
            {
                this.modifiers[counter] = (double) ((this.status[counter] - 10)/2) - 0.5;
            }
        }
        System.out.println("Your Strength Value: " + this.status[0]);
        System.out.println("Modifier: " + this.modifiers[0]);
        System.out.println("Your Dexterity Value: " + this.status[1]);
        System.out.println("Modifier: " + this.modifiers[1]);
        System.out.println("Your Constitution Value: " + this.status[2]);
        System.out.println("Modifier: " + this.modifiers[2]);
        System.out.println("Your Intelligence Value: " + this.status[3]);
        System.out.println("Modifier: " + this.modifiers[3]);
        System.out.println("Your Wisdom Value: " + this.status[4]);
        System.out.println("Modifier: " + this.modifiers[4]);
        System.out.println("Your Charisma Value: " + this.status[5]);
        System.out.println("Modifier: " + this.modifiers[5]);
    }
    public void setMaxHpLV1()
    {
        if(class_ == 1)
        {
            maxHP = (int) modifiers[3]+12;
        }
        if(class_ == 2)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 3)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 4)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 5)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 6)
        {
            maxHP = (int) modifiers[3]+6;
        }
        if(class_ == 7)
        {
            maxHP = (int) modifiers[3]+10;
        }
        if(class_ == 8)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 9)
        {
            maxHP = (int) modifiers[3]+6;
        }
        if(class_ == 10)
        {
            maxHP = (int) modifiers[3]+8;
        }
        if(class_ == 11)
        {
            maxHP = (int) modifiers[3]+10;
        }
        if(class_ == 12)
        {
            maxHP = (int) modifiers[3]+10;
        }
    }
    public boolean createPlayer()
    {
        Scanner sc = new Scanner(System.in);
        int setupOption;

        System.out.println("What's the name of your character?");
        name = sc.nextLine();
        level = 1;
        
        showClassMenu();
        class_ = sc.nextInt();
        while(class_ < 1 || class_ > 12)
        {
            System.out.println("Enter a valid number!");
            class_ = sc.nextInt();
        }
        setLifeDice(class_);

        System.out.println("Do you wanna set up your status mannualy or randomize them?");
        System.out.println("Enter 0 for mannualy or 1 for randomize");
        setupOption = sc.nextInt();
        while(setupOption < 0 || setupOption > 1)
        {
            System.out.println("Enter a valid number!");
            setupOption = sc.nextInt();
        }

        setModifiersAndStatus(setupOption);
        setMaxHpLV1();
        currentHP = maxHP;
        xp = 0;
        return true;
    }
}