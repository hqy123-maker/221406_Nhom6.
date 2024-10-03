package controller;

import boundary.InputBoundary;
import boundary.OutputBoundary;
import data.RequestData;
import data.ResponseData;
import entity.AddEntity;
import entity.MultiplyEntity;
import entity.SubtractEntity;

public class CalculatorUseCaseControl implements InputBoundary {
    private final AddEntity addEntity;
    private final SubtractEntity subtractEntity;
    private final MultiplyEntity multiplyEntity;

    private final OutputBoundary outputBoundary;

    public CalculatorUseCaseControl(AddEntity addEntity, SubtractEntity subtractEntity,
            MultiplyEntity multiplyEntity,
            OutputBoundary outputBoundary) {
        this.addEntity = addEntity;
        this.subtractEntity = subtractEntity;
        this.multiplyEntity = multiplyEntity;

        this.outputBoundary = outputBoundary;
    }

    @Override
    public void execute(RequestData requestData) {
        ResponseData responseData = new ResponseData();

        switch (requestData.operation) {
            case 1:
                responseData.setAddResult(addEntity.add(requestData.number1, requestData.number2));
                outputBoundary.present(responseData);
                break;
            case 2:
                responseData.setSubtractResult(subtractEntity.subtract(requestData.number1, requestData.number2));
                outputBoundary.present(responseData);
                break;
            case 3:
                responseData.setMultiplyResult(multiplyEntity.multiply(requestData.number1, requestData.number2));
                outputBoundary.present(responseData);
                break;

            default:
                outputBoundary.present(new ResponseData("Invalid operation"));
        }
    }
}
