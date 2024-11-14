/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloopdemo;

public class WhileLoopDemo {

/*    public static void main(String[] args) {
        
        int count = 1;
        
        System.out.println("Printing Numbers from 1 to 10");
        
        while (count <= 10){
            System.out.println(count++); }
    }
}*/
    
/*    public static void main(String[] args){
        
        int count = 5;
        
        System.out.println("Printing Numbers from 5 to 100");
        
        do {
            System.out.println(count++);}
        while (count <= 100);
      }
}*/
    
/*    public static void main(String[] args){
        
        System.out.println("Printing Numbers from 10 to 1");
        
        for (int count = 10; count >=1; count--){
            System.out.println(count);}
      }
}*/
    
/*    public static void main(String[] args){
        
        System.out.println("Printing Numbers from 1 to 10");
        
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count++;}
        }
}*/

/*    public static void main(String[] args){
        
        int i;
        System.out.println("Printing Numbers from 10 to 1");
        
        for (i = 1; i <=10; i++){
            if (i == 5)
                break;
            System.out.println(i + "\t");}
            System.out.println("Broke out of loop at i = " + i);
      }
}*/
    
/*    public static void main(String[] args){
        
        System.out.println("Printing Numbers from 1 - 10");
        
        for (int i = 1; i <= 10; i++){
            if (i == 5)
                continue;
            System.out.println(i + "\t");}
            System.out.println("Skip printing 5");
    }
}*/

/*    public static void main(String[] args) {
        String searchMe = "keen kids keep kicking kites, kindly keeping kites in the sky";
        int max = searchMe.length();
        int numKs = 0;
        int numEs = 0;
        
        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == 'k') {
                numKs++;
            continue;}
            if (searchMe.charAt(i) == 'e') {
                numEs++;
            continue;}}
        System.out.println("Found " + numKs + " k's in the string.");
        System.out.println("Found " + numEs + " e's in the string.");
        System.out.println("Total characters: " + max);
    }
}*/
    
 /*   public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 10; i++) {
            result = square(i);
            System.out.println("The square of " + i + " is = " + result + "\n");}}

    public static int square(int y) {
        return y * y;
    }
}*/
    
/*    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(i);
            System.out.println();}
    }
}*/

/*    public static void main(String[] args) {  
        for(int i=1;i<=5;i++){  
            for(int j=1;j<=i;j++){  
                System.out.print("* ");  }  
            System.out.println();}  
    }  
}*/

public static void main(String[] args) {
    int arrowHeight = 5; // Height of the arrow
    int handleHeight = 7; // Height of the arrow stick

    // arrow
    for (int i = 1; i <= arrowHeight; i++) {
        for (int j = arrowHeight; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // arrow stick
    int handleWidth = arrowHeight / 3; // Width of the arrow stick
    int padding = (2 * arrowHeight - 1 - handleWidth) / 2; // Padding to center the handle

    for (int i = 0; i < handleHeight; i++) {
        for (int j = 0; j < padding; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < handleWidth; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // line at the bottom of the arrow
    for (int i = 0; i < 2 * arrowHeight - 1; i++) {
        System.out.print("*");
    }
    System.out.println();
}
}