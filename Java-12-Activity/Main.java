class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.println(creditCardType("34"));
   System.out.println(pigLatin("hello"));
   System.out.println(nycLocate("10356"));
   System.out.println(getMonth("02/23/2025"));
   System.out.println(validatePswd("283958393"));
  }
/*
    Challenge 1:
    Write a function creditCardType() that accepts a credit card number (as a string) and returns the type of credit card based on the starting numbers (see below)
    Starts with:
    4 - Visa
    34 or 37 - American Express
    36 - Diner's Club
    51 or 55 - Mastercard
    6011 or 65 - Discover
    */
    String creditCardType(String num){
      if(num.substring(0,1).equals(num.indexOf("4"))){
        return "visa";
      }else if(num.substring(0,2).equals(("34")) || (num.substring(0,2).equals(("37")))){
        return "American Express";
      }else if(num.substring(0,2).equals(num.indexOf("36"))){
        return "Mastercard";
      }else if(num.substring(0,2).equals(("51")) ||  (num.substring(0,2).equals(("5")))){
        return "American Express";
      }else{
        return "Discover";
      }
    }
    /*
    Challenge 2:
    Write a function pigLatin() which accepts a word and returns a new word made up by switching the fist letter with the rest of the word and adding "ay" after. Example: "pig"==> "igpay"
    */
      String pigLatin(String word){
        return word.substring(1) + word.substring( 0,1)+"ay";
      }

    /*
    Challenge 3:
    Write a function nycLocate() that accepts a zip code (as a string) and returns the appropriate NYC borough determined by the fist three numbers of the zip code.
    Starting numbers of zip code:
    Manhattan :100, 101, 102
    Staten Island : 103
    Bronx : 104
    Brooklyn : 112
    Queens : 113, 114, 111
    */
      String nycLocate(String zip) {
        if(zip.substring(0,4).equals("100")||zip.substring(0,4).equals("101")||zip.substring(0,4).equals("102")) {
            return "Manhattan";
        }else if(zip.substring(0,4).equals("103")){
          return "staten island";
        }else if(zip.substring(0,4).equals("104")){
          return "bronx";
        }else if(zip.substring(0,4).equals("112")){
          return "Brooklyn";
        }else{
          return "queens";
        }
        }
    

    /*
    Challenge 4:
    Create a function getMonth() that accepts a date in the format MM/DD/YYYY and returns the month: Example 07/21/2023 ==> "July"
  */
        String getMonth(String date) {
        if(date.substring(0,2).equals("01")) {
            return "January";
        }else if(date.substring(0,2).equals("02")){
          return "February";
        }else if(date.substring(0,2).equals("03")){
          return "March";
        }else if(date.substring(0,2).equals("04")){
          return "April";
        }else if(date.substring(0,2).equals("05")){
          return "may";
        }else if(date.substring(0,2).equals("06")){
          return "june";
        }else if(date.substring(0,2).equals("07")){
          return "july";
        }else if(date.substring(0,2).equals("08")){
          return "august";
        }else if(date.substring(0,2).equals("09")){
          return "september";
        }else if(date.substring(0,2).equals("10")){
          return "october";
        }else if(date.substring(0,2).equals("11")){
          return "november";
        }else{
          return "december";
        }
        }
  
  
    /*
    Challenge 5:
    Create a function validatePswd() that accepts a password. The password must have 5 to 8 characters that are letters, numbers or any symbol except ^, *, (, )
    Return true if it's a valid password; otherwise return false.
    */
      boolean validatePswd(String pass){
        if(pass.Indexof("^").equals(-1)||pass.indexOf("*").equals(-1)||pass.Indexof("(").equals(-1)||pass.Indexof(")").equals(-1)){
          return true;
        }else{
          return false;
        }
      }
  
}