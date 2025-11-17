class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    chall1();
    allow2();
    
  }
/* Challenge 1:  Allowance Plan A or B ?
  Plan A: You get $5 on day 1 and no more. 
  Plan B: You get a penny on day 1. On each following day thereafter, you double the value from the previous day. 
  How many days will it take for the amount in plan B to equal or exceed that of plan A?
  Write a function allowance1() that solves the problem.
*/
 void chall1(){
  int day= 1;
  int pennyplan= 1;
  while(pennyplan<500){
    print("day"+ day+ ":"+ pennyplan);
    pennyplan*=2;
    day++;
  }
  print("penny plan exceeds 5 in"+day+"day. value is:"+pennyplan);
  }
 

/* Challenge 2:  Allowance Plan 1 or 2 ?  
  Plan-1 : Start with $1000. Add $100 each day to the previous day's balance.
  Plan-2 : Start with 1 penny. Add double that the next day. For each day after that, the amount added the previous day is doubled and added to the balance.

  Write a function allowance2() that will display the daily value in each plan as you determine how many days it will take for Plan2 to be better than Plan1.
*/
void allow2(){
  int days=1;
  double plan1=1000;
  double plan2=0.01;
  while(plan2<plan1){
    print("day"+days+":"+plan2);
    plan1+=100;
    plan2*=2;
    days++;
  }
  print("Plan 1 exceeds plan 2 in"+days+"day. value is:"+plan2);
}
  

  
/*
    Challenge 3:
    Write a function addTwoNumbers() that generates two random integers (between -10 and 10), and then asks the user to enter the sum of those two numbers. Allow the user to keep trying until they get it correct.
*/
void addTwoNumbers(){
  double hi=randInt(-10, 10);
  print("guess number between -10 to 10 :")
  double hi2=Input.readDouble();
  while(hi!=hi2)


}

/*
    Challenge 4:
    Write a function GCF() that accepts two integers, calculates and returns the GCF (greatest common factor) of the two integers. (For e.g, GCF of 12 and 18 is 6.)
*/


/*
    Challenge 5:
    Write a function securityCode() that receives a security code. Ask the user to enter their code. Check to see if the user's entry matches the security code. If it does, display "Access granted!". If not, keep asking for the code.
*/


/*
    Challenge 6:
    Write a function menu() that allows a user to choose 1 of 5 functions present above. Also include a 6th choice to exit out of the menu.
    Example:
    Menu: make your choice
    1 - Allowance plan A or B ?
    2 - Allowance plan 1 or 2 ?
    3 - Addition game
    4 - GCF of two integers
    5 - Security Code
    6 - Exit Menu
*/

  
  
  int randInt(int lower, int upper){
    int range = upper - lower +1 ;
    return (int)(Math.random()*range) +lower;
  }

}