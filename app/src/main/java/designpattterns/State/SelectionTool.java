package designpattterns.State;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("\nSelection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
