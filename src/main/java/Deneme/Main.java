package Deneme;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Names names = new Names();

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen eklenecek ismi giriniz");
        String isim= input.nextLine();
        names.addName(isim);

        System.out.println("lütfen silinecek ismi giriniz");
        String silinecekIsim= input.nextLine();
        names.removeName(silinecekIsim);

        System.out.println(names.getNames());
    }
}
