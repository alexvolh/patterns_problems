package main;

import main.tractive.Bull;
import main.tractive.Donkey;
import main.tractive.Horse;
import main.tractive.Tractive;

/**
 *
 */
public class TractiveFactory {
    public static Tractive getTractive(String tractiveType) {
        if (tractiveType.equalsIgnoreCase("DONKEY")) {
            return new Donkey();
        } else if (tractiveType.equalsIgnoreCase("HORSE")) {
            return new Horse();
        } else if (tractiveType.equalsIgnoreCase("BULL")) {
            return new Bull();
        }
        return null;
    }
}
