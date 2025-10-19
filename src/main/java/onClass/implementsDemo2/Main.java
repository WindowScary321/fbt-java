package onClass.implementsDemo2;

public class Main {
    public static void main (String[] args){
        String demoSentence = "sẽ gầy.";
        String demoParagraph = "XIn chào thế giới. \n Và mẹ mày béo.";

        TextTool processParagraph = new ParagraphTool();
        TextTool processSentence  = new SentenceTool();

        processSentence.display(demoSentence);
        System.out.println();
        processParagraph.display(demoParagraph);
    }
}
