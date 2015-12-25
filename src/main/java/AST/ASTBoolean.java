package AST;
import org.llvm.TypeRef;

/* Generated By:JJTree: Do not edit this line. ASTBoolean.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTBoolean extends SimpleNode {
  public ASTBoolean(int id) {
    super(id);
  }

  public ASTBoolean(MyLang p, int id) {
    super(p, id);
  }
  public String toString() {
	  return "Bool: " + Boolean.valueOf(jjtGetValue().toString());
  }

  public ASTContent code_gen(ASTContext context){
	  boolean flag = Boolean.valueOf(jjtGetValue().toString());
	  int n = 0;
	  if(flag) n = 1;
	  return new ASTContent(TypeRef.int32Type().constInt(n, true),BOOLEAN_LITERAL);
  }
}
/* JavaCC - OriginalChecksum=1fc58b7781fb5e7d8caefebd91a67e44 (do not edit this line) */