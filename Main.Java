import java.util.Scanner;
class Main {

//Staging the begining of the project
public static void main (String[] args){
// Declaring my Var 
int myNum;
  int backwardNum = 0;
  Scanner input = new Scanner(System.in);
  myNum=input.nextInt();
  // starting the loop
  while(myNum!=0){
   //Creating statements  
    backwardNum = backwardNum * 10;
    backwardNum = backwardNum + myNum%10;
    myNum = myNum/10;
  }
  System.out.println(backwardNum);
  
}
}
