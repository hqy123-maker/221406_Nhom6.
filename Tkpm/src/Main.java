import boundary.InputBoundary;
import boundary.OutputBoundary;
import controller.CalculatorUseCaseControl;
import entity.AddEntity;
import entity.MultiplyEntity;
import entity.SubtractEntity;
import java.io.IOException;
import ui.UIConsoleInput;
import ui.UIConsoleOutput;

public class Main {
    public static void main(String[] args) {
        AddEntity addEntity = new AddEntity();
        SubtractEntity subtractEntity = new SubtractEntity();
        MultiplyEntity multiplyEntity = new MultiplyEntity();

        OutputBoundary outputBoundary = new UIConsoleOutput();

        InputBoundary inputBoundary = new CalculatorUseCaseControl(
                addEntity, subtractEntity, multiplyEntity, outputBoundary);

        UIConsoleInput consoleInput = new UIConsoleInput(inputBoundary);

        try {
            consoleInput.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}