
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizador;

import java.io.FileReader;
import java.util.Hashtable;
import java.util.Stack;
import java_cup.runtime.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\017\000\002\003" +
    "\003\000\002\003\005\000\002\004\003\000\002\004\005" +
    "\000\002\005\011\000\002\005\012" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\014\004\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\006\010\uffff\011\037\001\002\000\004\010\011\001" +
    "\002\000\004\007\012\001\002\000\004\004\013\001\002" +
    "\000\004\010\014\001\002\000\004\015\015\001\002\000" +
    "\004\004\007\001\002\000\004\010\017\001\002\000\004" +
    "\006\020\001\002\000\004\016\021\001\002\000\010\010" +
    "\ufffd\011\035\013\ufffd\001\002\000\004\010\023\001\002" +
    "\000\004\004\025\001\002\000\004\002\000\001\002\000" +
    "\004\005\026\001\002\000\004\004\027\001\002\000\004" +
    "\012\030\001\002\000\004\016\021\001\002\000\004\013" +
    "\032\001\002\000\004\010\033\001\002\000\006\002\ufffb" +
    "\004\025\001\002\000\004\002\ufffa\001\002\000\004\016" +
    "\021\001\002\000\006\010\ufffc\013\ufffc\001\002\000\004" +
    "\004\007\001\002\000\004\010\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\002\004\001\001\000\004\003\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\015\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\023" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\030\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\033\001\001\000" +
    "\002\001\001\000\004\004\035\001\001\000\002\001\001" +
    "\000\004\003\037\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

vars = 0;

    }



    Hashtable<String, Lexema> tabla = new Hashtable<>();
    int contadorTemporales = 0; 
    int ifs = 0;
    int whiles = 0;
    int fors = 0;
    int switches = 0;
    int cases = 0;
    Stack caso = new Stack();

    public static int vars;
    StringBuilder m = new StringBuilder("");


public void report_error(String message, Object info) {
        if (info instanceof java_cup.runtime.Symbol){
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            m=new StringBuilder("Error Critico "+s+" : ");
            if (s.left >= 0) {m.append(" Linea: "+(s.left+1));
                if (s.right >= 0)m.append(" Columna: "+(s.right+1)+"\nRepare antes de Continuar");}}
            if(m.length()!=0)
                Interface.setError(m+"");
    }

public void syntax_error(Symbol s){
append("Error\n"+"linea: "+(s.left+1)+ "\nColumna: "+(s.right+1)+"\n");
}


/*public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
append("Error\n"+"linea: "+(s.left+1)+ "\nColumna: "+(s.right+1)+"\n");
}*/

public static void append(String mensaje){
StringBuilder me;
    me = new StringBuilder("Error Sintactico: "+" ");
    me.append(mensaje);
    //System.out.println(me);
    Interface.setError(me.toString());
}

    public static void main(String[] args){
        try {
                Sintactico sintactico = new Sintactico(new Lexer(new FileReader(args[0])));
try{
                Object result = sintactico.parse().value;}catch(Exception ex){


}
            System.out.println("\n*** Resultados finales ***");
        } catch (Exception ex) {
           // ex.printStackTrace();
        }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {


   void print(String msj)
 
   {System.out.println(msj);}

  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Lexema start_val = (Lexema)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= ESTADO IDE DELIMITADOR INICIAL IDENTIFICADOR DELIMITADOR FIN IDE DELIMITADOR ALFABETO AL DELIMITADOR TRANSICIONES 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-12)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // IDE ::= IDENTIFICADOR 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("IDE",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // IDE ::= IDENTIFICADOR SEPARADOR IDE 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("IDE",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // AL ::= ALPHA 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("AL",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // AL ::= ALPHA SEPARADOR AL 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("AL",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // TRANSICIONES ::= IDENTIFICADOR TRANSICION IDENTIFICADOR PARENTESIS_ABRE AL PARENTESIS_CIERRA DELIMITADOR 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TRANSICIONES",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // TRANSICIONES ::= IDENTIFICADOR TRANSICION IDENTIFICADOR PARENTESIS_ABRE AL PARENTESIS_CIERRA DELIMITADOR TRANSICIONES 
            {
              Lexema RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TRANSICIONES",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
