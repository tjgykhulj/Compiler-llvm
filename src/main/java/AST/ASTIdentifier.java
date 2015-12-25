package AST;
/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIdentifier extends SimpleNode {
  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(MyLang p, int id) {
    super(p, id);
  }
	
  public ASTContent code_gen(ASTContext context) {
	  String name = jjtGetValue().toString();
	  ASTContent x = context.get(name);
	  return (x != null)? x : new ASTContent(null, IDENTIFIER);
  }
}
/* JavaCC - OriginalChecksum=c0c7bd0653bfd8b3776156193ae4bf38 (do not edit this line) */