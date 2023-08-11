import java.util.*;
import java.io.*;

public class json {
   	
    
    String input, horizontal_options, vertical_options, linearCollection;
    public static void main (String[] args)throws IOException{
        try (Scanner kb = new Scanner(System.in)) {
            //build the json file as a txt file first
            System.out.print("  FileName: " );
            String fileNameInput = kb.nextLine();
            File file = new File(fileNameInput + ".json");

            try (//writes the skeletal outline of a json file to the txt file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                //templates for different kinds of json creations
                //EX: credentials, stacks, resume, idk whatever you want a file of
                System.out.println("Templates for json build"
                                 + "\n======================="
                                 + "\n1: Example JSON"
                                 + "\n2: Custom Request-Based JSON"
                                 + "\n3: Fuzz Request-Based JSON");
                int selection = kb.nextInt();
                switch (selection) {
                    case 1:
                        writer.write("\"bin\":" + "{\n\t\"" + "\"<your package name>\"" + ": \"./index.js\"" + "\n}");
                            break;
                    case 2:
                    writer.write(
                                "[{\n" +
                                    "\t\"verb\"" + ": \"<GET || POST || PUT || TRACE>\",\n" + 
                                    "\t\"url\"" + ": \"HTTPS://UBISOFT.COM\",\n" + 
                                    "\t\"params\"" + ": \"user=user1@password=1234\",\n" + 
                                    "\t\"headers\"" + ":{\n" +
                                                                "\t\t\t\"Accept\"" + ": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,/;q=0.8\",\n" +
                                                                "\t\t\t\"Accept-Language\"" + ": \"en-US,en;q=0.5\",\n" +
                                                                "\t\t\t\"Connection\"" + ": \"keep-alive\",\n" +
                                                                "\t\t\t\"Upgrade-Insecure-Requests\"" + ": \"1\",\n" +
                                                                "\t\t\t\"Origin\"" + ": \"https://www.ubisoft.com\",\n" +
                                                                "\t\t" + "\t" + "\"Host\"" + ": \"www.ubisoft.com\",\n" +
                                                            "\t}" + 
                                "\n}]");
                        break;
                    case 3:
                    writer.write(
                                "[{\n" +
                                    "\t\"verb\"" + ": \"<GET || POST || PUT || TRACE>\",\n" + 
                                    "\t\"url\"" + ": \"HTTPS://UBISOFT.COM\",\n" + 
                                    "\t\"params\"" + ": \"user=user1@password=1234\",\n" + 
                                    "\t\"headers\"" + ":{\n" +
                                                                "\t\t\t\"Accept\"" + ": \"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,/;q=0.8\",\n" +
                                                                "\t\t\t\"Accept-Language\"" + ": \"en-US,en;q=0.5\",\n" +
                                                                "\t\t\t\"Connection\"" + ": \"keep-alive\",\n" +
                                                                "\t\t\t\"Upgrade-Insecure-Requests\"" + ": \"1\",\n" +
                                                                "\t\t\t\"Origin\"" + ": \"https://www.ubisoft.com\",\n" +
                                                                "\t\t" + "\t" + "\"Host\"" + ": \"www.ubisoft.com\",\n" +

                                                                "\t\t\t\"X-Originating-IP\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-Forwarded-For\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-Forwarded\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"Forwarded-For\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-Remote-IP\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-Remote-Addr\"" + ": \"127.0.0.1\",\n" +
                                                                
                                                                "\t\t\t\"X-ProxyUser-Ip\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-Original-URL\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"Client-IP\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"True-Client-IP\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"Cluster-Client-IP\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"X-ProxyUser-Ip\"" + ": \"127.0.0.1\",\n" +
                                                                "\t\t\t\"Host\"" + ": \"localhost\"\n" +
                                                            "\t}" + 
                                "\n}]");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}