/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
   
    public static void generarLexer(String path){
        File file=new File(path);
        JFlex.Main.generate(file);
    }   
    
    public static void main(String[] args) throws Exception{
        String path = "C:/analizadorLS/AFprogramer/src/analizador/Lexer.flex";
        String cup = "C:/analizadorLS/AFprogramer/src/analizador/Sintactico.cup";
        generarLexer(path);
        generarCup(cup);
    }
    

    public static void generarCup(String cup) throws IOException, Exception{
        String[] archivoCup={"-parser","Sintactico",cup};
        java_cup.Main.main(archivoCup);
        boolean RedirigidoCup = redirigir("Sintactico.java");
        boolean RedirigidoSym= redirigir("sym.java");
        if(RedirigidoCup && RedirigidoSym){
            System.exit(0);
        }else System.err.println("Falló generar Cup");
    }

    private static boolean redirigir(String file) {
        boolean exito = false;
        File archivo = new File(file);
        if (archivo.exists()) {
            Path currentRelativePath = Paths.get("");
            String miLocacion = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "analizador" + File.separator + archivo.getName();
            
            File archivoAnterior = new File(miLocacion);
            archivoAnterior.delete();
            
            if (archivo.renameTo(new File(miLocacion))) {
                exito = true;
            }else {System.err.println("Fallo renombrar");System.out.println(miLocacion);}
            
        }else System.err.println("Fallo redirigir");
        return exito;

    }
}
