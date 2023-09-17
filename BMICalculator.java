import java.util.*;
class BMICalculator{
    public static void main(String args[]){
        double BMI;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the body weight in kg");
        double weight=sc.nextDouble();
        System.out.println("enter the height in m");
        double height=sc.nextDouble();
        BMI=weight/(height*height);
        System.out.println("BMI Value :" +BMI);
        if(BMI<18.5){
            System.out.println("Under Weight");
        }
        else if(BMI>=18.5 && BMI<24.9){
            System.out.println("Normal Weight");
        }
        else if(BMI>=25 && BMI<29.9){
            System.out.println("Over Weight");
        }
         else{
            System.out.println("Obse");
        } 
        }
    }
