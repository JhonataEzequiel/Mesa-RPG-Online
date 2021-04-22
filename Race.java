import java.util.Scanner;
public class Race {
    int bonus[] = new int[6];
    
    public void showRaceTypeMenu()
    {
        System.out.println("What Race is your character? Enter the number corresponding to your Race");
        System.out.println("1 - Dwarf");
        System.out.println("2 - Mountain Dwarf");
        System.out.println("3 - Hill Dwarf");
        System.out.println("4 - Human");
        System.out.println("5 - Half-Orc");
        System.out.println("6 - Half-Elf");
        System.out.println("7 - Elf");
        System.out.println("8 - High Elf");
        System.out.println("9 - Drow");
        System.out.println("10 - Wood Elf");
        System.out.println("11 - Halfling");
        System.out.println("12 - Tiefling");
        System.out.println("13 - Gnome");
        System.out.println("14 - Rock Gnome");
        System.out.println("15 - Forest Gnome");
        System.out.println("16 - Stout Halfling");
        System.out.println("17 - Lightfoot Halfling");
        System.out.println("18 - Dragonborn");
    }
    public void setRace()
    {
        int raceType;
        Scanner sc = new Scanner(System.in);
        showRaceTypeMenu();
        raceType = sc.nextInt();
        while(raceType<1 || raceType>18)
        {
            System.out.println("Enter a valid number!");
            showRaceTypeMenu();
            raceType = sc.nextInt();
        }

        if(raceType == 1){//Dwarf
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 2;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 2){//Mountain Dwarf
            bonus[0] = 2;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 3){//Hill Dwarf
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 1;
            bonus[5] = 0;
        }
        if(raceType == 4){//Human
            bonus[0] = 1;
            bonus[1] = 1;
            bonus[2] = 1;
            bonus[3] = 1;
            bonus[4] = 1;
            bonus[5] = 1;
        }
        if(raceType == 5){//Half-Orc
            bonus[0] = 2;
            bonus[1] = 0;
            bonus[2] = 1;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 6){//Half-Elf
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 2;
        }
        if(raceType == 7){//Elf
            bonus[0] = 0;
            bonus[1] = 2;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 8){//High Elf
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 1;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 9){//Drow
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 1;
        }
        if(raceType == 10){//Wood Elf
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 1;
            bonus[5] = 0;
        }
        if(raceType == 11){//Halfling
            bonus[0] = 0;
            bonus[1] = 2;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 12){//Tiefling
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 2;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 13){//Gnome
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 2;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 14){//Rock Gnome
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 1;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 15){//Forest Gnome
            bonus[0] = 0;
            bonus[1] = 1;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 16){//Stout Halfling
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 1;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 0;
        }
        if(raceType == 17){//Lightfoot Halfling
            bonus[0] = 0;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 1;
        }
        if(raceType == 18){//Dragonborn
            bonus[0] = 2;
            bonus[1] = 0;
            bonus[2] = 0;
            bonus[3] = 0;
            bonus[4] = 0;
            bonus[5] = 1;
        }
    }
    /*Race type disclaimer
    1 - Dwarf
    2 - Mountain Dwarf
    3 - Hill Dwarf
    4 - Human
    5 - Half-Orc
    6 - Half-Elf
    7 - Elf
    8 - High Elf
    9 - Drow
    10 - Wood Elf
    11 - Halfling
    12 - Tiefling
    13 - Gnome
    14 - Rock Gnome
    15 - Forest Gnome
    16 - Stout Halfling
    17 - Lightfoot Halfling
    18 - Dragonborn
    */
}
