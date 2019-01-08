/* The following code was generated by JFlex 1.7.0 */

package syntax;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>spec/minijava1.jflex</tt>
 */
class Yylex extends sym implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\13\1\1\1\3\1\2\1\2\1\4\16\13\4\0\1\1\1\46"+
    "\2\0\1\12\1\0\1\50\1\0\1\56\1\57\1\7\1\44\1\52"+
    "\1\45\1\51\1\5\1\10\11\11\1\0\1\53\1\47\1\43\3\0"+
    "\22\12\1\36\7\12\1\60\1\0\1\61\1\0\1\12\1\0\1\21"+
    "\1\24\1\27\1\31\1\17\1\20\1\37\1\41\1\32\2\12\1\22"+
    "\1\33\1\26\1\25\1\35\1\12\1\15\1\23\1\14\1\16\1\42"+
    "\1\34\1\30\1\40\1\12\1\54\1\0\1\55\1\0\6\13\1\6"+
    "\32\13\2\0\4\12\4\0\1\12\2\0\1\13\7\0\1\12\4\0"+
    "\1\12\5\0\27\12\1\0\37\12\1\0\u01ca\12\4\0\14\12\16\0"+
    "\5\12\7\0\1\12\1\0\1\12\21\0\160\13\5\12\1\0\2\12"+
    "\2\0\4\12\1\0\1\12\6\0\1\12\1\0\3\12\1\0\1\12"+
    "\1\0\24\12\1\0\123\12\1\0\213\12\1\0\5\13\2\0\246\12"+
    "\1\0\46\12\2\0\1\12\7\0\47\12\7\0\1\12\1\0\55\13"+
    "\1\0\1\13\1\0\2\13\1\0\2\13\1\0\1\13\10\0\33\12"+
    "\5\0\3\12\15\0\6\13\5\0\1\12\4\0\13\13\1\0\1\13"+
    "\3\0\53\12\37\13\4\0\2\12\1\13\143\12\1\0\1\12\10\13"+
    "\1\0\6\13\2\12\2\13\1\0\4\13\2\12\12\13\3\12\2\0"+
    "\1\12\17\0\1\13\1\12\1\13\36\12\33\13\2\0\131\12\13\13"+
    "\1\12\16\0\12\13\41\12\11\13\2\12\4\0\1\12\5\0\26\12"+
    "\4\13\1\12\11\13\1\12\3\13\1\12\5\13\22\0\31\12\3\13"+
    "\4\0\13\12\65\0\25\12\1\0\10\12\26\0\60\13\66\12\3\13"+
    "\1\12\22\13\1\12\7\13\12\12\2\13\2\0\12\13\1\0\20\12"+
    "\3\13\1\0\10\12\2\0\2\12\2\0\26\12\1\0\7\12\1\0"+
    "\1\12\3\0\4\12\2\0\1\13\1\12\7\13\2\0\2\13\2\0"+
    "\3\13\1\12\10\0\1\13\4\0\2\12\1\0\3\12\2\13\2\0"+
    "\12\13\4\12\7\0\2\12\4\0\3\13\1\0\6\12\4\0\2\12"+
    "\2\0\26\12\1\0\7\12\1\0\2\12\1\0\2\12\1\0\2\12"+
    "\2\0\1\13\1\0\5\13\4\0\2\13\2\0\3\13\3\0\1\13"+
    "\7\0\4\12\1\0\1\12\7\0\14\13\3\12\1\13\13\0\3\13"+
    "\1\0\11\12\1\0\3\12\1\0\26\12\1\0\7\12\1\0\2\12"+
    "\1\0\5\12\2\0\1\13\1\12\10\13\1\0\3\13\1\0\3\13"+
    "\2\0\1\12\17\0\2\12\2\13\2\0\12\13\1\0\1\12\7\0"+
    "\1\12\6\13\1\0\3\13\1\0\10\12\2\0\2\12\2\0\26\12"+
    "\1\0\7\12\1\0\2\12\1\0\5\12\2\0\1\13\1\12\7\13"+
    "\2\0\2\13\2\0\3\13\10\0\2\13\4\0\2\12\1\0\3\12"+
    "\2\13\2\0\12\13\1\0\1\12\20\0\1\13\1\12\1\0\6\12"+
    "\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12"+
    "\3\0\2\12\3\0\3\12\3\0\14\12\4\0\5\13\3\0\3\13"+
    "\1\0\4\13\2\0\1\12\6\0\1\13\16\0\12\13\11\0\1\12"+
    "\6\0\4\13\1\0\10\12\1\0\3\12\1\0\27\12\1\0\20\12"+
    "\3\0\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\1\0"+
    "\3\12\5\0\2\12\2\13\2\0\12\13\20\0\1\12\3\13\1\0"+
    "\10\12\1\0\3\12\1\0\27\12\1\0\12\12\1\0\5\12\2\0"+
    "\1\13\1\12\7\13\1\0\3\13\1\0\4\13\7\0\2\13\7\0"+
    "\1\12\1\0\2\12\2\13\2\0\12\13\1\0\2\12\15\0\4\13"+
    "\1\0\10\12\1\0\3\12\1\0\51\12\2\13\1\12\7\13\1\0"+
    "\3\13\1\0\4\13\1\12\5\0\3\12\1\13\7\0\3\12\2\13"+
    "\2\0\12\13\12\0\6\12\2\0\2\13\1\0\22\12\3\0\30\12"+
    "\1\0\11\12\1\0\1\12\2\0\7\12\3\0\1\13\4\0\6\13"+
    "\1\0\1\13\1\0\10\13\6\0\12\13\2\0\2\13\15\0\60\12"+
    "\1\13\2\12\7\13\4\0\10\12\10\13\1\0\12\13\47\0\2\12"+
    "\1\0\1\12\2\0\2\12\1\0\1\12\2\0\1\12\6\0\4\12"+
    "\1\0\7\12\1\0\3\12\1\0\1\12\1\0\1\12\2\0\2\12"+
    "\1\0\4\12\1\13\2\12\6\13\1\0\2\13\1\12\2\0\5\12"+
    "\1\0\1\12\1\0\6\13\2\0\12\13\2\0\4\12\40\0\1\12"+
    "\27\0\2\13\6\0\12\13\13\0\1\13\1\0\1\13\1\0\1\13"+
    "\4\0\2\13\10\12\1\0\44\12\4\0\24\13\1\0\2\13\5\12"+
    "\13\13\1\0\44\13\11\0\1\13\71\0\53\12\24\13\1\12\12\13"+
    "\6\0\6\12\4\13\4\12\3\13\1\12\3\13\2\12\7\13\3\12"+
    "\4\13\15\12\14\13\1\12\17\13\2\0\46\12\1\0\1\12\5\0"+
    "\1\12\2\0\53\12\1\0\u014d\12\1\0\4\12\2\0\7\12\1\0"+
    "\1\12\1\0\4\12\2\0\51\12\1\0\4\12\2\0\41\12\1\0"+
    "\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\17\12\1\0"+
    "\71\12\1\0\4\12\2\0\103\12\2\0\3\13\40\0\20\12\20\0"+
    "\126\12\2\0\6\12\3\0\u026c\12\2\0\21\12\1\0\32\12\5\0"+
    "\113\12\3\0\13\12\7\0\15\12\1\0\4\12\3\13\13\0\22\12"+
    "\3\13\13\0\22\12\2\13\14\0\15\12\1\0\3\12\1\0\2\13"+
    "\14\0\64\12\40\13\3\0\1\12\3\0\2\12\1\13\2\0\12\13"+
    "\41\0\4\13\1\0\12\13\6\0\130\12\10\0\5\12\2\13\42\12"+
    "\1\13\1\12\5\0\106\12\12\0\37\12\1\0\14\13\4\0\14\13"+
    "\12\0\12\13\36\12\2\0\5\12\13\0\54\12\4\0\32\12\6\0"+
    "\12\13\46\0\27\12\5\13\4\0\65\12\12\13\1\0\35\13\2\0"+
    "\13\13\6\0\12\13\15\0\1\12\10\0\16\13\102\0\5\13\57\12"+
    "\21\13\7\12\4\0\12\13\21\0\11\13\14\0\3\13\36\12\15\13"+
    "\2\12\12\13\54\12\16\13\14\0\44\12\24\13\10\0\12\13\3\0"+
    "\3\12\12\13\44\12\2\0\11\12\107\0\3\13\1\0\25\13\4\12"+
    "\1\13\4\12\3\13\2\12\3\13\6\0\300\12\72\13\1\0\5\13"+
    "\u0116\12\2\0\6\12\2\0\46\12\2\0\6\12\2\0\10\12\1\0"+
    "\1\12\1\0\1\12\1\0\1\12\1\0\37\12\2\0\65\12\1\0"+
    "\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4\12\2\0"+
    "\6\12\4\0\15\12\5\0\3\12\1\0\7\12\16\0\5\13\30\0"+
    "\1\2\1\2\5\13\20\0\2\12\23\0\1\12\13\0\5\13\1\0"+
    "\12\13\1\0\1\12\15\0\1\12\20\0\15\12\3\0\40\12\20\0"+
    "\15\13\4\0\1\13\3\0\14\13\21\0\1\12\4\0\1\12\2\0"+
    "\12\12\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0"+
    "\1\12\1\0\4\12\1\0\13\12\2\0\4\12\5\0\5\12\4\0"+
    "\1\12\21\0\51\12\u0a77\0\57\12\1\0\57\12\1\0\205\12\6\0"+
    "\4\12\3\13\2\12\14\0\46\12\1\0\1\12\5\0\1\12\2\0"+
    "\70\12\7\0\1\12\17\0\1\13\27\12\11\0\7\12\1\0\7\12"+
    "\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12\1\0\7\12"+
    "\1\0\7\12\1\0\40\13\57\0\1\12\u01d5\0\3\12\31\0\11\12"+
    "\6\13\1\0\5\12\2\0\5\12\4\0\126\12\2\0\2\13\2\0"+
    "\3\12\1\0\132\12\1\0\4\12\5\0\52\12\2\0\136\12\21\0"+
    "\33\12\65\0\20\12\u0200\0\u19b6\12\112\0\u51eb\12\25\0\u048d\12\103\0"+
    "\56\12\2\0\u010d\12\3\0\20\12\12\13\2\12\24\0\57\12\1\13"+
    "\4\0\12\13\1\0\37\12\2\13\120\12\2\13\45\0\11\12\2\0"+
    "\147\12\2\0\44\12\1\0\10\12\77\0\13\12\1\13\3\12\1\13"+
    "\4\12\1\13\27\12\5\13\20\0\1\12\7\0\64\12\14\0\2\13"+
    "\62\12\22\13\12\0\12\13\6\0\22\13\6\12\3\0\1\12\1\0"+
    "\1\12\2\0\12\13\34\12\10\13\2\0\27\12\15\13\14\0\35\12"+
    "\3\0\4\13\57\12\16\13\16\0\1\12\12\13\6\0\5\12\1\13"+
    "\12\12\12\13\5\12\1\0\51\12\16\13\11\0\3\12\1\13\10\12"+
    "\2\13\2\0\12\13\6\0\27\12\3\0\1\12\3\13\62\12\1\13"+
    "\1\12\3\13\2\12\2\13\5\12\2\13\1\12\1\13\1\12\30\0"+
    "\3\12\2\0\13\12\5\13\2\0\3\12\2\13\12\0\6\12\2\0"+
    "\6\12\2\0\6\12\11\0\7\12\1\0\7\12\1\0\53\12\1\0"+
    "\12\12\12\0\163\12\10\13\1\0\2\13\2\0\12\13\6\0\u2ba4\12"+
    "\14\0\27\12\4\0\61\12\u2104\0\u016e\12\2\0\152\12\46\0\7\12"+
    "\14\0\5\12\5\0\1\12\1\13\12\12\1\0\15\12\1\0\5\12"+
    "\1\0\1\12\1\0\2\12\1\0\2\12\1\0\154\12\41\0\u016b\12"+
    "\22\0\100\12\2\0\66\12\50\0\15\12\3\0\20\13\20\0\20\13"+
    "\3\0\2\12\30\0\3\12\31\0\1\12\6\0\5\12\1\0\207\12"+
    "\2\0\1\13\4\0\1\12\13\0\12\13\7\0\32\12\4\0\1\12"+
    "\1\0\32\12\13\0\131\12\3\0\6\12\2\0\6\12\2\0\6\12"+
    "\2\0\3\12\3\0\2\12\3\0\2\12\22\0\3\13\4\0\14\12"+
    "\1\0\32\12\1\0\23\12\1\0\2\12\1\0\17\12\2\0\16\12"+
    "\42\0\173\12\105\0\65\12\210\0\1\13\202\0\35\12\3\0\61\12"+
    "\17\0\1\13\37\0\40\12\15\0\36\12\5\0\46\12\5\13\5\0"+
    "\36\12\2\0\44\12\4\0\10\12\1\0\5\12\52\0\236\12\2\0"+
    "\12\13\6\0\44\12\4\0\44\12\4\0\50\12\10\0\64\12\234\0"+
    "\u0137\12\11\0\26\12\12\0\10\12\230\0\6\12\2\0\1\12\1\0"+
    "\54\12\1\0\2\12\3\0\1\12\2\0\27\12\12\0\27\12\11\0"+
    "\37\12\101\0\23\12\1\0\2\12\12\0\26\12\12\0\32\12\106\0"+
    "\70\12\6\0\2\12\100\0\1\12\3\13\1\0\2\13\5\0\4\13"+
    "\4\12\1\0\3\12\1\0\33\12\4\0\3\13\4\0\1\13\40\0"+
    "\35\12\3\0\35\12\43\0\10\12\1\0\34\12\2\13\31\0\66\12"+
    "\12\0\26\12\12\0\23\12\15\0\22\12\156\0\111\12\67\0\63\12"+
    "\15\0\63\12\u030d\0\3\13\65\12\17\13\37\0\12\13\17\0\4\13"+
    "\55\12\13\13\2\0\1\13\22\0\31\12\7\0\12\13\6\0\3\13"+
    "\44\12\16\13\1\0\12\13\20\0\43\12\1\13\2\0\1\12\11\0"+
    "\3\13\60\12\16\13\4\12\5\0\3\13\3\0\12\13\1\12\1\0"+
    "\1\12\43\0\22\12\1\0\31\12\14\13\6\0\1\13\101\0\7\12"+
    "\1\0\1\12\1\0\4\12\1\0\17\12\1\0\12\12\7\0\57\12"+
    "\14\13\5\0\12\13\6\0\4\13\1\0\10\12\2\0\2\12\2\0"+
    "\26\12\1\0\7\12\1\0\2\12\1\0\5\12\2\0\1\13\1\12"+
    "\7\13\2\0\2\13\2\0\3\13\2\0\1\12\6\0\1\13\5\0"+
    "\5\12\2\13\2\0\7\13\3\0\5\13\213\0\65\12\22\13\4\12"+
    "\5\0\12\13\46\0\60\12\24\13\2\12\1\0\1\12\10\0\12\13"+
    "\246\0\57\12\7\13\2\0\11\13\27\0\4\12\2\13\42\0\60\12"+
    "\21\13\3\0\1\12\13\0\12\13\46\0\53\12\15\13\10\0\12\13"+
    "\66\0\32\12\3\0\17\13\4\0\12\13\u0166\0\100\12\12\13\25\0"+
    "\1\12\u0100\0\1\12\12\13\50\12\7\13\1\12\4\13\10\0\1\13"+
    "\10\0\1\12\13\13\50\12\2\0\4\12\20\13\46\0\71\12\u0107\0"+
    "\11\12\1\0\45\12\10\13\1\0\10\13\1\12\17\0\12\13\30\0"+
    "\36\12\2\0\26\13\1\0\16\13\111\0\7\12\1\0\2\12\1\0"+
    "\46\12\6\13\3\0\1\13\1\0\2\13\1\0\7\13\1\12\1\13"+
    "\10\0\12\13\u02a6\0\u039a\12\146\0\157\12\21\0\304\12\u0abc\0\u042f\12"+
    "\u0fd1\0\u0247\12\u21b9\0\u0239\12\7\0\37\12\1\0\12\13\146\0\36\12"+
    "\2\0\5\13\13\0\60\12\7\13\11\0\4\12\14\0\12\13\11\0"+
    "\25\12\5\0\23\12\u0370\0\105\12\13\0\1\12\56\13\20\0\4\13"+
    "\15\12\100\0\2\12\36\0\u17ed\12\23\0\u02f3\12\u250d\0\u011f\12\121\0"+
    "\u018c\12\u0904\0\153\12\5\0\15\12\3\0\11\12\7\0\12\12\3\0"+
    "\2\13\1\0\4\13\u14c1\0\5\13\3\0\26\13\2\0\7\13\36\0"+
    "\4\13\224\0\3\13\u01bb\0\125\12\1\0\107\12\1\0\2\12\2\0"+
    "\1\12\2\0\2\12\2\0\4\12\1\0\14\12\1\0\1\12\1\0"+
    "\7\12\1\0\101\12\1\0\4\12\2\0\10\12\1\0\7\12\1\0"+
    "\34\12\1\0\4\12\1\0\5\12\1\0\1\12\3\0\7\12\1\0"+
    "\u0154\12\2\0\31\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0"+
    "\37\12\1\0\31\12\1\0\37\12\1\0\31\12\1\0\37\12\1\0"+
    "\31\12\1\0\10\12\2\0\62\13\u0200\0\67\13\4\0\62\13\10\0"+
    "\1\13\16\0\1\13\26\0\5\13\1\0\17\13\u0550\0\7\13\1\0"+
    "\21\13\2\0\7\13\1\0\2\13\1\0\5\13\u07d5\0\305\12\13\0"+
    "\7\13\51\0\104\12\7\13\5\0\12\13\u04a6\0\4\12\1\0\33\12"+
    "\1\0\2\12\1\0\1\12\2\0\1\12\1\0\12\12\1\0\4\12"+
    "\1\0\1\12\1\0\1\12\6\0\1\12\4\0\1\12\1\0\1\12"+
    "\1\0\1\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0\1\12"+
    "\1\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0\2\12"+
    "\1\0\1\12\2\0\4\12\1\0\7\12\1\0\4\12\1\0\4\12"+
    "\1\0\1\12\1\0\12\12\1\0\21\12\5\0\3\12\1\0\5\12"+
    "\1\0\21\12\u1144\0\ua6d7\12\51\0\u1035\12\13\0\336\12\2\0\u1682\12"+
    "\16\0\u1d31\12\u0c1f\0\u021e\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\13\36\0\140\13\200\0\360\13\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\2\4\21\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\1\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\2\1\0"+
    "\14\5\1\24\10\5\1\25\1\0\11\5\1\26\1\27"+
    "\1\5\1\30\7\5\1\31\1\32\1\5\1\33\5\5"+
    "\1\34\5\5\1\35\5\5\1\36\1\37\4\5\1\40"+
    "\1\5\1\41\1\42\2\5\1\43\1\44\1\45\1\46"+
    "\1\47\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[124];
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
    "\0\0\0\62\0\62\0\144\0\226\0\62\0\62\0\310"+
    "\0\372\0\u012c\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258"+
    "\0\u028a\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8"+
    "\0\u041a\0\62\0\62\0\62\0\62\0\62\0\u044c\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa\0\u05dc"+
    "\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\372\0\u073a"+
    "\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\62"+
    "\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28"+
    "\0\u0a5a\0\u0a8c\0\372\0\372\0\u0abe\0\372\0\u0af0\0\u0b22"+
    "\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\372\0\372\0\u0c4e"+
    "\0\372\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\372\0\u0d7a"+
    "\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\372\0\u0e74\0\u0ea6\0\u0ed8"+
    "\0\u0f0a\0\u0f3c\0\372\0\372\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004"+
    "\0\372\0\u1036\0\372\0\372\0\u1068\0\u109a\0\372\0\372"+
    "\0\372\0\372\0\372\0\372";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[124];
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
    "\1\2\3\3\1\4\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\2\1\12\1\13\1\11\1\14\1\15\1\11"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\11\1\24"+
    "\1\25\1\26\1\27\1\30\3\11\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\65\0\1\3\63\0"+
    "\1\51\1\0\1\52\62\0\2\10\56\0\1\11\1\0"+
    "\33\11\25\0\1\11\1\0\5\11\1\53\23\11\1\54"+
    "\1\11\25\0\1\11\1\0\7\11\1\55\23\11\25\0"+
    "\1\11\1\0\12\11\1\56\5\11\1\57\12\11\25\0"+
    "\1\11\1\0\11\11\1\60\21\11\25\0\1\11\1\0"+
    "\7\11\1\61\23\11\25\0\1\11\1\0\4\11\1\62"+
    "\26\11\25\0\1\11\1\0\15\11\1\63\15\11\25\0"+
    "\1\11\1\0\6\11\1\64\24\11\25\0\1\11\1\0"+
    "\7\11\1\65\23\11\25\0\1\11\1\0\12\11\1\66"+
    "\20\11\25\0\1\11\1\0\10\11\1\67\5\11\1\70"+
    "\14\11\25\0\1\11\1\0\11\11\1\71\21\11\25\0"+
    "\1\11\1\0\31\11\1\72\1\11\25\0\1\11\1\0"+
    "\5\11\1\73\1\74\24\11\25\0\1\11\1\0\4\11"+
    "\1\75\23\11\1\76\2\11\25\0\1\11\1\0\15\11"+
    "\1\77\15\11\67\0\1\100\11\0\2\51\3\0\1\51"+
    "\1\0\53\51\7\52\1\101\52\52\6\0\1\11\1\0"+
    "\6\11\1\102\24\11\25\0\1\11\1\0\22\11\1\103"+
    "\10\11\25\0\1\11\1\0\4\11\1\104\26\11\25\0"+
    "\1\11\1\0\13\11\1\105\17\11\25\0\1\11\1\0"+
    "\4\11\1\106\26\11\25\0\1\11\1\0\12\11\1\107"+
    "\20\11\25\0\1\11\1\0\16\11\1\110\14\11\25\0"+
    "\1\11\1\0\11\11\1\111\21\11\25\0\1\11\1\0"+
    "\15\11\1\112\15\11\25\0\1\11\1\0\4\11\1\113"+
    "\26\11\25\0\1\11\1\0\24\11\1\114\6\11\25\0"+
    "\1\11\1\0\11\11\1\115\21\11\25\0\1\11\1\0"+
    "\4\11\1\116\26\11\25\0\1\11\1\0\22\11\1\117"+
    "\10\11\25\0\1\11\1\0\22\11\1\120\10\11\25\0"+
    "\1\11\1\0\22\11\1\121\10\11\25\0\1\11\1\0"+
    "\14\11\1\122\16\11\25\0\1\11\1\0\5\11\1\123"+
    "\25\11\25\0\1\11\1\0\13\11\1\124\17\11\25\0"+
    "\1\11\1\0\22\11\1\125\10\11\17\0\5\52\1\3"+
    "\1\52\1\101\52\52\6\0\1\11\1\0\7\11\1\126"+
    "\23\11\25\0\1\11\1\0\13\11\1\127\17\11\25\0"+
    "\1\11\1\0\6\11\1\130\24\11\25\0\1\11\1\0"+
    "\7\11\1\131\23\11\25\0\1\11\1\0\7\11\1\132"+
    "\23\11\25\0\1\11\1\0\13\11\1\102\17\11\25\0"+
    "\1\11\1\0\27\11\1\133\3\11\25\0\1\11\1\0"+
    "\4\11\1\134\26\11\25\0\1\11\1\0\12\11\1\135"+
    "\20\11\25\0\1\11\1\0\13\11\1\136\17\11\25\0"+
    "\1\11\1\0\16\11\1\137\14\11\25\0\1\11\1\0"+
    "\12\11\1\140\20\11\25\0\1\11\1\0\16\11\1\141"+
    "\14\11\25\0\1\11\1\0\12\11\1\142\20\11\25\0"+
    "\1\11\1\0\22\11\1\143\10\11\25\0\1\11\1\0"+
    "\4\11\1\144\26\11\25\0\1\11\1\0\21\11\1\145"+
    "\11\11\25\0\1\11\1\0\5\11\1\146\25\11\25\0"+
    "\1\11\1\0\16\11\1\147\14\11\25\0\1\11\1\0"+
    "\4\11\1\150\26\11\25\0\1\11\1\0\22\11\1\151"+
    "\10\11\25\0\1\11\1\0\7\11\1\152\23\11\25\0"+
    "\1\11\1\0\13\11\1\153\17\11\25\0\1\11\1\0"+
    "\7\11\1\154\23\11\25\0\1\11\1\0\4\11\1\155"+
    "\26\11\25\0\1\11\1\0\22\11\1\156\10\11\25\0"+
    "\1\11\1\0\16\11\1\157\14\11\25\0\1\11\1\0"+
    "\7\11\1\160\23\11\25\0\1\11\1\0\16\11\1\161"+
    "\14\11\25\0\1\11\1\0\21\11\1\162\11\11\25\0"+
    "\1\11\1\0\31\11\1\163\1\11\25\0\1\11\1\0"+
    "\17\11\1\164\13\11\25\0\1\11\1\0\11\11\1\165"+
    "\21\11\25\0\1\11\1\0\12\11\1\166\20\11\25\0"+
    "\1\11\1\0\17\11\1\167\13\11\25\0\1\11\1\0"+
    "\27\11\1\170\3\11\25\0\1\11\1\0\23\11\1\171"+
    "\7\11\25\0\1\11\1\0\13\11\1\172\17\11\25\0"+
    "\1\11\1\0\16\11\1\173\14\11\25\0\1\11\1\0"+
    "\16\11\1\174\14\11\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4300];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\2\11\22\1\5\11\1\1\11\11"+
    "\1\1\1\0\25\1\1\11\1\0\73\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[124];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
// Printing helpers 
String WHERE() { return yyline+"/"+yycolumn+"("+yychar+")" ;} 
void ECHO()    { System.out.print( yytext() );}
void ECHO(String categorie) {
   System.out.print(  "[" + categorie + ":" + yytext() + "]" );
}
void WARN(String msg) {
   System.err.println( "< Warning at " + WHERE() + " : " + msg + " >"  );
}

// main() : read stdin or file args[0]
public static void main(String[] args) throws java.io.IOException {
   if (args.length > 0) System.setIn(new java.io.FileInputStream(args[0]));
   Yylex lexer = new Yylex(new java.io.InputStreamReader(System.in));
   while ( ! lexer.zzAtEOF )  lexer.next_token();
}

// Avoid compilation warning "zzAtBOL unused"
void blackhole(){ if (zzAtBOL) return; }
// Add optionnal SymbolFactory in Lexer class
java_cup.runtime.SymbolFactory sf;
public Yylex(java.io.Reader in,java_cup.runtime.SymbolFactory sf)
       { this(in); this.sf = sf; }

// Generate values to be returned by next_token()
////  Symbol TOKEN ( int code , Objext value)  // code from class sym
////  Symbol TOKEN ( int code ) == TOKEN (code , yytext () )
java_cup.runtime.Symbol TOKEN(int code) { return TOKEN(code, yytext()); } 
java_cup.runtime.Symbol TOKEN(int code, Object value){
  if (sf instanceof java_cup.runtime.ComplexSymbolFactory)
    return ((java_cup.runtime.ComplexSymbolFactory)sf).newSymbol(
    	   terminalNames[code],
	   code,
       	   new java_cup.runtime.ComplexSymbolFactory.Location
	       ("", yyline+1, yycolumn+1, yychar),
       	   new java_cup.runtime.ComplexSymbolFactory.Location
	       ("", yyline+1, yycolumn+1+yylength(), yychar+yylength()),
       	   value
	   ) ;
  else // sf = null or sf instanceof DefaultSymbolFactory 
    return new java_cup.runtime.Symbol(code, yychar, yychar+yylength(), value);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 3448) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
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
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
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
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {   return TOKEN(EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { WARN("Unknown char '"+yytext()+"' "); return TOKEN(error);
            } 
            // fall through
          case 41: break;
          case 2: 
            { 
            } 
            // fall through
          case 42: break;
          case 3: 
            { return TOKEN(TIMES);
            } 
            // fall through
          case 43: break;
          case 4: 
            { return TOKEN(LIT_INT,    Integer.parseInt(yytext()));
            } 
            // fall through
          case 44: break;
          case 5: 
            { return TOKEN(IDENTIFIER, new String(yytext())) ;
            } 
            // fall through
          case 45: break;
          case 6: 
            { return TOKEN(ASSIGN);
            } 
            // fall through
          case 46: break;
          case 7: 
            { return TOKEN(PLUS);
            } 
            // fall through
          case 47: break;
          case 8: 
            { return TOKEN(MINUS);
            } 
            // fall through
          case 48: break;
          case 9: 
            { return TOKEN(NOT);
            } 
            // fall through
          case 49: break;
          case 10: 
            { return TOKEN(LESS);
            } 
            // fall through
          case 50: break;
          case 11: 
            { return TOKEN(DOT);
            } 
            // fall through
          case 51: break;
          case 12: 
            { return TOKEN(COMMA);
            } 
            // fall through
          case 52: break;
          case 13: 
            { return TOKEN(SEP);
            } 
            // fall through
          case 53: break;
          case 14: 
            { return TOKEN(LC);
            } 
            // fall through
          case 54: break;
          case 15: 
            { return TOKEN(RC);
            } 
            // fall through
          case 55: break;
          case 16: 
            { return TOKEN(LP);
            } 
            // fall through
          case 56: break;
          case 17: 
            { return TOKEN(RP);
            } 
            // fall through
          case 57: break;
          case 18: 
            { return TOKEN(LB);
            } 
            // fall through
          case 58: break;
          case 19: 
            { return TOKEN(RB);
            } 
            // fall through
          case 59: break;
          case 20: 
            { return TOKEN(IF);
            } 
            // fall through
          case 60: break;
          case 21: 
            { return TOKEN(AND);
            } 
            // fall through
          case 61: break;
          case 22: 
            { return TOKEN(OUT);
            } 
            // fall through
          case 62: break;
          case 23: 
            { return TOKEN(NEW);
            } 
            // fall through
          case 63: break;
          case 24: 
            { return TOKEN(INT);
            } 
            // fall through
          case 64: break;
          case 25: 
            { return TOKEN(LIT_BOOL,   Boolean.parseBoolean(yytext()));
            } 
            // fall through
          case 65: break;
          case 26: 
            { return TOKEN(THIS);
            } 
            // fall through
          case 66: break;
          case 27: 
            { return TOKEN(ELSE);
            } 
            // fall through
          case 67: break;
          case 28: 
            { return TOKEN(MAIN);
            } 
            // fall through
          case 68: break;
          case 29: 
            { return TOKEN(VOID);
            } 
            // fall through
          case 69: break;
          case 30: 
            { return TOKEN(CLASS);
            } 
            // fall through
          case 70: break;
          case 31: 
            { return TOKEN(WHILE);
            } 
            // fall through
          case 71: break;
          case 32: 
            { return TOKEN(RETURN);
            } 
            // fall through
          case 72: break;
          case 33: 
            { return TOKEN(LENGTH);
            } 
            // fall through
          case 73: break;
          case 34: 
            { return TOKEN(STATIC);
            } 
            // fall through
          case 74: break;
          case 35: 
            { return TOKEN(PUBLIC);
            } 
            // fall through
          case 75: break;
          case 36: 
            { return TOKEN(STRING);
            } 
            // fall through
          case 76: break;
          case 37: 
            { return TOKEN(SYSTEM);
            } 
            // fall through
          case 77: break;
          case 38: 
            { return TOKEN(EXTENDS);
            } 
            // fall through
          case 78: break;
          case 39: 
            { return TOKEN(BOOLEAN);
            } 
            // fall through
          case 79: break;
          case 40: 
            { return TOKEN(PRINTLN);
            } 
            // fall through
          case 80: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
