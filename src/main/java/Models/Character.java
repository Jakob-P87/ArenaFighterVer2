package Models;

public class Character
{
    private final String name;
    private int health;
    private int startHealth;
    private int strength;

    private boolean alive;

    public Character(String name)
    {
        this.name = name;
        this.health = 30;
        this.startHealth = 30;
        this.strength = 5;
        alive = true;
    }

    public Character()
    {
        this.name = "Grugg the unpleasant";
        this.health = 30;
        this.startHealth = 30;
        this.strength = 5;
        alive = true;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public int getStartHealth()
    {
        return startHealth;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }
}
