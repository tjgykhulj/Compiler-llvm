package AST;
import org.llvm.*;
/* Generated By:JJTree&JavaCC: Do not edit this line. MyLangConstants.java */

/**
 * Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start()
 */
public interface MyLangConstants {
	TypeRef ty_void = TypeRef.voidType();
	TypeRef ty_real = TypeRef.doubleType();
	TypeRef ty_int = TypeRef.int32Type();
	TypeRef ty_bool = TypeRef.int1Type();
	Value RealZero = TypeRef.doubleType().constReal(0);
	Value IntZero = TypeRef.int32Type().constInt(0, true);
	Value BoolZero = TypeRef.int1Type().constInt(0, true);
	/** End of File. */
	int EOF = 0;
	/** RegularExpression Id. */
	int NULL = 6;
	/** RegularExpression Id. */
	int PROGRAM = 7;
	/** RegularExpression Id. */
	int BEGIN = 8;
	/** RegularExpression Id. */
	int END = 9;
	/** RegularExpression Id. */
	int AS = 10;
	/** RegularExpression Id. */
	int DEFINE = 11;
	/** RegularExpression Id. */
	int ENDDEF = 12;
	/** RegularExpression Id. */
	int INT = 13;
	/** RegularExpression Id. */
	int BOOL = 14;
	/** RegularExpression Id. */
	int FLOAT = 15;
	/** RegularExpression Id. */
	int CHAR = 16;
	/** RegularExpression Id. */
	int EXP = 17;
	/** RegularExpression Id. */
	int RETURN = 18;
	/** RegularExpression Id. */
	int SEMICOlON = 19;
	/** RegularExpression Id. */
	int WHILE = 20;
	/** RegularExpression Id. */
	int DO = 21;
	/** RegularExpression Id. */
	int ENDWHILE = 22;
	/** RegularExpression Id. */
	int FOR = 23;
	/** RegularExpression Id. */
	int TO = 24;
	/** RegularExpression Id. */
	int ENDFOR = 25;
	/** RegularExpression Id. */
	int CONTINUE = 26;
	/** RegularExpression Id. */
	int BREAK = 27;
	/** RegularExpression Id. */
	int FOREACH = 28;
	/** RegularExpression Id. */
	int ENDFORE = 29;
	/** RegularExpression Id. */
	int IN = 30;
	/** RegularExpression Id. */
	int IF = 31;
	/** RegularExpression Id. */
	int THEN = 32;
	/** RegularExpression Id. */
	int ENDIF = 33;
	/** RegularExpression Id. */
	int ELSE = 34;
	/** RegularExpression Id. */
	int FUNCTION = 35;
	/** RegularExpression Id. */
	int ENDFUNC = 36;
	/** RegularExpression Id. */
	int IS = 37;
	/** RegularExpression Id. */
	int TYPE = 38;
	/** RegularExpression Id. */
	int ENDTYPE = 39;
	/** RegularExpression Id. */
	int EXTEND = 40;
	/** RegularExpression Id. */
	int NOT = 41;
	/** RegularExpression Id. */
	int THIS = 42;
	/** RegularExpression Id. */
	int AND = 43;
	/** RegularExpression Id. */
	int OR = 44;
	/** RegularExpression Id. */
	int VOID = 45;
	/** RegularExpression Id. */
	int EQUAL = 46;
	/** RegularExpression Id. */
	int INTEGER_LITERAL = 47;
	/** RegularExpression Id. */
	int FLOAT_LITERAL = 48;
	/** RegularExpression Id. */
	int BOOLEAN_LITERAL = 49;
	/** RegularExpression Id. */
	int NULL_LITERAL = 50;
	/** RegularExpression Id. */
	int CHARACTER_LITERAL = 51;
	/** RegularExpression Id. */
	int STRING_LITERAL = 52;
	/** RegularExpression Id. */
	int IDENTIFIER = 53;
	/** RegularExpression Id. */
	int DIGITS = 54;
	/** RegularExpression Id. */
	int LETTER = 55;
	/** RegularExpression Id. */
	int DIGIT = 56;
	int ARRAY = 57;
	int CLASS = 58;
	int OPT = 59;
	int OBJECT = 60;
	/** Lexical state. */
	int DEFAULT = 0;

	/** Literal token values. */
	String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\n\"", "\"\\r\"", "\"\\f\"", "\"null\"", "\"program\"",
			"\"begin\"", "\"end\"", "\"as\"", "\"define\"", "\"end define\"", "\"int\"", "\"bool\"", "\"float\"",
			"\"char\"", "\"exp\"", "\"return\"", "\";\"", "\"while\"", "\"do\"", "\"end while\"", "\"for\"", "\"to\"",
			"\"end for\"", "\"continue\"", "\"break\"", "\"foreach\"", "\"end foreach\"", "\"in\"", "\"if\"",
			"\"then\"", "\"end if\"", "\"else\"", "\"function\"", "\"end function\"", "\"is\"", "\"type\"",
			"\"end type\"", "\"extends\"", "\"not\"", "\"this\"", "\"and\"", "\"or\"", "\"void\"", "\"=\"",
			"<INTEGER_LITERAL>", "<FLOAT_LITERAL>", "<BOOLEAN_LITERAL>", "<NULL_LITERAL>", "<CHARACTER_LITERAL>",
			"<STRING_LITERAL>", "<IDENTIFIER>", "<DIGITS>", "<LETTER>", "<DIGIT>", "\"(\"", "\",\"", "\")\"", "\"[\"",
			"\"]\"", "\"==\"", "\"!=\"", "\"<\"", "\">\"", "\"<=\"", "\">=\"", "\"+\"", "\"-\"", "\"*\"", "\"/\"",
			"\"%\"", "\".\"", };

}