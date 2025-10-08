class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // Invoke the functions (test different situations)
    GPA=3.5;
    Sat= 1460;
    MPH= 30;
    double fine
  }

  /*
    Problem 1:
    Write a function collegeApp() that accepts a GPA (0 - 4.0) and an SAT 
    score (200 - 1600) and returns "ACCEPTED" if gpa is 3.2 or better or
    if SAT score is 1450 or better; otherwise returns "Not Accepted".
  */
    String collegeApp(double GPA,int Sat){
            if(GPA<=3.2 && Sat>=1450){
              return "ACCEPTED";
            }else{
              return "not accepted";
            }


    }
   
    
  /*
    Problem 2:
    Write a function ecoFuel() that takes in the speed of a car in MPH and 
    returns a string "Fuel Economy" if the speed is between 40 and 65 MPH inclusive;  
    otherwise it returns "Not Optimal".
  */
      String ecoFuel(double MPH){
            if(MPH<=40 && MPH>=65){
              return "fuel economy";
            }else{
              return "not optimal";
            }
      }

  /*
    Problem 3:
    Write a function speedFine() that accepts the speed on a speeding ticket and          returns a fine of $75 for speeds between 60 and 70 (inlcusive); otherwise return 
    a fine of $75 plus two dollars for every mile over 70.
  */
      double speedfine(double speed,double fine){
            if(speed>=60 && speed<=70){
              return 75$;
            }else if(speed>71)


      }

    
  /*
    Problem 4:
    Write a function discount() that takes in the cost of three items and returns         the total amount discounted by 10% if the sum of the items is over $250 and
    if at least one of the items costs $100 or more; 
    otherwise return the total amount with no discount.
  */


  


}
