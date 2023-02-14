package Main;

import java.util.Scanner;
import java.util.*;
import Bay.*;
import Deck.*;
import Engine.*;
import Enums.*;
import Factory.*;
import Hull.*;
import Interfaces.*;
import ISD.*;

public class Main {
    
    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Build Droid Factory
        System.out.print("How many Imperial Star Destroyers would you like to build? ");
        int count = input.nextInt();
        System.out.print("\n" + "Which variant of the Imperial Star Destroyer would you like to build, 1 or 2? ");
        int type = input.nextInt();
        if(type == 1) {
            ISD1_Factory isd1 = new ISD1_Factory("Imperial Star Destroyer 1");
            isd1.buildISDs(count);
            isd1.displayISDs(count);
        }
        if(type == 2) {
            ISD2_Factory isd2 = new ISD2_Factory("Imperial Star Destroyer 2");
            isd2.buildISDs(count);
            isd2.displayISDs(count);
        }
    }
}
