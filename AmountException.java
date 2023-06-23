// Исключение, выбрасываемое при ошибке с количеством товара
public class AmountException extends Exception {
  public AmountException(String message) {
    super(message);
  }
}
