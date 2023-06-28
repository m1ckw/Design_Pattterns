package designpattterns.State;

public class Demo {
    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("");
    }
}
