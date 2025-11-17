class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println(rollDice());
    System.out.println(lotto());
    System.out.println(diceDistribution(100));
    System.out.println(additionTutor());
    System.out.println(mathQuiz());
    
    }
  /*
  Challenge 1:
  Write a function rollDice() that rolls a die once and returns a value from 1 to 6.
  Example:
  rollDice() ==> "2"
  */
String rollDice(){
  int roll=(int)(Math.random()*6)+1;
  return ""+roll;
}

  
  /*
  Challenge 2:
  Write a function lotto() that returns a string of 5 numbers from 1 to 48.
  Example:
  lotto() ==> "1 23 34 9 18"
  */
String lotto(){
  int lotto1=(int)(Math.random()*48)+1;
  int lotto2=(int)(Math.random()*48)+1;
  int lotto3=(int)(Math.random()*48)+1;
  int lotto4=(int)(Math.random()*48)+1;
  int lotto5=(int)(Math.random()*48)+1;
  return ""+ lotto1+ lotto2+ lotto3+ lotto4+ lotto5;
}
  
  /*
  Challenge 3:
  Write a function diceDistribution() that accepts an integer N and rolls a die N times, keeps a counter of the number of times 1,2,3,4,5,6 was rolled (need a counter for each) and displays the counters for each.
  Test with N values of 100, 1000, 100000, and 1000000.  What do the results look like as the number N gets larger?
  */
  String diceDistribution(int N){
    int P=0;
    int L=0;
    int T=0;
    int Y=0;
    int F=0;
    int G=0;
    for (int x = 1; x <= N; x++) {
    int roll5 = (int)(Math.random() * 6) + 1;
  if (roll5 == 1) {
        P++;
    } else if (roll5 == 2) {
        L++;
    } else if (roll5 == 3) {
        T++;
    } else if (roll5 == 4) {
        Y++;
    } else if (roll5 == 5) {
        F++;
    } else {
        G++;
    }
}
return "one was rolled:"+ P +" two was rolled:"+ L +" three was rolled:"+ T +" 4 was rolled:"+ Y +" 5 was rolled:"+ F +" 6 was rolled:"+ G;
} 

  /*
  Challenge 4:
  Write a function additionTutor() that generates two random numbers and prompts the user to enter the sum of the two numbers. The random integers should range from -20 to 20 (inclusively). If the answer is correct return "Correct!" otherwise return "Incorrect".
  */
String additionTutor(){
  int num1=(int)(Math.random()*41)-20;
  int num2=(int)(Math.random()*41)-20;
  int sum=num1+num2;
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  System.out.println("What is "+ num1 + " + " + num2 + "?");
  int answer = scanner.nextInt();
  if (answer == sum) {
    return "Correct!";
  } else {
    return "Incorrect";
  }     
}
  /*
  Challenge 5:
  Write a function mathQuiz() that generates a random addition, subtraction, multiplication or division problem of two random integers, prompts the user for the answer. It returns "Correct!" if the answer is correct, otherwise returns "Incorrect". The random integers should range from -20 to 20 (inclusively).
  Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.
  */
 String mathQuiz(){
  int num1=(int)(Math.random()*41)-20;
  int num2=(int)(Math.random()*41)-20;
  int operation=(int)(Math.random()*4);
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  int answer=0;
  int correctAnswer=0;
  switch(operation){
    case 0:
      System.out.println("What is "+ num1 + " + " + num2 + "?");
      correctAnswer=num1+num2;
      break;
    case 1:
      System.out.println("What is "+ num1 + " - " + num2 + "?");
      correctAnswer=num1-num2;
      break;
    case 2:
      System.out.println("What is "+ num1 + " * " + num2 + "?");
      correctAnswer=num1*num2;
      break;
    case 3:
      System.out.println("What is "+ num1 + " / " + num2 + "? (rounded to nearest integer)");
      if(num2==0){
        num2=1; // avoid division by zero
      }
      correctAnswer=Math.round(num1/num2);
      break;
  }
  answer = scanner.nextInt();
  if (answer == correctAnswer) {
    return "Correct!";
  } else {
    return "Incorrect";
  }
}
}




