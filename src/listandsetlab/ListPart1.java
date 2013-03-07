/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ListPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 List<String> hobby = new ArrayList<String>();
        hobby.add("Disc Golf");
        hobby.add("WoW");
        hobby.add("Programming");
        hobby.add("WoW");
        
        hobby.add(1, "Steak");
        
        for(String s : hobby){
            System.out.println(s);
        }
        
        String item = (String)hobby.get(1);    }
}
