// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pattern {

    static void printPattern(int lines){
        int spaces, stars;
        spaces = lines/2;
        stars = 1;
        for(int i= 0 ; i<lines ; i++){
            for(int j=0 ; j<spaces ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<stars ; j++){
                System.out.print("*");
            }
            System.out.println();
            if( i < lines/2 ){
                spaces--;
                stars += 2;
            }
            else{
                spaces++;
                stars -=2;
            }
        }
    }

    public static void main(String[] args) {
        printPattern(9);
    }
}