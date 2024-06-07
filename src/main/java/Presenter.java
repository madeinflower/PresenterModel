//#### 5. Класс `Presenter`
//        Создать класс `Presenter` для управления взаимодействием между моделью и представлением:
//        - Конструктор `Presenter(Model m, View v)`: принимает модель и представление.
//        - Метод `void buttonClick()`: получает значения `a` и `b` от пользователя, устанавливает их в модель, вычисляет результат и выводит его на экран.

import Interface.Model;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        int a = view.getValue("Enter value for x");
        int b = view.getValue("Enter value for y");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Result");
    }
}
