class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // Invoke the functions below
  System.out.println(getUsername("hi@gmail.com"));
  System.out.println(splitReverse("Happy Days"));
  System.out.println(splitReverse("For ever"));

  System.out.println(createUsername("Adam","Smith","987654321"));
  System.out.println(createUsername("Taylor","Swift","123456789"));
    
    
  }
  /*
    Problem 1:
    Write a function getUsername() that accepts an email and returns the user name. Example: joexyz@gmail.com ==> joexyz
    
      
    Problem 2:
    Write a function splitReverse() that accepts a string and returns a new string made up of the second half followed by the first half of the original string.  Example: "Happy Days" ==> " DaysHappy"

      
    Problem 3:
    Write a function createUsername() that accepts a first name, last name and OSIS number and returns the first letter of the first name, the full lastname and the last four characters of the OSIS. Example: John Doe 123456789 ==> "JDoe6789"
  */
   String getUsername(String email) {
    int atIndex = email.indexOf('@');
    return email.substring(0, atIndex);
    }
  String splitReverse(String s){
    int middle = s.length()/2;
    return s.substring(middle) + s.substring(0,middle);
  }
  String createUsername(String fName, String lName, String osis){
    return fName.substring(0,1) + lName + osis.substring(osis.length()-4);
  }

}