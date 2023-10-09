package practice_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ZamanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogum Gunu Tebrik Mesajı");
        System.out.println("Dogum Gununuzu ve Saati Ornek Formatta Giriniz (2020-10-23 14:33)");
        String dogumGunuInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dogumGunu = LocalDateTime.parse(dogumGunuInput, formatter);

        LocalDateTime bugun = LocalDateTime.now();

        if (dogumGunu.getMonthValue() == bugun.getMonthValue() && dogumGunu.getDayOfMonth() == bugun.getDayOfMonth()) {
            System.out.println("Dogum Gununuz Kutlu Olsun!");
        } else {
            long gunKaldi = bugun.until(dogumGunu, ChronoUnit.DAYS);
            long saatKaldi = bugun.until(dogumGunu, ChronoUnit.HOURS);
            System.out.println("Dogum Gununuze " + gunKaldi + " gun veya " + saatKaldi + " saat kaldi");
        }
        scanner.close();
    }
}
