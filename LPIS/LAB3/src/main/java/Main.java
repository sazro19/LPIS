import gen.ParserBaseListener;
import gen.ParserBaseVisitor;
import gen.ParserLexer;
import gen.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {
        gen.ParserLexer lexer = new ParserLexer(CharStreams.fromString("{int a = 5; while(true){}}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gen.ParserParser parser = new ParserParser(tokens);
        ParserVis vis = new ParserVis();
        ParserParser.MethodBodyContext methodBodyContext = parser.methodBody();
        vis.visitMethodBody(methodBodyContext);
    }
}
