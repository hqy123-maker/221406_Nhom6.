package ui;

import boundary.InputBoundary;
import data.RequestData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UIConsoleInput {
    private final InputBoundary inputBoundary;

    public UIConsoleInput(InputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    public void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number 1: ");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.print("Enter number 2: ");
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println("Select operation: ");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.print("Enter your choice (1-3): ");
        int choice = Integer.parseInt(reader.readLine());

        RequestData requestData = new RequestData(number1, number2, choice);
        inputBoundary.execute(requestData);
    }
}
