import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String[] greetings = {"Hi, what's your name?", "Hey there, what's your name?"};
        String[] clarifications = {"Could you please say that again?", "Could you rephrase that?", "I don't understand what you're saying."};
        Map<String, String> teams = new HashMap<>();
        teams.put("cardinals", "8-2");
        teams.put("falcons", "4-5");
        teams.put("ravens", "6-3");
        teams.put("bills", "6-3");
        teams.put("panthers", "5-5");
        teams.put("bears", "3-6");
        teams.put("bengals", "5-4");
        teams.put("browns", "5-5");
        teams.put("cowboys", "7-2");
        teams.put("broncos", "5-5");
        teams.put("lions", "0-8-1");
        teams.put("packers", "8-2");
        teams.put("texans", "1-8");
        teams.put("colts", "5-5");
        teams.put("jaguars", "2-7");
        teams.put("chiefs", "6-4");
        teams.put("raiders", "5-4");
        teams.put("chargers", "5-4");
        teams.put("rams", "7-2");
        teams.put("dolphins", "3-7");
        teams.put("vikings", "4-5");
        teams.put("patriots", "6-4");
        teams.put("saints", "5-4");
        teams.put("giants", "3-6");
        teams.put("jets", "2-7");
        teams.put("eagles", "4-6");
        teams.put("steelers", "5-3-1");
        teams.put("49ers", "3-5");
        teams.put("seahawks", "3-6");
        teams.put("buccaneers", "6-3");
        teams.put("titans", "8-2");
        teams.put("washington", "3-6");
        
        
        randomResponse(greetings);
        
        convo: while (true) {
            String resp = sc.nextLine();
            String[] arg = resp.split(" ");
            for (int i = 0; i < arg.length; i++) {
                if (teams.containsKey(arg[i].toLowerCase())) {
                    System.out.println("The team's record is " + teams.get(arg[i]));
                    continue convo;
                }
            }
            if (resp.contains("nfc")) {
                System.out.println("NFC Standings:\n1. Green Bay Packers (8-2)\n2. Arizona Cardinals (8-2)\n3. Dallas Cowboys (7-2)\n4. Los Angeles Rams (7-2)\n5. Tampa Bay Buccaneers (6-3)\n6. New Orleans Saints (5-4)\n7. Carolina Panthers (5-5)\n8. Minnesota Vikings (4-5)\n9. Atlanta Falcons (4-5)\n10. Philadelphia Eagles (4-6)\n11. San Francisco 49ers (3-5)\n12. Washington Football Team (3-6)\n13. New York Giants (3-6)\n14. Seattle Seahawks (3-6)\n15. Chicago Bears (3-6)\n16. Detroit Lions (0-8-1)");
            } 
            else if (resp.contains("afc")) {
                System.out.println("AFC Standings:\n1. Tennessee Titans (8-2)\n2. Buffalo Bills (6-3)\n3. Baltimore Ravens (6-3)\n4. Pittsburgh Steelers (5-3-1)\n5. Kansas City Chiefs (6-4)\n6. New England Patriots (6-4)\n7. Los Angeles Chargers (5-4)\n8. Las Vegas Raiders (5-4))\n9. Cincinnati Bengals (5-4)\n10. Indianapolis Colts (5-5)\n11. Cleveland Browns (5-5)\n12. Denver Broncos (5-5)\n13. Miami Dolphins (3-7)\n14. New York Jets (2-7)\n15. Jacksonville Jaguars (2-7)\n16. Houston Texans (1-8)");
            }
            else if (resp.contains("rankings")) {
                System.out.println("Hi, do you want rankings of all 32 teams and their players?");
            } 
            else if (resp.contains("name is ")) {
                System.out.print("Hi, ");
                name = resp.substring(resp.lastIndexOf("name is ")+8, resp.length());
                System.out.println(name + ", nice to meet you!");
            } 
            else if (resp.toLowerCase().contains("hi") || resp.toLowerCase().contains("hey") || resp.toLowerCase().contains("hello")) {
                System.out.println("Hi, how are you doing?");
            }
            else if (resp.toLowerCase().contains("goodbye")) {
                System.out.println("Goodbye");
                break;
            } 
            else {
                randomResponse(clarifications);
            }
        }
        System.out.println("End of conversation");
        
        sc.close();
    }
    
    public static void randomResponse(String[] responses) {
        System.out.println(responses[new Random().nextInt(responses.length)]);
    }
    
    
}
