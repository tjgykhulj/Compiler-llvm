package AST;
import org.llvm.Value;

public class ASTNewArrayContent extends ASTContent {
	public int length;
	
	public ASTNewArrayContent(Value value, int type){
		super(value, type);
	}
	
	public ASTNewArrayContent(Value value, int type, int info_type, int length){
		/*value stands for identity's value*/
		/*type must be ArrayType*/
		/*length is array's length, when it is not clarified, it is -1.*/
		super(value, ARRAY);
		this.value = value;
		this.type = ARRAY;
		this.info_type = info_type;
		this.length = length;
	}
}
