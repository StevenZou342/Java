class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(addNums());
     System.out.println(generatePIN());
  }
  /*
  Problem 1:
  Write a function addNums() that returns a string displaying the addition of two random integers that range from -50 to 50 inclusively. 
  Example:
  addNums()==> "-23 + 10 = ?"
  addNums()==> "17 + 41 = ?"
  */
  String addNums(){
    int num1 = (int)(Math.random()*101)-50;
    int num2 = (int)(Math.random()*101)-50;
    return num1+" + "+num2+" = ?";
  }

  /*
  Problem 2:
  Write a function generatePIN() that generates a random PIN, with each digit being from 3 to 8.
  Example:
  generatePin() ==> 4547
  generatePin() ==> 8365
  */
int generatePIN(){
  int num10= (int)(Math.random()*5)+3;
  return num10;
}
  
}