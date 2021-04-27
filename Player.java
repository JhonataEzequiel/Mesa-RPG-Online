//libraries
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

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
        int option = 1;
        if(setupOption == 0)
        {
            System.out.println("You have 6 values to allocate:");
            System.out.println("15 14 13 12 10 8");
            Integer dataValues[] = {15, 14, 13, 12, 10, 8};
            int alreadyUsed[] = {0,0,0,0,0,0};
            ArrayList<String> options = new ArrayList<String>(); 

            options.add("1 - Strength");
            options.add("2 - Dexterity");
            options.add("3 - Constituion");
            options.add("4 - Intelligence");
            options.add("5 - Wisdom");
            options.add("6 - Charisma");
            System.out.println("Tamanho options: " + options.size());
            
            for(int counter = 0; counter<6; counter++)
            {
                System.out.println("where do you wanna use the " + dataValues[counter].toString() + "?");
                
                for(int i = 0; i<options.size(); i++)
                {
                    System.out.println(options.get(i));
                }
                option = sc.nextInt();

                while(option < 1 || alreadyUsed[option-1] == 1)
                {
                    System.out.println("Enter a valid number or a number that hasnt been used!");
                    option = sc.nextInt();
                }

                this.status[option-1] = dataValues[counter];
                alreadyUsed[option-1] = 1;
                char index;
                
                for(int i = 0; i<options.size(); i++)
                {
                    String aux = options.get(i);
                    index = aux.charAt(0);

                    if(Character.getNumericValue(index) == option)
                    {
                        if(i == options.size())
                        {
                            options.remove(i-1);
                        }else{
                            options.remove(i);
                        }
                        break;
                    }
                }
            }
        }
        if(setupOption == 1)
        {
            for(int counter = 0; counter < 6; counter++)
            {
                int d6[] = new int[4];
                d6[0] = dice.nextInt(6)+1;
                d6[1] = dice.nextInt(6)+1;
                d6[2] = dice.nextInt(6)+1;
                d6[3] = dice.nextInt(6)+1;
                for(int dcounter = 0; dcounter<4; dcounter++)
                {
                    if(dcounter != 3){
                        if(d6[dcounter+1]>=d6[dcounter])
                        {
                            d6[dcounter] = d6[dcounter+1];
                        }
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
            if((this.status[counter] -10) % 2 != 0)
            {
                this.modifiers[counter] = (double) ((this.status[counter] - 10)/2);
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
        sc.close();
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
        sc.close();
        return true;
    }
}