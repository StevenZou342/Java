import java.util.*;
import java.nio.file.*;

class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o) {
    System.out.println(o);
  }

  String rollDice() {
    String[] dice = {"\u2680", "\u2681", "\u2682", "\u2683", "\u2684", "\u2685"};
    String build = "";
    int d1 = randInt(0, dice.length);  // Correct dice roll range
    int d2 = randInt(0, dice.length);  // Correct dice roll range
    int total = (d1 + 1) + (d2 + 1);
    build = dice[d1] + " " + dice[d2];
    if (total == 7 || total == 11) {
      build += " You Win!";
    } else {
      build += " You Lose! Try again.";
    }
    return build;
  }

  String drawCard() {
    String[] suit = {"1F0A", "1F0B", "1F0C", "1F0D"};
    String[] endings = {"A", "B", "C", "D", "E"};
    String[] cards = new String[52];
    String card;
    int pos = 0;
    for (int i = 0; i < suit.length; i++) {
      for (int j = 0; j < 13; j++) {
        if (j < 9) {
          card = suit[i] + (j + 1); 
        } else {
          card = suit[i] + endings[(j - 9)]; 
        }
        cards[pos] = String.valueOf(Character.toChars(Integer.parseInt(card, 16)));
        pos++;
      }
    }
    Scanner sc = new Scanner(System.in);
    print("How many cards do you want?");
    int amt = sc.nextInt();  // Using Scanner to read input
    String build = "";
    for (int i = 0; i < amt; i++) {
      build += cards[randInt(0, cards.length - 1)] + " ";  // Correct index range
    }
    return build;
  }

  void watchingYou() {
    clearScreen();
    String build = "";
    try {
      List<String> faces = Files.readAllLines(Paths.get("faces.txt"));
      for (int j = 0; j < 3; j++) {
        for (int i = 0; i < faces.size(); i++) {
          build += faces.get(i) + "\n";
          if (i % 5 == 0 && i != 0) {
            print(build);
            pause(200);
            build = "";
            clearScreen();
          }
        }
      }
    } catch (Exception e) {
      print("Error reading faces.txt: " + e.getMessage());
    }
  }

  void menu() {
    print("Welcome to \"Easy Life\" Computing!");
    print("-----------------------------------");
    print("Select from the following choices:");
    print("1) Roll a dice");
    print("2) Draw a card");
    print("3) Who's watching me?");
    print("4) Exit \"Easy Life\" Computing!");
    print("-----------------------------------");
    System.out.print("Choice: ");    
  }

  void init() {
    int c = 0;
    Scanner sc = new Scanner(System.in);
    while (c != 4) {
      menu();
      c = sc.nextInt();
      if (c < 1 || c > 4) {
        print("Invalid choice.\n\n");
      }
      if (c == 1) {
        print(rollDice());
      } else if (c == 2) {
        print(drawCard());
      } else if (c == 3) {
        watchingYou();
      }
    }
  }

  int randInt(int lower, int upper) {
    int range = upper - lower;
    return (int)(Math.random() * range + lower);
  }

  void pause(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ie) { }
  }

  public void clearScreen() {
    System.out.print("\033[H\033[2J");  // Uncomment this for ANSI escape code
    System.out.flush();  
  } 
}
