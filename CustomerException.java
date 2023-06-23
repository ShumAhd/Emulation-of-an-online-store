// Исключение, выбрасываемое при ошибке с покупателем
public class CustomerException extends Exception {
  public CustomerException(String message) {
    super(message);
  }
}


