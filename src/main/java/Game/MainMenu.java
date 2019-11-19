package Game;

import java.util.Scanner;

public class MainMenu
{
    public static Scanner scan;
    public static NewGame createCharacter;

    public static void main(String[] args)
    {
        createCharacter = new NewGame();
        scan = new Scanner(System.in);

        System.out.println("|==============[Arena Fighter]==============|");
        System.out.println("|   ===============[Menu]===============    |");
        System.out.print(  "|          [New Game] " + " [Exit Game]          |");
        System.out.println("\n" + "|___________________________________________|");
        int select = Integer.parseInt(scan.nextLine());

        try
        {
            switch (select)
            {
                case 1:
                    createCharacter.charCreation();
                    break;
                case 2:
                    break;
                default:
            }
        } catch (Exception a)
        {
            System.out.println("Invalid input!");
        }

        scan.close();
    }
}
