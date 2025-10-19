package onClass.implementsDemo2;

class ParagraphTool implements TextTool {


    @Override
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public void display(String text) {
        int wordCount = countWords(text);
        String reversed = reverseText(text);

        System.out.println("Text gốc: \n\"" + text + "\"");
        System.out.println("Số từ: " + wordCount);
        System.out.println("Đảo ngược: \"" + reversed + "\"");
    }
}