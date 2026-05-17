package atv06_ExcecaoPersonalizada_NotaInvalidaException;

public class NotaInvalidaException extends RuntimeException {
    public NotaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
