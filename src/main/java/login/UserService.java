package login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {


    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();


    public void showMenu(){ //main methodda çağırınca menuyu gösterecek
        System.out.println("===TECHPROEDUCATİON===");
        System.out.println("1- Uye Ol");
        System.out.println("2- Giris Yap");
        System.out.println("3- Cıkıs");
        System.out.println("Seciminiz :   ");
    }

    public void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-Soyad giriniz");
        String name= scanner.nextLine();

        String username;
        boolean existUsername;//username ile ilgili tekşart daha önce kullanılmamış olması
        do{
            System.out.println("Kullanici adini giriniz");
            username= scanner.nextLine();
            existUsername=usernameList.contains(username);
            if(existUsername){

                System.out.println("Bu username daha önce kullanılmıştır. Yeni bir username deneyiniz");

            }

        }while(existUsername);

        String email;
        boolean isValid = false;
        boolean existEmail;

        do{
            System.out.println("Email giriniz");
            email=scanner.nextLine().trim();
           existEmail= emailList.contains(email);



           if(existEmail) {


               isValid = false;
               System.out.println("Bu email daha önce kullanılmıştır. Yeni bir email deneyiniz");

           }
        }while (isValid);




    }//register
    public static boolean validateEmail(String email) {
        boolean isValid;

        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space) {
            System.out.println("Email bosluk iceremez");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email '@' içermelidir");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").length() == 0;
            boolean checkEnd = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");

            if(!checkStart){
                System.out.println("Email kucuk harf, buyuk harf, rakam ve _.- disinda karakter iceremez");
            }else if (!checkEnd) {
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli");
            }
            isValid = checkEnd && checkStart;

        }

        return isValid;
    }//10:27'de kaldım





}
