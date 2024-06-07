//#### 2. Абстрактный класс `CalcModel`
//        Создать абстрактный класс `CalcModel`, который реализует интерфейс `Model` и содержит поля:
//        - `int x`
//        - `int y`

import Interface.Model;

public abstract class CalcModel implements Model {
    protected int x;
    protected int y;

    @Override
    public void setX(int value) {
        this.x = value;
    }

    @Override
    public void setY(int value) {
        this.y = value;
    }
}

