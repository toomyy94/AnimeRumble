package Anime;

import java.io.Console;
import java.util.*;

public class Main {
	
	
	static Scanner sc = new Scanner(System.in);
	static int op;
	static String nomeplayer1 = "player1";
	static String nomeplayer2 = "player2";
	static String charp2;
	static String charp1;
	static String[] skillp1 = new String[5];
	static String[] skillp2 = new String[5];
	static Integer[] manap1 = new Integer[5];
	static Integer[] manap2 = new Integer[5];
	static int hpp1 = 100;
	static int hpp2 = 100;    
	
	
	public static void main(String[] args) {
		System.out.println("               ANIME FIGHT                 ");
		System.out.println("        created by: Tomas Rodrigues                 \n\n\n");
		
		setMana();
		
		do{
			op = IntroMenu();
			if(op == 1) System.out.println("                 Get ready to Figth...\n");
			else if(op == 2) System.out.println("Not available yet - MULTIPLAYER!\n");
			else System.out.println("Choose a option!");
		}while(op<1 || op>2);
		
		System.out.print("Escreve o nome do player1 ---> ");
		nomeplayer1 = sc.next();
		
		System.out.print("Escreve o nome do player2 ---> ");
		nomeplayer2 = sc.next();
		
		System.out.println("\n");
		do{
			charp1 = CharMenu(nomeplayer1);
			if(charp1.equals("Harry Potter")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Avada Kedavra";
				skillp1[1] = "Flipendo";
				skillp1[2] = "Rictusempra";
				skillp1[3] = "Stupefy";
				skillp1[4] = "Cloak of Invisibility";
			}
			else if(charp1.equals("Goku")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Super Bomb";
				skillp1[1] = "Melee Atack";
				skillp1[2] = "Kayo-Ken";
				skillp1[3] = "Kameahmeah";
				skillp1[4] = "Teleport";
			}
			else if(charp1.equals("Charizard")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!FlameThrower";
				skillp1[1] = "Wing Attack";
				skillp1[2] = "Ember";
				skillp1[3] = "Scratch";
				skillp1[4] = "Fly";
			}
			else if(charp1.equals("Bulbasaur")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Solar Beam";
				skillp1[1] = "Tackle";
				skillp1[2] = "Vine Wipe";
				skillp1[3] = "Razor Leaf";
				skillp1[4] = "Dodge it";
			}
			else if(charp1.equals("Blastoise")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Hydro Pump";
				skillp1[1] = "Skull Bash";
				skillp1[2] = "Bubble Beam";
				skillp1[3] = "Water Gun";
				skillp1[4] = "Dodge it";
			}
			
			else if(charp1.equals("Pikachu")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Thunder";
				skillp1[1] = "Quick Attack";
				skillp1[2] = "Thunder Shock";
				skillp1[3] = "Electro Ball";
				skillp1[4] = "Dodge it";
			}
			else if(charp1.equals("Chuck Norris")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Roundhouse Kick";
				skillp1[1] = "Blow";
				skillp1[2] = "Pinch";
				skillp1[3] = "Kick in Nutts";
				skillp1[4] = "Laught";
			}
			else if(charp1.equals("Naruto")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Fuuton: Rasen Shuriken";
				skillp1[1] = "Rasengan";
				skillp1[2] = "Tajuu Kage Bunshin";
				skillp1[3] = "Oodama Rasengan";
				skillp1[4] = "Kawarimi no jutsu";
			}
			
			else if(charp1.equals("Oliver Tsubasa")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Sky Wing Shoot";
				skillp1[1] = "Drive Shoot";
				skillp1[2] = "Flying Drive Shoot:";
				skillp1[3] = "Sky Dive Shoot";
				skillp1[4] = "Jump";
			}
			
			else if(charp1.equals("Doraemon")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Doraemon Shock Gun";
				skillp1[1] = "Doraemon Air Cannon";
				skillp1[2] = "Sword Round Lightning";
				skillp1[3] = "Doraemon SuperGloves";
				skillp1[4] = "La Puerta Mágica";
			}
			else if(charp1.equals("Yu-gi-oh!")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp1);
				skillp1[0] = "!Summon: Exodia";
				skillp1[1] = "Kuriboh";
				skillp1[2] = "Blue-eyes White Dragon";
				skillp1[3] = "Dark Magician";
				skillp1[4] = "Trap Card";
			}
			else System.out.println("Choose a option!");
		}while(op<1 || op>3);
		
		
	
		do{
			charp2 = CharMenu(nomeplayer2);
			if(charp2.equals("Harry Potter")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Avada Kedavra";
				skillp2[1] = "Flipendo";
				skillp2[2] = "Rictusempra";
				skillp2[3] = "Stupefy";
				skillp2[4] = "Cloak of Invisibility";
				System.out.print("               Let's Figth!!!\n");
			}
			else if(charp2.equals("Goku")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Super Bomb";
				skillp2[1] = "Melee Atack";
				skillp2[2] = "Kayo-Ken";
				skillp2[3] = "Kameahmeah";
				skillp2[4] = "Teleport";
				System.out.println("             Let's Figth!!!\n");
			}
			else if(charp2.equals("Pikachu")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Thunder";
				skillp2[1] = "Quick Attack";
				skillp2[2] = "Thunder Shock";
				skillp2[3] = "Electro Ball";
				skillp2[4] = "Dodge it";
			}
			else if(charp2.equals("Charizard")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer1, charp2);
				skillp2[0] = "!FlameThrower";
				skillp2[1] = "Wing Attack";
				skillp2[2] = "Ember";
				skillp2[3] = "Scratch";
				skillp2[4] = "Fly";
			}
			else if(charp1.equals("Bulbasaur")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Solar Beam";
				skillp2[1] = "Tackle";
				skillp2[2] = "Vine Wipe";
				skillp2[3] = "Razor Leaf";
				skillp2[4] = "Dodge it";
			}
			else if(charp2.equals("Blastoise")){
				
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Hydro Pump";
				skillp2[1] = "Skull Bash";
				skillp2[2] = "Bubble Beam";
				skillp2[3] = "Water Gun";
				skillp2[4] = "Dodge it";
			}
			else if(charp2.equals("Chuck Norris")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Roundhouse Kick";
				skillp2[1] = "Blow";
				skillp2[2] = "Pinch";
				skillp2[3] = "Kick in Nutts";
				skillp2[4] = "Laught";
			}
			else if(charp2.equals("Naruto")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Fuuton: Rasen Shuriken";
				skillp2[1] = "Rasengan";
				skillp2[2] = "Tajuu Kage Bunshin";
				skillp2[3] = "Oodama Rasengan";
				skillp2[4] = "Kawarimi no jutsu";
			}
			
			else if(charp2.equals("Oliver Tsubasa")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Sky Wing Shoot";
				skillp2[1] = "Drive Shoot";
				skillp2[2] = "Flying Drive Shoot:";
				skillp2[3] = "Sky Dive Shoot";
				skillp2[4] = "Jump";
			}
			
			else if(charp2.equals("Doraemon")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Doraemon Shock Gun";
				skillp2[1] = "Doraemon Air Cannon";
				skillp2[2] = "Sword Round Lightning";
				skillp2[3] = "Doraemon SuperGloves";
				skillp2[4] = "La Puerta Mágica";
			}
			else if(charp2.equals("Yu-gi-oh!")){
				
				System.out.printf("%s chose %s...\n\n", nomeplayer2, charp2);
				skillp2[0] = "!Summon: Exodia";
				skillp2[1] = "Kuriboh";
				skillp2[2] = "Blue-eyes White Dragon";
				skillp2[3] = "Dark Magician";
				skillp2[4] = "Trap Card";
			}
			else System.out.println("Choose an option!");
		}while(op<1 || op>3);
		
		System.out.print("          "+charp1+" vs "+charp2+"\n\n\n");
		
		while(hpp1 > 0 && hpp2 > 0){
			turnop1();
			turnop2();
		}
		//... funções
}
	
	public static int IntroMenu(){
		int op;
		
		System.out.print("| 1- Play vs a Friend | 2 - SinglePlayer Mode |");
		op = sc.nextInt();
				
		return op;
	}
	
	public static void setMana() {
		manap1[0]=1;
		manap1[1]=15;
		manap1[2]=10;
		manap1[3]=5;
		manap1[4]=1;

		manap2[0]=1;
		manap2[1]=15;
		manap2[2]=10;
		manap2[3]=5;
		manap2[4]=1;
		
		
	}
	
	public static String CharMenu(String x){
		int op;
		int op2;
		String chars[] = new String[8];
		chars[0] = "Harry Potter";
		chars[1] = "Goku";
		chars[2] = "Pokemon";
		chars[3] = "Chuck Norris";
		chars[4] = "Naruto";
		chars[5] = "Oliver Tsubasa";
		chars[6] = "Doraemon";
		chars[7] = "Yu-gi-oh!";
		
		String pokemons[] = new String[4];
		pokemons[0] = "Pikachu";
		pokemons[1] = "Charizard";
		pokemons[2] = "Blastoise";
		pokemons[3] = "Bulbasaur";
		
		
		System.out.printf("%s Choose your character\n", x);
		System.out.println("| 1- Harry Potter | 2- Goku | 3- Pokemon | 4- Chuck Norris | 5- Naruto |");
		System.out.println("| 6- Oliver Tsubasa | 7- Doraemon | 8- Yu-gi-oh!\n");
		
		do{
			op = sc.nextInt();
			
			if(op==3){
				System.out.println("Choose your pokemon\n");
				System.out.println("| 1- Pikachu | 2- Charizard | 3- Blastoise | 4- Bulbasaur |");
				
				do{
					op2 = sc.nextInt();
				
					if(op2 <= pokemons.length) return pokemons[op2-1];
					else System.out.println("Choose an option!");
				}while(op2>pokemons.length);
			}
			
			if(op <= chars.length) return chars[op-1];
			else System.out.println("Choose an option!");
		}while(op>chars.length);
		
		
		return chars[op-1];
	}
	
	public static void printSkillsp1(){
		System.out.println("           Choose your Atack!");
		System.out.println("-------------------------------------------------");
		System.out.printf("|1- %16s\\%d | 2- %16s\\%d |\n",skillp1[0],manap1[0], skillp1[1], manap1[1]);
		System.out.printf("-------------------------------------------------          %s\\%d  \n",skillp1[4], manap1[4]);
		System.out.printf("|3- %16s\\%d | 4- %16s\\%d |\n",skillp1[2],manap1[2], skillp1[3], manap1[3]);
		System.out.println("-------------------------------------------------");
		
	}
	
	public static int passwordExample() {   
		int number=0;
		
	    Console console = System.console();
	    if (console == null) {
	        System.out.println("Couldn't get Console instance");
	        System.exit(0);
	    }
	    String tmp = null;
	    char passwordArray[] = console.readPassword("  ");
	    tmp = new String(passwordArray);
	   
	    try{
	      number = Integer.parseInt(tmp);
	      
	    }catch(NumberFormatException e){
	    	System.out.print("write a number");
	    	passwordExample();
	    }
	    return number;
	}
	
	public static void printSkillsp2(){
		System.out.println("           Choose an Atack");
		System.out.println("-------------------------------------------------");
		System.out.printf("|1- %16s\\%d | 2- %16s\\%d |\n",skillp2[0], manap2[0], skillp2[1], manap2[1]);
		System.out.printf("-------------------------------------------------           %s\\%d  \n",skillp2[4], manap2[4]);
		System.out.printf("|3- %16s\\%d | 4- %16s\\%d |\n",skillp2[2], manap2[2], skillp2[3], manap2[3]);
		System.out.println("-------------------------------------------------");
		
	}
	
	public static void turnop1(){
		int opskillp1=0;
		int opdirectionp1=0;
		int opdirectionp2=0;
		int cont=0;
		
		System.out.print("\n                |"+nomeplayer1+" turn|\n\n\n");
		
		printSkillsp1();
		do{
			opskillp1=sc.nextInt();
			if(opskillp1<1 || opskillp1 > 4) System.out.println("Choose an option!");
			if(manap1[opskillp1-1]<=0) System.out.println("You Don't have Mana for that!");
		}while(opskillp1<0 || opskillp1>4 || manap1[opskillp1-1]<=0);
		
		manap1[opskillp1-1]--;
		
		System.out.println("Try to hit your opponent");
		if(charp1=="Naruto" && hpp1==1) printdirection(2);
		else printdirection(opskillp1);
		do{
			
			
			opdirectionp1= passwordExample();
			if(opskillp1==1){
				if(opdirectionp1<0 || opdirectionp1 > 5) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==2){
				if(opdirectionp1<0 || opdirectionp1 > 2) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==3){
				if(opdirectionp1<0 || opdirectionp1 > 3) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==4){
				if(opdirectionp1<0 || opdirectionp1 > 4) System.out.println("Choose an option!");
				else cont++;
			}
			
		}while(cont==0);
		
		cont--;
		
		String tmp="";
		if(opskillp1==1 || opskillp1==4)System.out.println(nomeplayer1+" is sending to you a powerfull atack.");
		System.out.println(nomeplayer2+" try to avoid the atack!!!");
		
		if(manap2[4]>0){
			System.out.print("You Still have the "+skillp2[4]+" want to use it now?(y/n)");
		
			do{
				tmp = sc.next();
				if(!tmp.equals("y") && !tmp.equals("n"))System.out.print("Say (y or n)");
			}while(!tmp.equals("y") && !tmp.equals("n"));
		}
		if(charp1=="Naruto" && hpp1==1) printdirection(2);
		else printdirection(opskillp1);
		do{
			opdirectionp2= passwordExample();
			if(opskillp1==1){
				if(opdirectionp2<0 || opdirectionp2 > 5) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==2){
				if(opdirectionp2<0 || opdirectionp2 > 2) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==3){
				if(opdirectionp2<0 || opdirectionp2 > 3) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp1==4){
				if(opdirectionp2<0 || opdirectionp2 > 4) System.out.println("Choose an option!");
				else cont++;
			}
		}while(cont==0);
		
		if(tmp.equals("y")){
			manap2[4]--;
			opdirectionp2=6;
			System.out.println(nomeplayer2+" used "+skillp2[4]);
		}
		
		if(opdirectionp1==opdirectionp2){
			vidap2(opskillp1);
			System.out.print(nomeplayer1+", you hited him!!!\n\n");
			currentvidap2();
		}
		else{
			System.out.print("GoodJob "+nomeplayer2+", he miss it! ;)\n\n");
			currentvidap2();
		}
		
		int i = (int) (Math.random()*100);
		if(charp1.equals("Harry Potter")){
			
			if(i<10){
				System.out.println("A wild Dementor appeared and drained 10% of your health "+charp1+", sorry.\n");
				hpp1-=10;
			}
			
			else if(i>90){
				System.out.println(charp1+" you eated a chocolate frog, you earned 10% health..\n");
				hpp1+=10;
			}
		}
			
		else if(charp1.equals("Goku")){
			if(i<10){
				System.out.println(charp1+" found a magic bean and restored 10% health.\n");
				hpp1+=10;
			}
				
			else if(i>90){
				System.out.println("BUMM, something hitted "+charp1+", move faster next time -10%hp.\n");
				hpp1-=10;
			}
		}
		
		else if(charp1.equals("Pikachu")){
			if(i<10){
				System.out.println(nomeplayer1+" used a potion, "+charp1+" earned 10% health.\n");
				hpp1+=10;
			}
				
			else if(i>90){
				System.out.println("Team Rocket appeared, "+charp1+" have now -10%hp.\n");
				hpp1-=10;
			}
			
		}
		
		else if(charp1.equals("Chuck Norris")){
			if(i<6){
				System.out.println("A Wild Hot Girl appears, Chuck gain 100% health.\n");
				hpp1+=100;
			}
				
			else if(i>94){
				System.out.println("A train ran over Chuck, he lost -2%hp.\n");
				hpp1-=2;
			}
			
		}
		
		else if(charp1.equals("Naruto")){
			if(hpp1<11){
				System.out.println("OMG Naruto is very low and he evolves to NINE-TAILS!!!\n");
				hpp1=1;
			}
		}
		
		else if(charp1.equals("Oliver Tsubasa")){
			if(i<10){
				System.out.println("A fan throws a banana to the field, "+charp1+" eats it and gains 10% health.\n");
				hpp1+=10;
			}
				
			else if(i>90){
				System.out.println("Damm the ball hit the post, "+charp1+" lose 10hp.\n");
				hpp1-=10;
			}
		}
		
		else if(charp1.equals("Doraemon")){
			if(i<10){
				System.out.println("Doraemon eats a Dorayaki and gains 10hp.\n");
				hpp1+=10;
			}
				
			else if(i>90){
				System.out.println("Gigante sang a song, doraemon loses 10hp.\n");
				hpp1-=10;
			}
		}
		else if(charp1.equals("Yu-gi-oh!")){
			if(i<10){
				System.out.println("You used a magic card that give Yu-gi 10hp.\n");
				hpp1+=10;
			}
				
			else if(i>90){
				System.out.println("Your opponent have a trap card, Yu-gi loses 10hp.\n");
				hpp1-=10;
			}
		}
		
		if(hpp1<=0){ 
			System.out.println(charp1+" DIED!\n");
			System.out.print("         GAME OVER - "+nomeplayer2+" WINS!");
			System.exit(0); 
		}
		
		if(hpp2<=0){ 
			System.out.println(charp2+" DIED!\n");
			System.out.print("            GAME OVER - "+nomeplayer1+" WINS!");
			System.exit(0); 
		}
	}
	

	public static void turnop2(){
		int opskillp2=0;
		int opdirectionp1=0;
		int opdirectionp2=0;
		int cont=0;
		
		System.out.print("\n                |"+nomeplayer2+" turn|\n\n\n");
		
		printSkillsp2();
		do{
			opskillp2=sc.nextInt();
			if(opskillp2<1 || opskillp2 > 4) System.out.println("Choose an option!");
			if(manap2[opskillp2-1]<=0) System.out.println("You Don't have Mana for that!");
		}while(opskillp2<0 || opskillp2>4 || manap2[opskillp2-1]<=0);
		
		manap2[opskillp2-1]--;
		
		System.out.println("Try to hit your opponent");
		if(charp2=="Naruto" && hpp2==1) printdirection(2);
		else printdirection(opskillp2);
		do{
			
			
			opdirectionp2=passwordExample();
			if(opskillp2==1){
				if(opdirectionp2<0 || opdirectionp2 > 5) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==2){
				if(opdirectionp2<0 || opdirectionp2 > 2) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==3){
				if(opdirectionp2<0 || opdirectionp2 > 3) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==4){
				if(opdirectionp2<0 || opdirectionp2 > 4) System.out.println("Choose an option!");
				else cont++;
			}
			
		}while(cont==0);
		
		cont--;
		
		String tmp="";
		if(opskillp2==1 || opskillp2==4)System.out.println(nomeplayer2+" is sending to you a powerfull atack.");
		
		if(manap1[4]>0){
			System.out.print("You Still have the "+skillp1[4]+" want to use it now?(y/n)");
		
			do{
				tmp = sc.next();
				if(!tmp.equals("y") && !tmp.equals("n"))System.out.print("Say (y or n)");
			}while(!tmp.equals("y") && !tmp.equals("n"));
		}
		
		System.out.println(nomeplayer1+" try to avoid the atack!!!");
		if(charp1=="Naruto" && hpp1==1) printdirection(2);
		else printdirection(opskillp2);

		do{
			opdirectionp1=passwordExample();
			if(opskillp2==1){
				if(opdirectionp1<0 || opdirectionp1 > 5) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==2){
				if(opdirectionp1<0 || opdirectionp1 > 2) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==3){
				if(opdirectionp1<0 || opdirectionp1 > 3) System.out.println("Choose an option!");
				else cont++;
			}
			
			else if(opskillp2==4){
				if(opdirectionp1<0 || opdirectionp1 > 4) System.out.println("Choose an option!");
				else cont++;
			}
		}while(cont==0);
		
		if(tmp.equals("y")){
			manap1[4]--;
			opdirectionp1=6;
			System.out.println(nomeplayer1+" used "+skillp1[4]);
		}
		
		if(opdirectionp2==opdirectionp1){
			vidap1(opskillp2);
			System.out.print(nomeplayer2+", you hited him!!!\n\n");
			currentvidap1();
		}
		else{
			System.out.print("GoodJob "+nomeplayer1+", he miss it! ;)\n\n");
			currentvidap1();
		}
		
		int i = (int) (Math.random()*100);
		
		if(charp2.equals("Harry Potter")){
			if(i<10){
				System.out.println("A wild Dementor appeared and drained 10% of Harry's health, sorry.\n");
				hpp2-=10;
			}
			else if(i>90){
				System.out.println("Harry eated a chocolate frog and earned 10% health..\n");
				hpp2+=10;
			}
			
		else if(charp2.equals("Goku")){
			if(i<10){
				System.out.println("Goku found a magic bean, he gain 10% health.\n");
				hpp2+=10;
			}
				
			else if(i>90){
				System.out.println("BUMM, something hitted u, Goku move faster next time, -10%hp.\n");
				hpp2-=10;
			}
		}
			
		else if(charp2.equals("Pikachu")){
			if(i<10){
				System.out.println(nomeplayer2+" used a potion, Pikachu earned 10% health.\n");
				hpp2+=10;
			}
				
			else if(i>90){
				System.out.println("Team Rocket Appeared, Pikachu loose -10%hp.\n");
				hpp2-=10;
			}
			
		}
		else if(charp2.equals("Chuck Norris")){
			if(i<6){
				System.out.println("A Wild Hot Girl appears, Chuck wins 100% health.\n");
				hpp2+=100;
			}
				
			else if(i>94){
				System.out.println("A train ran over Chuck, he lost -2%hp.\n");
				hpp2-=2;
			}
		}
			
		else if(charp2.equals("Naruto")){
			if(hpp2<11){
				System.out.println("OMG Naruto is very low and he evolves to NINE-TAILS!!!\n");
				hpp2=1;
			}
		}
		
		else if(charp2.equals("Doraemon")){
			if(i<10){
				System.out.println("Doraemon eats a Dorayaki and gains 10hp.\n");
				hpp2+=10;
			}
				
			else if(i>90){
				System.out.println("Gigante sings a song, doraemon loses 10hp.\n");
				hpp2-=10;
			}
		}
		
		else if(charp2.equals("Yu-gi-oh!")){
			if(i<10){
				System.out.println("You used a magic card that give Yu-gi 10hp.\n");
				hpp2+=10;
			}
				
			else if(i>90){
				System.out.println("Your opponent have a trap card, Yu-gi loses 10hp.\n");
				hpp2-=10;
			}
		}
		
			
		//victory
		if(hpp1<=0){ 
			System.out.println(charp1+" DIED!\n");
			System.out.print("         GAME OVER - "+nomeplayer2+" WINS!");
			System.exit(0); 
		}
		
		else if(hpp2<=0){ 
			System.out.println(charp2+" DIED!\n");
			System.out.print("            GAME OVER - "+nomeplayer1+" WINS!");
			System.exit(0); 
		}
	}
}
	public static void vidap1(int x){
		if(x==1){
			hpp1-=100;
		}
		
		else if(x==2){
			hpp1-=15;
		}
		
		else if(x==3){
			hpp1-=49;
		}
		
		else if(x==4){
			hpp1-=75;
		}
	}
	
	public static void vidap2(int x){
		if(x==1){
			hpp2-=100;
		}
		
		else if(x==2){
			hpp2-=15;
		}
		
		else if(x==3){
			hpp2-=49;
		}
		
		else if(x==4){
			hpp2-=75;
		}
	}
	
	public static void currentvidap1(){
		System.out.print(nomeplayer1+" have now "+hpp1+"% health\n");
	}
	
	public static int getvidap1(){
		return hpp1;
	}
	
	public static int getvidap2(){
		return hpp2;
	}
	
	public static void currentvidap2(){
		System.out.print(nomeplayer2+" have now "+hpp2+"% health\n");
	}

	public static void printdirection(int x){
		if(x==1){
			System.out.print("                 1                  \n\n\n\n");
			System.out.print(" 2                               3  \n\n\n\n\n");
			System.out.print("         4                 5     \n\n\n\n");
		}
		else if(x==2){
			System.out.print("                  1                \n\n\n\n\n\n\n");
			System.out.print("                  2               \n\n\n\n\n\n");
		}
		
		else if(x==3){
			System.out.println("                  1                   \n\n\n\n");
			System.out.print(" 2\n\n\n\n");
			System.out.print("                  3                   \n\n\n\n");
		}
		else if(x==4){
			System.out.print("                 1                  \n\n\n\n\n");
			System.out.print(" 2                               3  \n\n\n\n");
			System.out.print("                 4                      \n\n\n\n");
		}
	}
}
	
	
