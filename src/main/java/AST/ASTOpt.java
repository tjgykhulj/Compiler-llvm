package AST;

import org.llvm.BasicBlock;

/* Generated By:JJTree: Do not edit this line. ASTOpt.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTOpt extends SimpleNode {
  public ASTOpt(int id) {
    super(id);
  }

  public ASTOpt(MyLang p, int id) {
    super(p, id);
  }

  public ASTContent code_gen(ASTContext context) throws Exception{
	  return new ASTContent(null, OPT);
  }
}
/* JavaCC - OriginalChecksum=03be40cddeaa301a12201b2f07e39cc5 (do not edit this line) */
