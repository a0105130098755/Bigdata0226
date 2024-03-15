package RPG게임;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Console RPG!");
        System.out.println("Enter your character's name:");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100, 20);
        Dungeon dungeon = new Dungeon();

        System.out.println("Your journey begins...");

        while (player.isAlive()) {
            System.out.println("\nCurrent floor: " + dungeon.getCurrentFloor());
            System.out.println("Current stats:");
            System.out.println(player);

            System.out.println("\nChoose an action:");
            System.out.println("1. Explore");
            System.out.println("2. Rest");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dungeon.explore(player);
                    break;
                case 2:
                    player.rest();
                    break;
                case 3:
                    System.out.println("Exiting the game...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Game over. You were defeated...");
        scanner.close();
    }
}

class Player {
    private String name;
    private int health;
    private int attackPower;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void rest() {
        System.out.println(name + " rests and recovers health.");
        health += 20;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public String toString() {
        return name + " - Health: " + health + ", Attack: " + attackPower;
    }

    public void attack(Player enemy) {
    }
}

class Dungeon {
    private int currentFloor;

    public Dungeon() {
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void explore(Player player) {
        System.out.println("Exploring the dungeon...");
        int enemyHealth = 50 + currentFloor * 10;
        int enemyAttack = 5 + currentFloor;

        Player enemy = new Player("Monster", enemyHealth, enemyAttack);

        while (enemy.isAlive() && player.isAlive()) {
            System.out.println("You encounter a monster on floor " + currentFloor + "!");
            System.out.println("Monster's stats:");
            System.out.println(enemy);

            System.out.println("\nChoose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Flee");
            System.out.print("Your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(enemy);
                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                    break;
                case 2:
                    System.out.println("You fled from the battle...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        if (!player.isAlive()) {
            System.out.println("You were defeated by the monster...");
            return;
        }

        System.out.println("You defeated the monster and continue your journey!");
        currentFloor++;
    }
}

