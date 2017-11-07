/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

import java.io.File;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:/analizadorLexico-Java/AFprogramer/src/analizador/Lexer.flex";
        generarLexer(path);

    }
    public static void generarLexer(String path){
        File file=new File(path);
        JFlex.Main.generate(file);
    }
}
