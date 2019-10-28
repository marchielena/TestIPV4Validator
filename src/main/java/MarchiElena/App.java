package MarchiElena;

import java.util.Scanner;

/*
 *verificare la validità di un indirizzo IPv4
 * VALIDI: "255.255.255.255", "127.0.0.1", "1.1.1.1"
 * NON VALIDI: "1444.23.9", "153.500.234.444", "-12.344.43.11"
 */

public class App {
    public static void main(String[] args) {

        System.out.print("Inserisci un indirizzo IPv4: ");
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        if (Ipv4Validator(ip)) {
            System.out.println("L'IPv4 " + ip + " è un indirizzo valido!");
        }else {
            System.out.println("L'IPv4 " + ip + " non è un indirizzo valido!");
        }
    }

    public static boolean Ipv4Validator(String ip) {

        for (int i = 0; i < ip.length(); i++) {
            if (!(ip.charAt(i) >= 48 && ip.charAt(i) <= 57)) {
                if (ip.charAt(i) == 46) { // char 46 == .
                    continue;
                }
                return false;
            }
        }

        String[] sections = ip.split("\\.");
        if (sections.length != 4)
            return false;

        for (String section : sections) {
            if (!((Integer.valueOf(section) >= 0) && ((Integer.valueOf(section) <= 255))))
                return false;
        }
        return true;
    }
}
