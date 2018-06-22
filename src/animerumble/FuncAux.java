package animerumble;

import animerumble.data.Player;
import java.io.Console;
import java.io.PrintStream;

public class FuncAux {

    public static void printDirections(int x) {
        switch (x) {
            case 1:
                System.out.print(printTabs(2) + " 1" + printLines(4));
                System.out.print(" 2" + printTabs(4) + " 3" + printLines(4));
                System.out.print(printTabs(1) + " 4" + printTabs(2) + " 5" + printLines(3));
                break;
            case 2:
                System.out.print(printTabs(2) + " 1" + printLines(4));
                System.out.print(printTabs(2) + " 2" + printLines(3));
                break;
            case 3:
                System.out.print(printTabs(2) + " 1" + printLines(4));
                System.out.print(printLines(4));
                System.out.print(printTabs(1) + " 2" + printTabs(2) + " 3" + printLines(3));
                break;
            case 4:
                System.out.print(printTabs(2) + " 1" + printLines(4));
                System.out.print(" 2" + printTabs(4) + " 3" + printLines(4));
                System.out.print(printTabs(2) + " 4" + printLines(3));
        }
    }

    public static void printSkills(Player player) {
        System.out.println(printTabs(3) + "Choose your Atack:");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("|1. %23s(%2d) | 2. %23s(%2d) |\n", new Object[]{player.getSkills()[0], player.getMana()[0], player.getSkills()[1], player.getMana()[1]});
        System.out.println("------------------------------------------------------------------");
        System.out.printf("|3. %23s(%2d) | 4. %23s(%2d) |\n", new Object[]{player.getSkills()[2], player.getMana()[2], player.getSkills()[3], player.getMana()[3]});
        System.out.println("------------------------------------------------------------------");
    }

    public static void setHpAfterAttack(Player opponent, int attack) {
        switch (attack) {
            case 1:
                opponent.setHp(opponent.getHp() - 100);
                break;
            case 2:
                opponent.setHp(opponent.getHp() - 15);
                break;
            case 3:
                opponent.setHp(opponent.getHp() - 49);
                break;
            case 4:
                opponent.setHp(opponent.getHp() - 75);
        }
    }

    public static void printBothPlayersHp(Player player1, Player player2) {
        printStringBox("Score:", player1.getName() + ": " + player1.getHp() + "% | " + player2.getName() + ": " + player2.getHp() + "%");
    }

    public static void checkGameEnd(Player player, Player opponent) {
        if (player.getHp() <= 0) {
            System.out.println(player.getCharacter() + " DIED!\n");
            System.out.print(printTabs(2) + "GAME OVER - " + opponent.getName() + " WINS!");
            System.exit(0);
        }
        
        if (opponent.getHp() <= 0) {
            System.out.println(opponent.getCharacter() + " DIED!\n");
            System.out.print(printTabs(2) + "GAME OVER - " + player.getName() + " WINS!");
            System.exit(0);
        }
    }

    public static int wait4Direction() {
        int number = 0;

        Console console = System.console();
        
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        
        String tmp = null;
        char[] passwordArray = console.readPassword("  ", new Object[0]);
        tmp = new String(passwordArray);
        
        try {
            number = Integer.parseInt(tmp);
        } catch (NumberFormatException e) {
            System.out.print("write a number");
            wait4Direction();
        }
        
        return number;
    }

    public static boolean isDirectionAvailable(int chosenSkill, int chosenDirection) {
        if (chosenSkill == 1) {
            if ((chosenDirection < 0) || (chosenDirection > 5)) {
                System.out.println("Choose an option!");
                return false;
            }
            return true;
        }
        
        else if (chosenSkill == 2) {
            if ((chosenDirection < 0) || (chosenDirection > 2)) {
                System.out.println("Choose an option!");
                return false;
            }
            return true;
        }
        
        else if (chosenSkill == 3) {
            if ((chosenDirection < 0) || (chosenDirection > 3)) {
                System.out.println("Choose an option!");
                return false;
            }
            return true;
        }
        
        else if (chosenSkill == 4) {
            if ((chosenDirection < 0) || (chosenDirection > 4)) {
                System.out.println("Choose an option!");
                return false;
            }
            return true;
        }
        
        return false;
    }

    public static void printStringBox(String title, String stringToPrint) {
        String hifen = "";
        
        for (int i = 0; i < stringToPrint.length() + 4; i++) {
            hifen = hifen + "-";
        }
        
        System.out.println(printTabs(4) + title);
        System.out.println(printTabs(3) + hifen);
        System.out.println(printTabs(3) + "| " + stringToPrint + " |");
        System.out.println(printTabs(3) + hifen + "\n");
    }

    public static String printLines(int lineNumber) {
        String emptyLine = "";
        for (int i = 0; i < lineNumber; i++) {
            emptyLine = emptyLine + "\n";
        }
        return emptyLine;
    }

    public static String printTabs(int lineNumber) {
        String emptyLine = "";
        for (int i = 0; i < lineNumber; i++) {
            emptyLine = emptyLine + "\t";
        }
        return emptyLine;
    }
}
