/**
 * json
 */

 import java.util.*;
 import java.io.*;
 import java.lang.*;

public class json {
    private static void jsonBuild(String fileNameInput)throws IOException {
        Scanner kb = new Scanner(System.in);
        String charCount = "", input, horizontal_options, vertical_options, linearCollection;
        int i;
        
        //build the json file as a txt file first
        System.out.print("\nJSON FileName: ");
        fileNameInput = kb.nextLine();
        File file = new File(fileNameInput + ".json");

        //writes the skeletal outline of a json file to the txt file
        FileWriter writer = new FileWriter(file, true);
        /*
        //base code for json file
        writer.write("{\n\t\"" + input + "\": [" + "\"" + horizontal_options + "\"" + ", \n\t\t\t" 
                                                 + "\"" + vertical_options + "\""
                               + "\n\t]," 
                               + "\n\t\"" + linearCollection + "\": [" + "\"" + horizontal_options + "\"]"
                               + "\n}");
        */

        

        //templates for different kinds of json creations
        //EX: credentials, stacks, resume, idk whatever you want a file of
        System.out.println("\nTemplates for json build"
                         + "\n======================="
                         + "\n1: Example JSON"
                         + "\n2: Resume"
                         + "\n3: App package template");
                        //  + "\n4: 2D Collection"
                        //  + "\n5: Custom");
        int selection = kb.nextInt();
        switch (selection) {
            case 1:
            writer.write("\"bin\":" + "{\n\t" + "\"<your package name>\"" + ": \"./index.js\"" + "\n}");
            writer.close();
                break;
            case 2: //resume
            /* HOW MANY TIMES FINNA LOOP
            general information
            career objective
            skills
            education
            experience
            tech stack
            */
            charCount = "";
            i = 0;
            kb.nextLine();
            System.out.println("\n=======================\nRESUME\n");
            writer.write("{");
            while(true){
                if(i > 0){
                    writer.write(",");
                }
                System.out.println("Section header: Press enter to end process");
                input = kb.nextLine();
                charCount = input;

                if(!(charCount.length() == 0)){
                    writer.write("\n    \"" + input + "\": \n\t\t\t[");
                }else{
                    break;
                }

                System.out.println("Contents to display: Press enter to end process");
                while(charCount.length() > 0){
                    vertical_options = kb.nextLine();
                    charCount = vertical_options;
                    if(charCount.length() == 0){
                        break;
                    }else{
                        writer.write("\"" + vertical_options + "\"" + ", \n\t\t\t ");
                    }
                }

                writer.write("]");
                charCount = input;
                i++;
            }
            writer.write("\n}");
            writer.close();

                break;
        case 3: //standard app
            /* HOW MANY TIMES FINNA LOOP
            name
            version
            main
            */
            charCount = "";
            i = 0;
            kb.nextLine();
            System.out.println("\n=======================\nTEMPLATE\n");//name of the template structure
            writer.write("{");//opening curly brace
            while(true){
                System.out.println("Section header: Press enter to end process");
                input = kb.nextLine();
                charCount = input;

                if(!(charCount.length() == 0)){
                    if(i > 0){
                        writer.write(",");
                    }
                    writer.write("\n    \"" + input + "\": ");//where it begins writing ("data": for the "attribute")
                }else{
                    break;
                }//end data

                System.out.println("Contents to display: Press enter to end process"); 
                while(charCount.length() > 0){
                    horizontal_options = kb.nextLine();
                    charCount = horizontal_options;
                    if(charCount.length() == 0){
                        break;
                    }else{
                        writer.write("\"" + horizontal_options + "\"");
                    }
                }
                charCount = input;
                i++;
            }
            writer.write("\n}");
            writer.close();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args)throws IOException, InterruptedException{
        jsonBuild("Test");
        System.out.println("\nSuccessfully built json");
    }
}
