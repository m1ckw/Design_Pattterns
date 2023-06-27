package designpattterns.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("apples");
        editor.setFontSize(10);
        history.push(editor.createState());

        editor.setContent("bananas");
        editor.setFontName("Font 1");
        history.push(editor.createState());

        editor.setContent("pears");
        editor.setFontSize(12);

        System.out.println(editor);
        editor.restore(history.pop());
        System.out.println(editor);
        editor.restore(history.pop());
        System.out.println(editor);
        System.out.println("\n");
    }
}
