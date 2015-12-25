package AST;
import java.util.*;

import org.llvm.*;

public class ASTContext implements MyLangConstants
{
	Map<String, ASTContent> values = new HashMap<String, ASTContent>();
	ASTContext father;
	BasicBlock entry;
	BasicBlock breakBB;
	BasicBlock continueBB;
	ASTContent func;
	boolean isExtending=false;
	
	ASTContext(){}
	ASTContext(ASTContext father, BasicBlock entry, ASTContent func) {
		this.father = father;	
		this.func = func;
		this.entry = entry;
		if (father!=null){
			this.breakBB = father.breakBB;
			this.continueBB = father.continueBB;
		}
	}
	void put(String name, Value value, int type) throws Exception
	{		
		if (values.containsKey(name)) throw new Exception("重复的变量名："+name);
		if (type == FUNCTION) throw new Exception(name+" is a function but not variable.");
		values.put(name, new ASTContent(value, type));
	}
	boolean put(String name, Value value, int type, int info_type)  throws Exception {		
		if (values.containsKey(name)) throw new Exception("重复的变量名："+name);
		values.put(name, new ASTContent(value, type, info_type));
		return true;
	}
	boolean put(String name, Value value, int type, int info_type, Value length)  throws Exception {		
		if (values.containsKey(name)) throw new Exception("重复的变量名："+name);
		values.put(name, new ASTArrayContent(value, type, info_type, length));
		return true;
	}
	
	boolean put(String name, Value value, int retType, List<Integer> types)  throws Exception {			
		if (values.containsKey(name)) 
			if (!isExtending)
				throw new Exception("重复的函数名："+name);
			else
				return true;
		values.put(name, new ASTFuncContent(value, retType, types));
		return true;
	}

	boolean put(String name, SimpleNode sn) throws Exception {
		if (values.containsKey(name))
			throw new Exception("class name duplication: "+name);
		values.put(name, new ASTClassContent(sn));
		return true;
	}
	boolean put(String name, ASTContext context) throws Exception {
		if (values.containsKey(name))
			throw new Exception("variable name duplication: "+name);
		values.put(name, new ASTObjectContent(context));
		return true;
	}
	
	ASTContent get(String name) {
		for (	ASTContext x = this; x != null; x = x.father)
			if (x.values.containsKey(name)) return x.values.get(name);
		return null;
	}
	
	Value f_main() {
		return func.value;
	}
	boolean isMain() {
		if (func==null) return true;
		return f_main().getValueName().equals("main");
	}
}
