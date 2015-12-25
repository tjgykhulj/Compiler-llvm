package AST;
import org.llvm.*;

/* Generated By:JJTree: Do not edit this line. ASTChar.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTChar extends SimpleNode {
  public ASTChar(int id) {
    super(id);
  }

  public ASTChar(MyLang p, int id) {
    super(p, id);
  }
  
  public String toString() {
	  return "char: " + jjtGetValue().toString();
  }

  public ASTContent code_gen(ASTContext context){
	  int x = Integer.valueOf(jjtGetValue().toString().charAt(1));
	  return new ASTContent(TypeRef.int32Type().constInt(x, true), CHARACTER_LITERAL);
  }
}
/* JavaCC - OriginalChecksum=902cd59bfe65cf3be949fa7725984401 (do not edit this line) */