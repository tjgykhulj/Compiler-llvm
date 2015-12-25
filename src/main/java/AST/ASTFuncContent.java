package AST;
import java.util.List;

import org.llvm.Value;

public class ASTFuncContent extends ASTContent {

	int retType;
	List<Integer> types;

	public ASTFuncContent(Value value, int type) {
		super(value, type);
		// TODO Auto-generated constructor stub
	}

	public ASTFuncContent(Value value, int retType, List<Integer> types) {
		super(value, FUNCTION);
		// TODO Auto-generated constructor stub
		this.retType = retType;
		this.types = types;
	}
}
