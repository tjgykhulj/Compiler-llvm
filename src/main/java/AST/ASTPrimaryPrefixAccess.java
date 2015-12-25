package AST;
import java.util.ArrayList;
import java.util.List;

import org.llvm.BasicBlock;
import org.llvm.TypeRef;
import org.llvm.Value;

/* Generated By:JJTree: Do not edit this line. ASTPrimaryPrefixAccess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTPrimaryPrefixAccess extends SimpleNode {
	public ASTPrimaryPrefixAccess(int id) {
		super(id);
	}

	public ASTPrimaryPrefixAccess(MyLang p, int id) {
		super(p, id);
	}

	@Override
	public ASTContent code_gen(ASTContext context) throws Exception {
		if (children == null)
			return null;

		int index = 0;
		ASTContext nowcon = context;
		ASTContent current = ((SimpleNode) children[index++]).code_gen(context);;
		while (index < children.length) {
			switch (((SimpleNode) children[index++]).code_gen(context).type) {
			case FUNCTION:
				context = nowcon;
				ASTFuncContent func_c = (ASTFuncContent) current;
				int argsLen = func_c.types.size();				
				if (func_c.types.get(0) != VOID &&					
					argsLen > children.length - index) throw new Exception("[Function Access] : 缺少参数");
				
				Value[] args = new Value[argsLen];
				for (int i = 0; i < argsLen; ++i) 
					if (func_c.types.get(i) == VOID) {
						args[i] = IntZero;
					} else {
						ASTContent x = ((SimpleNode) children[index++]).code_gen(context);
						args[i] = x.castTo(func_c.types.get(i));
					}
				current = new ASTContent(MyLang.builder.buildCall(func_c.value, "ret", args), func_c.retType);
				break;
			case ARRAY:
				ASTArrayContent array_c = (ASTArrayContent) current;
				ASTContent offset = ((SimpleNode)children[index++]).code_gen(context).getPValue();
				Value n1 = ty_int.constInt(0, true);
				Value n2 = offset.value;
				Value[] values = new Value[2];
				values[0] = n1; values[1] = n2;
				Value ptr = MyLang.builder.buildInBoundsGEP(array_c.value, Value.internalize(values), 2, "a1");
				current = new ASTContent(ptr, IDENTIFIER, array_c.info_type);
				break;
			case CLASS:
				ASTObjectContent class_c = (ASTObjectContent) current;
				context = class_c.getContext();
				SimpleNode now = (SimpleNode)children[index];
				current = now.code_gen(context);
				index++;
				break;
			default:
				throw new Exception("Unknown access.");
			}
		}
		return current;			
	}
}
/*
 * JavaCC - OriginalChecksum=6484fce1d65da5bb2f00b804659b209b (do not edit this
 * line)
 */