public class NoRegisteredException extends RuntimeException{
    public NoRegisteredException (String playerName){
        super("Игрок с именем" + " не найден");
    }
}
