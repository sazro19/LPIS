public class ParserVis extends gen.ParserBaseVisitor<String> {

    @Override
    public String visitClassBody(gen.ParserParser.ClassBodyContext context) {
        visitChildren(context);
        System.out.println("");
        return null;
    }

    @Override
    public String visitMethodBody(gen.ParserParser.MethodBodyContext context) {
        System.out.print(context.block().getText());
        return visitChildren(context);
    }
}
