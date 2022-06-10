package toys;

public interface AbstractFactory<T>  {
    T create(String toyType);
}
