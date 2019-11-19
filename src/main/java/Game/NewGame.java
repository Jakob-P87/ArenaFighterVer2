package Game;

import Models.Character;

public class NewGame
{

    private Character newPlayer;

    public void charCreation()
    {
        newPlayer = new Character();

        System.out.println("Champion Name");
        System.out.println();
        String name = MainMenu.scan.nextLine();

        while(name.isEmpty())
        {
            name = MainMenu.scan.nextLine().trim();
        }

        newPlayer = new Character(name);
    }
}
