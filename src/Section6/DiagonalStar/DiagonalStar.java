package Section6.DiagonalStar;

public class DiagonalStar {
    
    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        } else{
            for(int rowNumber = 1; rowNumber <= number; rowNumber++){
                for(int columnNumber = 1; columnNumber <= number; columnNumber++){
                    if(columnNumber == 1 || rowNumber == 1 || columnNumber == number || rowNumber == number || rowNumber == columnNumber || columnNumber == number - rowNumber + 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }

        }
    }
    
    public static void main(String[] args) {
        printSquareStar(9);
        
    }
    
}
