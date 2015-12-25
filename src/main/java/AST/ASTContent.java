package AST;

import org.llvm.TypeRef;
import org.llvm.Value;

public class ASTContent implements MyLangConstants {
	Value value;
	int type;
	int info_type = 0;
	ASTContext context;

	public ASTContent() {
	}

	public ASTContent(Value value, int type) {
		this.value = value;
		this.type = type;
	}

	public ASTContent(Value value, int type, int info_type) {
		this.value = value;
		this.type = type;
		this.info_type = info_type;
	}

	boolean isBoolean() {
		if (type == BOOLEAN_LITERAL) {
			return true;
		} else
			return false;
	}

	boolean isAbsolutelyInteger() {
		return (type == INTEGER_LITERAL);
	}

	boolean isDouble() {
		return (type == FLOAT_LITERAL);
	}

	boolean isInteger() {
		return (type == INTEGER_LITERAL || type == CHARACTER_LITERAL);
	}

	ASTContent getPValue() {
		if (type == IDENTIFIER)
			return new ASTContent(MyLang.builder.buildLoad(value, "tmp"), info_type);
		else
			return this;
	}

	Value castTo(Integer toType) throws Exception {
		Value tmp = value;
		int srcType = type;
		if (type == IDENTIFIER) {
			tmp = MyLang.builder.buildLoad(value, "tmp");
			srcType = info_type;
		}
		if (srcType == CHARACTER_LITERAL)	srcType = INTEGER_LITERAL;
		if (toType == CHARACTER_LITERAL)	toType = INTEGER_LITERAL;
		if (srcType == toType) return tmp;
		
		if (srcType != FLOAT_LITERAL && toType != FLOAT_LITERAL) {
			if (srcType == BOOLEAN_LITERAL)
				return Value.constIntCast(tmp, TypeRef.int32Type(), true);
			else 
				return Value.constIntCast(tmp, TypeRef.int1Type(), false);
		} else {
			if (toType == INTEGER_LITERAL) return Value.constFPToSI(tmp, ty_int);
			if (srcType == INTEGER_LITERAL)	return Value.constSIToFP(tmp, ty_real);
		}
		throw new Exception("Cast Error " + srcType + " to " + toType);
	}

	static public TypeRef getTypeRef(int type) throws Exception {
		switch (type) {
		case FLOAT_LITERAL:
			return ty_real;
		case BOOLEAN_LITERAL:
			return ty_bool;
		case INTEGER_LITERAL:
		case CHARACTER_LITERAL:
			return ty_int;
		case VOID:
			return TypeRef.voidType();
		default:
			throw new Exception("Unknown Type");
		}
	}

	static public Value getTypeZero(int type) throws Exception {
		switch (type) {
		case FLOAT_LITERAL:
			return RealZero;
		case BOOLEAN_LITERAL:
			return BoolZero;
		case INTEGER_LITERAL:
		case CHARACTER_LITERAL:
			return IntZero;
		default:
			throw new Exception("Unknown Type");
		}
	}
}