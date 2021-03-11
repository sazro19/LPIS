import gen.ParserBaseListener;
import gen.ParserLexer;
import gen.ParserParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {
        gen.ParserLexer lexer = new ParserLexer(CharStreams.fromString("class m{}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gen.ParserParser parser = new ParserParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ParseTreeListener() {
            @Override
            public void visitTerminal(TerminalNode terminalNode) {
                System.out.println(terminalNode.getSymbol());
            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println(parserRuleContext.getRuleContext());
            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println("exit");
            }
        };
        walker.walk(listener, tree);
    }
}
