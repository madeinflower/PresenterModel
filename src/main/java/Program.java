//#### 6. Класс `Program`
//        Создать класс `Program` с методом `main`, который:
//        - Создаёт экземпляры `SumModel` и `View`.
//        - Создаёт экземпляр `Presenter`.
//        - Вызывает метод `buttonClick()` несколько раз для демонстрации работы системы.

public class Program {
    public static void main(String[] args) {
        SumModel sumModel = new SumModel();
        View view = new View();
        Presenter presenter = new Presenter(sumModel, view);

        // Демонстрация работы системы
        for (int i = 0; i < 3; i++) {
            presenter.buttonClick();
        }
    }
}
