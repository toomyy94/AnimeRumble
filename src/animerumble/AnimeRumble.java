package animerumble;

import animerumble.data.Player;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimeRumble {

    static Scanner sc = new Scanner(System.in);
    static FuncAux utils = new FuncAux();

    public static void main(String[] args) {
        System.out.println(FuncAux.printTabs(3) + "ANIME FIGHT");
        System.out.println(FuncAux.printTabs(2) + "Created by: Tomas Rodrigues" + FuncAux.printLines(2));
            
        //Initial menu
        int op = -1;
        do {
            System.out.println(FuncAux.printTabs(2) + "Choose a option:");

            System.out.print("| 1- Play vs a Friend | 2 - SinglePlayer Mode | : ");
            try {
                op = sc.nextInt();
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("write a number");
                continue;
            }

            if (op == 1) {
                System.out.println("\n\t\tGet ready to Figth!!!\n");
                playMultiplayerMode();
            } 
            
            else if (op == 2) {
                System.out.println("This mode is not available yet\n");
            }
        } while (op != 1);
    }

    public static void playMultiplayerMode() {
        Player player1 = new Player();
        Player player2 = new Player();
        EventsManager eventsManager = new EventsManager();
        
        //Set player's name
        System.out.print("Player1's name: ");
        player1.setName(sc.next());
        System.out.print("Player2's name: ");
        player2.setName(sc.next());
        System.out.println("\n");
        
        //Set player's character
        selectCharacter(player1);
        selectCharacter(player2);

        //Game On!
        System.out.print(FuncAux.printTabs(3) + player1.getCharacter() + " vs " + player2.getCharacter() + FuncAux.printLines(3));
        while ((player1.getHp() > 0) || (player2.getHp() > 0)) {
            playerTurn(player1, player2, eventsManager);
            playerTurn(player2, player1, eventsManager);
        }
    }

    public static void playerTurn(Player player, Player opponent, EventsManager eventsManager) {
        int chosenSkill = 0, chosenDirection = 0, chosenOpponentDirection = 0;
        boolean directionAvailable = false;

        System.out.print(FuncAux.printTabs(3) + "  |" + player.getName() + "'s turn|\n");

        //Choose attack
        FuncAux.printSkills(player);
        do {
            try {
                chosenSkill = sc.nextInt();
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("write a number");
                continue;
            }

            if ((chosenSkill < 1) || (chosenSkill > 4)) {
                System.out.println("Choose an option!");
            } 
            else if (player.getMana()[(chosenSkill - 1)].intValue() <= 0) {
                System.out.println("You don't have mana left to use this attack!");
            }
            
        } while ((chosenSkill < 1) || (chosenSkill > 4) || (player.getMana()[(chosenSkill - 1)] <= 0));

        player.getMana()[chosenSkill-1]--;

        System.out.println("Choose a position:\n");
        if ((player.getCharacter().equals("Naruto")) && (player.getHp() == 1)) 
            FuncAux.printDirections(2);
        else 
            FuncAux.printDirections(chosenSkill);
        
        do {
            chosenDirection = FuncAux.wait4Direction();
            directionAvailable = FuncAux.isDirectionAvailable(chosenSkill, chosenDirection);
        } while (!directionAvailable);
        
        //Opponent avoidding attack
        if ((chosenSkill == 1) || (chosenSkill == 4)) 
            System.out.println(player.getName() + " is sending to you a powerfull atack.");
        
        System.out.println(opponent.getName() + " try to avoid the atack:" + FuncAux.printLines(2));
        
        if ((player.getCharacter().equals("Naruto")) && (player.getHp() == 1)) 
            FuncAux.printDirections(2);
        else 
            FuncAux.printDirections(chosenSkill);
        
        do {
            chosenOpponentDirection = FuncAux.wait4Direction();
            directionAvailable = FuncAux.isDirectionAvailable(chosenSkill, chosenOpponentDirection);
        } while (!directionAvailable);
        
        if (chosenDirection == chosenOpponentDirection) {
            FuncAux.setHpAfterAttack(opponent, chosenSkill);
            System.out.print("Kapow, " + player.getName() + " hited " + opponent.getName() + "!" + FuncAux.printLines(2));
        } 
        else 
            System.out.print(opponent.getName() + " dodged the attack!" + FuncAux.printLines(2));
        
        //Random event generator
        EventsManager.rollHpEvent(player);

        //Check game ending
        FuncAux.printBothPlayersHp(player, opponent);
        FuncAux.checkGameEnd(player, opponent);
    }

    public static void selectCharacter(Player player) {
        int opMainChar = -1;
        int opCharFromGroup = -1;

        String[] animes = new String[8];
        animes[0] = "Harry Potter";
        animes[1] = "Goku";
        animes[2] = "Pokemon";
        animes[3] = "Chuck Norris";
        animes[4] = "Naruto";
        animes[5] = "Oliver Tsubasa";
        animes[6] = "Doraemon";
        animes[7] = "Yugi Moto!";

        String[] pokemons = new String[4];
        pokemons[0] = "Pikachu";
        pokemons[1] = "Charizard";
        pokemons[2] = "Blastoise";
        pokemons[3] = "Bulbasaur";

        System.out.printf("%s choose your character\n", new Object[]{player.getName()});
        System.out.println("| 1- Harry Potter | 2- Goku | 3- Pokemon | 4- Chuck Norris | 5- Naruto |");
        System.out.println("| 6- Oliver Tsubasa | 7- Doraemon | 8- Yugi Moto!\n");
        
        do {
            try {
                opMainChar = sc.nextInt();
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("write a number");
                continue;
            }
            
            if (opMainChar == 3) {
                System.out.println("Choose your pokemon\n");
                System.out.println("| 1- Pikachu | 2- Charizard | 3- Blastoise | 4- Bulbasaur |\n");
                
                do {
                    try {
                        opCharFromGroup = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        sc.nextLine();
                        System.out.println("write a number");
                        continue;
                    }
                    
                    if (opCharFromGroup <= pokemons.length) {
                        player.setAnime(animes[(opMainChar - 1)]);
                        player.setCharacter(pokemons[(opCharFromGroup - 1)]);
                    } 
                    else 
                        System.out.println("Choose an option!");
                    
                } while (opCharFromGroup > pokemons.length);
                
            } 
            else if (opMainChar <= animes.length) {
                player.setAnime(animes[(opMainChar - 1)]);
                player.setCharacter(animes[(opMainChar - 1)]);
            } 
            else 
                System.out.println("Choose an option!");
        } while (opMainChar > animes.length);
        
        setCharacterSkills(player);
    }

    public static void setCharacterSkills(Player player) {
        if (player.getCharacter().equals("Harry Potter")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Avada Kedavra", "Flipendo", "Rictusempra", "Stupefy"});
        } 
        
        else if (player.getCharacter().equals("Goku")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Super Bomb", "Melee Atack", "Kayo-Ken", "Kameahmeah"});
        } 
        
        else if (player.getCharacter().equals("Charizard")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"FlameThrower", "Wing Attack", "Ember", "Scratch"});
        } 
        
        else if (player.getCharacter().equals("Bulbasaur")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Solar Beam", "Tackle", "Vine Wipe", "Razor Leaf"});
        } 
        
        else if (player.getCharacter().equals("Blastoise")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Hydro Pump", "Skull Bash", "Bubble Beam", "Water Gun"});
        } 
        
        else if (player.getCharacter().equals("Pikachu")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Thunder", "Quick Attack", "Thunder Shock", "Electro Ball"});
        } 
        
        else if (player.getCharacter().equals("Chuck Norris")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Roundhouse Kick", "Blow", "Pinch", "Kick in the Nutts"});
        } 
        
        else if (player.getCharacter().equals("Naruto")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Fuuton: Rasen Shuriken", "Rasengan", "Tajuu Kage Bunshin", "Oodama Rasengan"});
        } 
        
        else if (player.getCharacter().equals("Oliver Tsubasa")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Sky Wing Shoot", "Drive Shoot", "Flying Drive Shoot", "Sky Dive Shoot"});
        } 
        
        else if (player.getCharacter().equals("Doraemon")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Doraemon Shock Gun", "Doraemon Air Cannon", "Sword Round Lightning", "Doraemon SuperGloves"});
        } 
        
        else if (player.getCharacter().equals("Yugi Moto")) {
            System.out.printf("%s chose %s...\n\n", new Object[]{player.getName(), player.getCharacter()});
            player.setSkills(new String[]{"Summon: Exodia", "Kuriboh", "Blue-eyes White Dragon", "Dark Magician"});
        } 
        
        else 
            System.out.println("Choose a option!");
    }
}
