import java.util.Scanner;
public class CinZodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Dogum yilinizi giriniz :");
        year = input.nextInt();

        if(year%12==0){
            System.out.println("Cin zodyagi burcunuz: Maymun");
        }if (year%12==1) {
            System.out.println("Cin zodyagi burcunuz: Horoz");
        }if (year%12==2) {
            System.out.println("Cin zodyagi burcunuz: Kopek");
        }if (year%12==3) {
            System.out.println("Cin zodyagi burcunuz: Domuz");
        }if (year%12==4) {
            System.out.println("Cin zodyagi burcunuz: Fare");
        }if (year%12==5) {
            System.out.println("Cin zodyagi burcunuz: Okuz");
        }if (year%12==6) {
            System.out.println("Cin zodyagi burcunuz: Kaplan");
        }if (year%12==7) {
            System.out.println("Cin zodyagi burcunuz: Tavsan");
        }if (year%12==8) {
            System.out.println("Cin zodyagi burcunuz: Ejderha");
        }if (year%12==9) {
            System.out.println("Cin zodyagi burcunuz: Yılan");
        }if (year%12==10) {
            System.out.println("Cin zodyagi burcunuz: At");
        }if (year%12==11) {
            System.out.println("Cin zodyagi burcunuz: Koyun");
        }
    }
}
