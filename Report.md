# Отчёт о тестировании приложения "Ticket2.0"

## Краткое описание
Проведено тестирование на ПО IntelliJ IDEA Community, для проверки работоспособности кода по расчёту бонусной программы.

## Описание тестов
На ПО IntelliJ IDEA Community, было создано базовое приложение, для тестирования работоспособности кода
```
public class HW {
    public static void main(String[] args) {
        boolean action = true;
        int percent;
        if (action) {
            percent = 1;
        } else {
            percent = 0;
        }
        long amount = 1100;
        long balance = 100;
        long bonus = amount * percent / 100;
        long limit = 1000;
        long fix = 0;
        if (amount < limit) {
            bonus = fix;
        }
        long total = bonus + amount + balance;
        System.out.println(bonus);
    }
}
```

Проводилось позитивное тестирование функционала выполнения заданной операции.

1. Задаём переменную "long amount" любым значением
2. Выполняем команду "Run"
3. Видим результат расчёта, с учётом минимальной суммы для зачисления бонусов

## Результаты
1. 100% успешных тестов
2. Issue: Отсутствуют

## Общие рекомендации
* Задаём переменную "long amount" любым значением и получаем результат
* Есть возможность корректировки баланса, через переменную "long balance"