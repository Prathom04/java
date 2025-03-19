import java.util.*;
public class Bangla_season{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Look at the list below and input the number of the Bengla month name whose season you want to know about.\n 1. Baisakh.\n 2.Jyaistha.\n 3. Asardh.\n 4.Sraban.\n 5.Bhadra.\n 6. Ashhine.\n 7. Kartik.\n 8.Agrahayan.\n 9.Paush.\n 10.Magh. 11.Falgun.\n 12.Chatrya. ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
            System.out.println("The month Baisakh falls under the summer season.");
                break;
            case 2:
            System.out.println("The month Jayistha falls under the summer season.");
                break;
            case 3:
            System.out.println("The month Asardh falls under the rainy season.");
                break;
            case 4:
            System.out.println("The month Sraban falls under the rainy season.");
                break;
            case 5:
            System.out.println("The month Bhadra falls under the autumn season.");
                break;
            case 6:
            System.out.println("The month Ashhine falls under the autumn season.");
                break;
            case 7:
            System.out.println("The month kartik falls under the late autumn season.");
                break; 
            case 8:
            System.out.println("The month Arahayan falls under the late autumn season.");
                break;
            case 9:
            System.out.println("The month Paush falls under the winter season.");
                break;
            case 10:
            System.out.println("The month Magh falls under the winter season.");
                break;
            case 11:
            System.out.println("The month Falgun falls under the spring season.");
                break;
            case 12:
            System.out.println("The month Chatrya falls under the spring season.");
                break;
            default:
            System.out.println("Ivaild input.");
                break;
        }
        sc.close();
}
}