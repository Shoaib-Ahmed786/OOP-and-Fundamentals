import java.util.Scanner;
class Largest{
           public static void main(String[] args){
           Scanner input=new Scanner(System.in);
          int a;
          int b;
   	  int c;
          System.out.print("Enter the value of a::" );
           a=input.nextInt();

         System.out.print("Enter the value of b::" );
           b=input.nextInt();
       
        System.out.print("Enter the value of c::" );
           c=input.nextInt();

	if(a>b && a>c){
		System.out.print("The Largest Number is A:: " + a);
}
	else if(b>a && b>c){
		System.out.print("The Largest number is B::" + b);
}
	else{
		System.out.print("The Largest number is C::" + c);


}
}

}


        



