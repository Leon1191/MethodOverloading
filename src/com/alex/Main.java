package com.alex;

public class Main {

    public static void main(String[] args) {
	double ansver = calcFeetAndInchesToCentimeters(1,11);
        System.out.println(ansver);

        ansver = calcFeetAndInchesToCentimeters(29);
        System.out.println(ansver);

    }




    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
      if (feet >= 0 && inches >= 0 && inches <= 12)
      {
          return (((feet*12)+inches)*2.54);
      }
      return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0)
        {
           double feet = (int) inches/12;
           inches = inches % 12;

           return calcFeetAndInchesToCentimeters(feet, inches);
        }

        return -1;
    }

}
