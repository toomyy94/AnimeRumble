package animerumble;

import animerumble.data.Player;
import java.io.PrintStream;

public class EventsManager {

    public static void rollHpEvent(Player player) {
        
        int randomNumber = (int) (Math.random() * 100);
        
        //Harry Potter
        if (player.getCharacter().equals("Harry Potter")) {
            if (randomNumber <= 10) {
                System.out.println("A wild Dementor drained 10% of " + player.getCharacter() + "'s health, use a Patronus next time!\n");
                player.setHp(player.getHp() - 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println(player.getCharacter() + " eated a chocolate frog, 10% health restored..\n");
                player.setHp(player.getHp() + 10);
            }
        }
        
        //DBZ
        else if (player.getCharacter().equals("Goku")) {
            if (randomNumber <= 10) {
                System.out.println(player.getCharacter() + " found a magic bean and restored 10% health.\n");
                player.setHp(player.getHp() + 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println("BUMM, something hitted " + player.getCharacter() + ", move faster next time -10%hp.\n");
                player.setHp(player.getHp() - 10);
            }
        }
        
        //Pokemon
        else if (player.getAnime().equals("Pokemon")) {
            if (randomNumber <= 10) {
                System.out.println(player.getName() + " used a potion, " + player.getCharacter() + " recovered 10% health.\n");
                player.setHp(player.getHp() + 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println("Oh no! Team Rocket appeared, " + player.getCharacter() + " have now -10%hp.\n");
                player.setHp(player.getHp() - 10);
            }
        }
        
        //Chuck Norris
        else if (player.getCharacter().equals("Chuck Norris")) {
            if (randomNumber <= 6) {
                System.out.println("A Wild Hot Girl appears, Chuck gain 100% health.\n");
                player.setHp(player.getHp() + 100);
            }
            
            else if (randomNumber >= 94) {
                System.out.println("A train ran over Chuck, he lost -2%hp.\n");
                player.setHp(player.getHp() - 2);
            }
        }
        
        //Naruto
        else if (player.getCharacter().equals("Naruto")) {
            if (player.getHp() <= 15) {
                System.out.println("OMG Naruto is very low and he evolves to NINE-TAILS!!!\n");
                player.setHp(1);
            }
        }
        
        //Super campeões
        else if (player.getCharacter().equals("Oliver Tsubasa")) {
            if (randomNumber <= 10) {
                System.out.println("A fan throws a banana to the field, " + player.getCharacter() + " eats it and gains 10% health.\n");
                player.setHp(player.getHp() + 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println("Damm the ball hit the bar, " + player.getCharacter() + " loses 10hp.\n");
                player.setHp(player.getHp() - 10);
            }
        }
        
        //Doraemon
        else if (player.getCharacter().equals("Doraemon")) {
            if (randomNumber <= 10) {
                System.out.println("Doraemon eats a Dorayaki and gains 10hp.\n");
                player.setHp(player.getHp() + 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println("Gigante sang a song, doraemon loses 10hp.\n");
                player.setHp(player.getHp() - 10);
            }
        }
        
        //Yugi-oh!
        else if (player.getCharacter().equals("Yugi Moto!")) {
            if (randomNumber <= 10) {
                System.out.println("You used a magic card that give Yu-gi 10hp.\n");
                player.setHp(player.getHp() + 10);
            }
            
            else if (randomNumber >= 90) {
                System.out.println("Your opponent have a trap card, Yu-gi loses 10hp.\n");
                player.setHp(player.getHp() - 10);
            }
        }
    }
}
