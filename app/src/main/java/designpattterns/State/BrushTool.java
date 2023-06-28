package designpattterns.State;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("\nBrush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
