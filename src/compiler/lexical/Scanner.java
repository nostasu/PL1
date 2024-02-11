/* The following code was generated by JFlex 1.4.1 on 11/2/24 22:47 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 11/2/24 22:47 from the specification file
 * <tt>C:/Users/noeli/git/repository/ArquitecturaPLI-2023-2024/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 1;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\47\1\5\1\6\1\47\1\5\1\5\22\47\1\1\1\0\1\46"+
    "\5\0\1\34\1\35\1\41\1\0\1\36\1\12\1\43\1\45\1\11"+
    "\11\10\1\40\1\37\1\0\1\42\1\44\2\0\1\13\1\15\1\22"+
    "\1\14\1\16\1\2\1\17\1\31\1\3\2\7\1\21\1\7\1\4"+
    "\1\20\1\27\1\7\1\26\1\23\1\24\1\25\1\7\1\33\1\7"+
    "\1\32\1\7\4\0\1\30\1\0\1\13\1\15\1\22\1\14\1\16"+
    "\1\2\1\17\1\31\1\3\2\7\1\21\1\7\1\4\1\20\1\27"+
    "\1\7\1\26\1\23\1\24\1\25\1\7\1\33\1\7\1\32\1\7"+
    "\4\0\1\47\uff80\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\3\3\2\4\1\5\12\3\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\1"+
    "\1\16\1\17\1\20\1\21\1\22\3\3\1\23\1\3"+
    "\1\24\1\25\1\26\17\3\1\27\1\30\4\3\1\31"+
    "\2\3\1\32\1\3\1\33\17\3\1\34\1\35\1\3"+
    "\1\36\1\37\1\40\2\3\1\0\2\3\1\41\2\3"+
    "\1\42\4\3\1\0\1\3\1\43\4\3\1\44\1\45"+
    "\1\0\2\3\1\46\1\47\1\3\1\0\1\3\1\50"+
    "\1\51\1\52\1\3\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\170\0\240\0\310\0\360"+
    "\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230"+
    "\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\170\0\170\0\170"+
    "\0\170\0\u0320\0\170\0\170\0\170\0\u0348\0\170\0\u0370"+
    "\0\170\0\170\0\170\0\u0398\0\u03c0\0\u03e8\0\360\0\u0410"+
    "\0\360\0\u0140\0\170\0\u0438\0\u0460\0\u0488\0\u04b0\0\u04d8"+
    "\0\u0500\0\u0528\0\u0550\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\u0618"+
    "\0\u0640\0\u0668\0\170\0\170\0\u0690\0\u06b8\0\u06e0\0\u0708"+
    "\0\360\0\u0730\0\u0758\0\360\0\u0780\0\360\0\u07a8\0\u07d0"+
    "\0\u07f8\0\u0820\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8\0\u0910"+
    "\0\u0938\0\u0960\0\u0988\0\u09b0\0\u09d8\0\360\0\360\0\u0a00"+
    "\0\360\0\360\0\360\0\u0a28\0\u0a50\0\u0a78\0\u0aa0\0\u0ac8"+
    "\0\360\0\u0af0\0\u0b18\0\360\0\u0b40\0\u0b68\0\u0b90\0\u0bb8"+
    "\0\u0be0\0\u0c08\0\360\0\u0c30\0\u0c58\0\u0c80\0\u0ca8\0\360"+
    "\0\360\0\u0cd0\0\u0cf8\0\u0d20\0\360\0\360\0\u0d48\0\u0d70"+
    "\0\u0d98\0\360\0\360\0\170\0\u0dc0\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\2\5\1\10\1\11"+
    "\1\12\1\13\1\14\1\10\1\15\1\16\1\10\1\17"+
    "\1\20\1\21\1\10\1\22\1\10\1\23\1\24\1\4"+
    "\2\10\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\4\1\34\1\35\1\36\1\37\1\4\5\40\2\41"+
    "\37\40\1\42\1\41\6\5\1\43\41\5\52\0\1\10"+
    "\1\44\1\10\2\0\3\10\1\0\1\45\11\10\1\46"+
    "\2\10\1\0\3\10\16\0\1\47\1\10\1\50\2\0"+
    "\3\10\1\0\10\10\1\51\4\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\15\10\1\0\3\10\24\0"+
    "\2\11\46\0\2\52\50\0\1\53\37\0\2\10\1\54"+
    "\2\0\3\10\1\0\15\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\3\10\1\55\1\10\1\56\7\10"+
    "\1\0\3\10\16\0\2\10\1\57\2\0\3\10\1\0"+
    "\6\10\1\60\6\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\12\10\1\61\2\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\5\10\1\62\7\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\5\10\1\63"+
    "\7\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\13\10\1\64\1\10\1\0\1\65\1\66\1\10\16\0"+
    "\3\10\2\0\3\10\1\0\3\10\1\67\11\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\12\10\1\70"+
    "\1\71\1\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\15\10\1\0\1\72\2\10\56\0\1\73\47\0"+
    "\1\74\5\0\5\40\2\0\37\40\4\0\2\10\1\75"+
    "\2\0\3\10\1\0\15\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\6\10\1\76\6\10\1\0\3\10"+
    "\16\0\2\10\1\77\2\0\3\10\1\0\15\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\11\10\1\100"+
    "\3\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\1\10\1\101\13\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\4\10\1\102\10\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\5\10\1\103\7\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\1\10\1\104"+
    "\13\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\10\10\1\105\4\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\11\10\1\106\3\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\5\10\1\107\7\10\1\0"+
    "\3\10\16\0\2\10\1\110\2\0\3\10\1\0\15\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\12\10"+
    "\1\111\2\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\3\10\1\112\11\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\14\10\1\113\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\7\10\1\114\1\10\1\115"+
    "\3\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\11\10\1\116\3\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\5\10\1\117\7\10\1\0\3\10\16\0"+
    "\1\10\1\120\1\10\2\0\3\10\1\0\15\10\1\0"+
    "\3\10\15\0\1\5\3\10\2\5\3\10\1\0\15\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\10\10"+
    "\1\121\4\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\7\10\1\122\5\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\3\10\1\123\11\10\1\0\3\10"+
    "\16\0\1\10\1\124\1\10\2\0\3\10\1\0\15\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\6\10"+
    "\1\125\6\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\3\10\1\126\11\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\14\10\1\127\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\10\10\1\130\4\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\3\10\1\131"+
    "\11\10\1\0\3\10\16\0\2\10\1\132\2\0\3\10"+
    "\1\0\15\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\3\10\1\133\11\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\5\10\1\134\7\10\1\0\3\10"+
    "\16\0\3\10\2\0\3\10\1\0\12\10\1\135\2\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\15\10"+
    "\1\136\3\10\16\0\3\10\2\0\3\10\1\0\7\10"+
    "\1\137\5\10\1\0\3\10\16\0\3\10\2\0\3\10"+
    "\1\0\6\10\1\140\6\10\1\0\3\10\16\0\3\10"+
    "\2\0\3\10\1\0\3\10\1\141\11\10\1\0\3\10"+
    "\16\0\3\10\2\0\3\10\1\0\11\10\1\142\3\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\4\10"+
    "\1\143\10\10\1\0\3\10\16\0\2\10\1\144\2\0"+
    "\3\10\1\0\15\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\3\10\1\145\11\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\11\10\1\146\3\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\13\10\1\147"+
    "\1\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\13\10\1\150\1\10\1\0\3\10\35\0\1\151\30\0"+
    "\3\10\2\0\3\10\1\0\3\10\1\152\11\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\3\10\1\153"+
    "\11\10\1\0\3\10\16\0\1\10\1\154\1\10\2\0"+
    "\3\10\1\0\15\10\1\0\3\10\16\0\3\10\2\0"+
    "\3\10\1\0\3\10\1\155\11\10\1\0\3\10\16\0"+
    "\3\10\2\0\3\10\1\0\1\156\14\10\1\0\3\10"+
    "\16\0\3\10\2\0\3\10\1\0\1\157\14\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\1\10\1\160"+
    "\13\10\1\0\3\10\16\0\2\10\1\161\2\0\3\10"+
    "\1\0\15\10\1\0\3\10\17\0\1\162\46\0\3\10"+
    "\2\0\3\10\1\0\1\10\1\163\13\10\1\0\3\10"+
    "\16\0\3\10\2\0\3\10\1\0\5\10\1\164\7\10"+
    "\1\0\3\10\16\0\3\10\2\0\3\10\1\0\13\10"+
    "\1\165\1\10\1\0\3\10\16\0\2\10\1\166\2\0"+
    "\3\10\1\0\15\10\1\0\3\10\16\0\2\10\1\167"+
    "\2\0\3\10\1\0\15\10\1\0\3\10\20\0\1\170"+
    "\45\0\3\10\2\0\3\10\1\0\12\10\1\171\2\10"+
    "\1\0\3\10\16\0\2\10\1\172\2\0\3\10\1\0"+
    "\15\10\1\0\3\10\16\0\3\10\2\0\3\10\1\0"+
    "\11\10\1\173\3\10\1\0\3\10\32\0\1\174\33\0"+
    "\3\10\2\0\3\10\1\0\13\10\1\175\1\10\1\0"+
    "\3\10\16\0\3\10\2\0\3\10\1\0\3\10\1\176"+
    "\11\10\1\0\3\10\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3560];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\11\20\1\4\11\1\1\3\11\1\1\1\11"+
    "\1\1\3\11\7\1\1\11\17\1\2\11\41\1\1\0"+
    "\12\1\1\0\10\1\1\0\5\1\1\0\3\1\1\11"+
    "\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  
  //Función para crear los tokens
	Token newToken(int number){
 		Token token = new Token (number);
        token.setLine (yyline + 1);
        token.setColumn (yycolumn + 1);
        token.setLexema (yytext ());
        return token;
	}
    
	//Para manejar los strings
	StringBuffer string = new StringBuffer();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 25: 
          { return newToken(sym.AND);
          }
        case 44: break;
        case 24: 
          { return newToken(sym.DISTINCT);
          }
        case 45: break;
        case 11: 
          { return newToken(sym.MULTIPLY);
          }
        case 46: break;
        case 19: 
          { return newToken(sym.IF);
          }
        case 47: break;
        case 4: 
          { return newToken(sym.NUMBER);
          }
        case 48: break;
        case 10: 
          { return newToken(sym.COLON);
          }
        case 49: break;
        case 42: 
          { return newToken(sym.PUTLINE);
          }
        case 50: break;
        case 27: 
          { return newToken(sym.OUT);
          }
        case 51: break;
        case 13: 
          { return newToken(sym.GREATER);
          }
        case 52: break;
        case 35: 
          { return newToken(sym.WHILE);
          }
        case 53: break;
        case 16: 
          { LexicalError error = new LexicalError ("Error Lexico: Cadena malformada");
		error.setLine (yyline + 1);
		error.setColumn (yycolumn + 1);
		error.setLexema (string.toString ());
		lexicalErrorManager.lexicalFatalError (error);
          }
        case 54: break;
        case 7: 
          { return newToken(sym.CLOSEPARENTHESIS);
          }
        case 55: break;
        case 18: 
          { yybegin(YYINITIAL);
          }
        case 56: break;
        case 38: 
          { return newToken(sym.INTEGER);
          }
        case 57: break;
        case 29: 
          { return newToken(sym.LOOP);
          }
        case 58: break;
        case 21: 
          { LexicalError error = new LexicalError ("Error Lexico numero mal formado");
        					error.setLine (yyline + 1);
        					error.setColumn (yycolumn + 1);
        					error.setLexema (yytext ());
        					lexicalErrorManager.lexicalFatalError (error);
          }
        case 59: break;
        case 30: 
          { return newToken(sym.TRUE);
          }
        case 60: break;
        case 22: 
          { yybegin(COMMENT);
          }
        case 61: break;
        case 5: 
          { return newToken(sym.MINUS);
          }
        case 62: break;
        case 39: 
          { return newToken(sym.BOOLEAN);
          }
        case 63: break;
        case 32: 
          { return newToken(sym.TYPE);
          }
        case 64: break;
        case 6: 
          { return newToken(sym.OPENPARENTHESIS);
          }
        case 65: break;
        case 28: 
          { return newToken(sym.ELSE);
          }
        case 66: break;
        case 31: 
          { return newToken(sym.THEN);
          }
        case 67: break;
        case 1: 
          { LexicalError error = new LexicalError ("Error lexico: no coincide con ningun patron");
        error.setLine (yyline + 1);
        error.setColumn (yycolumn + 1);
        error.setLexema (yytext ());
        lexicalErrorManager.lexicalError (error);
          }
        case 68: break;
        case 8: 
          { return newToken(sym.COMMA);
          }
        case 69: break;
        case 20: 
          { return newToken(sym.IS);
          }
        case 70: break;
        case 3: 
          { return newToken(sym.IDENTIFIER);
          }
        case 71: break;
        case 43: 
          { return newToken(sym.PROCEDURE);
          }
        case 72: break;
        case 33: 
          { return newToken(sym.FALSE);
          }
        case 73: break;
        case 14: 
          { yybegin(STRING);
          }
        case 74: break;
        case 37: 
          { return newToken(sym.RETURN);
          }
        case 75: break;
        case 36: 
          { return newToken(sym.RECORD);
          }
        case 76: break;
        case 9: 
          { return newToken(sym.SEMICOLON);
          }
        case 77: break;
        case 41: 
          { return newToken(sym.CONSTANT);
          }
        case 78: break;
        case 12: 
          { return newToken(sym.DOT);
          }
        case 79: break;
        case 40: 
          { return newToken(sym.FUNCTION);
          }
        case 80: break;
        case 23: 
          { return newToken(sym.ASSIGNMENT);
          }
        case 81: break;
        case 17: 
          { yybegin(YYINITIAL);
		//No se crea otra funcion para este token para evitar la sobrecarga al usarla solo una vez
		int column = yycolumn - string.toString().length();
			Token token = new Token (sym.STRING);
			token.setLine (yyline + 1);
			token.setColumn (yycolumn + 1);
			token.setLexema (string.toString());
			return token;
          }
        case 82: break;
        case 26: 
          { return newToken(sym.END);
          }
        case 83: break;
        case 34: 
          { return newToken(sym.BEGIN);
          }
        case 84: break;
        case 15: 
          { string.append( yytext() );
          }
        case 85: break;
        case 2: 
          { 
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
