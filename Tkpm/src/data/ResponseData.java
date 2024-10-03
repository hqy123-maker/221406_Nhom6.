package data;

public class ResponseData {
    private int addResult;
    private int subtractResult;
    private int multiplyResult;

    private String message;

    public ResponseData() {
    }

    public ResponseData(String message) {
        this.message = message;
    }

    public void setAddResult(int result) {
        this.addResult = result;
    }

    public void setSubtractResult(int result) {
        this.subtractResult = result;
    }

    public void setMultiplyResult(int result) {
        this.multiplyResult = result;
    }

    public int getAddResult() {
        return addResult;
    }

    public int getSubtractResult() {
        return subtractResult;
    }

    public int getMultiplyResult() {
        return multiplyResult;
    }

    public String getMessage() {
        return message;
    }
}
