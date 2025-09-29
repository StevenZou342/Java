class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */
  double A= 2;
  double x= 5;

  double Z= Math.pow(A,(2*x)+1);
  System.out.println(Z);
    
  /*
    Problem 2: Translate the formula from eq2.png.
  */
  double x1= 50;
  double y = (2*x1)/Math.sin(3*x1);
  System.out.println(y);


    
    /*
    Problem 3: Translate the formula from eq3.png.
  */
  double x2= 200;
  double b = Math.abs(Math.pow(x2,2)+1);
   System.out.println(b);
  }

  
}