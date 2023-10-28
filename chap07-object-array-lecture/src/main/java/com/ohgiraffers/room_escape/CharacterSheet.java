package main.java.com.ohgiraffers.room_escape;

import javax.xml.stream.events.Characters;

public class CharacterSheet {

    private final static Sheet[] characters;
    private static int count;

    static {
        characters = new Sheet[5];
    }


    public static boolean store(Sheet[] newCharacters) {

        for (int i = 0; i < newCharacters.length; i++) {

            characters[count++] = newCharacters[i];
        }

        return true;
    }

    public static Sheet[] select(){
        return characters;
    }
}
