package onClass.implementsDemo2;

public class SentenceTool implements TextTool{

    @Override
    public int countWords(String text) {
        // "text == null": kiểm tra text có rỗng hay ko.
        // "text.trim()" loại bỏ các dấu cách ở đầu và cuối.
        // "isEmpty()" kiểm tra chuỗi sau khi đã loại bỏ khoảng trắng còn rỗng ko.
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // "split()" chia chuỗi cho dễ :v
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
        System.out.println("Text gốc: \"" + text + "\"");
        System.out.println("Số từ: " + wordCount);
        System.out.println("Đảo ngược: \"" + reversed + "\"");
    }
}
