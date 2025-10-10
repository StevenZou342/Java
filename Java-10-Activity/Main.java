class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
   // Invoke functions with appropriate arguments
   System.out.println(gpa(70));
   System.out.println(isGraduating(7,12));
   System.out.println(BMI(100,100));
   System.out.println(shippingCost(20));
   System.out.println(blueOrviolet(20,50));

  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
  double gpa(double grade){
        if (grade>90){
          return grade*1.1;
        } else {
          return grade;
        }
  }

  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. 
    It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/
  boolean isGraduating(double gradeLevel, double credits){
        if(gradeLevel==12 && credits>=44){
          return true;
        } else{
          return false;
        }
  }


/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
*/
 String BMI(double weigth, double height){
        double bmii= 703*(weigth/Math.pow(height,2));
        if(bmii>18.4 && bmii<25){
          return "normal";
        }else if(bmii>=25 && bmii<40){
          return "overweight";
        }else{
          return "obese";
        }
      }
 


/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/
  double shippingCost(double weights){
          if(weights<10){
             return 0;
          }else if(weights>10 && weights<15){
            return 10;
          }else{
            return 10+(weights-25)*0.02;
          }
      }
    
  

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/
boolean blueOrviolet(double b, double violet){
  if(b>=600 && b<=670 || violet>=700 && violet<=750){
    return true;
  }else{
    return false;
  }
  
  }
}