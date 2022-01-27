package com.JavaAssignment.assignment11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String args[]) {
        String filename = args[0];
        Map<Character,Integer> characterMap = new HashMap<>();
        try {
            FileInputStream fin = new FileInputStream(filename);
            int i=0;
            while((i=fin.read())!=-1)
            {
                char character = (char)i;
                characterMap.putIfAbsent(character,0);
                int currentCount = characterMap.get(character);
                characterMap.replace(character,currentCount+1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

            try
            {
                FileOutputStream fout = new FileOutputStream("result.txt");
                for (Map.Entry m:characterMap.entrySet()) {
                    String result = m.getKey() + " occured " + m.getValue() + " times\n";
                    byte[] b = result.getBytes();
                    fout.write(b);
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

    }


}
