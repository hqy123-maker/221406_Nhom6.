package ui;

import boundary.OutputBoundary;
import data.ResponseData;
import java.io.PrintWriter;

public class UIConsoleOutput implements OutputBoundary {
    private final PrintWriter writer = new PrintWriter(System.out, true);

    @Override
    public void present(ResponseData responseData) {
        if (responseData.getMessage() != null) {
            writer.println(responseData.getMessage());
        } else {
            writer.println("Addition Result: " + responseData.getAddResult());
            writer.println("Subtraction Result: " + responseData.getSubtractResult());
            writer.println("Multiplication Result: " + responseData.getMultiplyResult());

        }
    }
}
