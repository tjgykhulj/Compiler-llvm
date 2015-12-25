package AST;

public class ASTClassContent extends ASTContent {

	SimpleNode sn;

	public SimpleNode getNode(){
		return sn;
	}
	
	public ASTClassContent(SimpleNode simple){
		this.type = TYPE;
		this.sn = simple;
		this.info_type = CLASS;
	}
}