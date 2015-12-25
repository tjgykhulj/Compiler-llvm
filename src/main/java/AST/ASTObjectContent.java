package AST;

public class ASTObjectContent extends ASTContent {

	ASTContext context;

	public ASTContext getContext(){
		return context;
	}
	
	public ASTObjectContent(ASTContext con){
		this.type = TYPE;
		this.context = con;
		this.info_type = OBJECT;
	}
}