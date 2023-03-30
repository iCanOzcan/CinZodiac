import java.util.Scanner;
public class CinZodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Dogum yilinizi giriniz :");
        year = input.nextInt();

        if(year%12==0){
            System.out.println("Cin zodyagi burcunuz: Maymun");
        } else if (year%12==1) {
            System.out.println("Cin zodyagi burcunuz: Horoz");
        }else if (year%12==2) {
            System.out.println("Cin zodyagi burcunuz: Kopek");
        }else if (year%12==3) {
            System.out.println("Cin zodyagi burcunuz: Domuz");
        }else if (year%12==4) {
            System.out.println("Cin zodyagi burcunuz: Fare");
        }else if (year%12==5) {
            System.out.println("Cin zodyagi burcunuz: Okuz");
        }else if (year%12==6) {
            System.out.println("Cin zodyagi burcunuz: Kaplan");
        }else if (year%12==7) {
            System.out.println("Cin zodyagi burcunuz: Tavsan");
        }else if (year%12==8) {
            System.out.println("Cin zodyagi burcunuz: Ejderha");
        }else if (year%12==9) {
            System.out.println("Cin zodyagi burcunuz: Yılan");
        }else if (year%12==10) {
            System.out.println("Cin zodyagi burcunuz: At");
        }else if (year%12==11) {
            System.out.println("Cin zodyagi burcunuz: Koyun");
        }
    }
}
