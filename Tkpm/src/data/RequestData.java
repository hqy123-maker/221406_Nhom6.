package data;

public class RequestData {
    public int number1;
    public int number2;
    public int operation; // Thêm biến để lưu trữ loại phép toán

    public RequestData(int number1, int number2, int operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }
}
