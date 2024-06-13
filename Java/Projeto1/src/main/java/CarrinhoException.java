public class CarrinhoException extends Exception {
    public CarrinhoException(String message) {
        super(message);
    }

    public CarrinhoException(String message, Throwable cause) {
        super(message, cause);
    }
}
