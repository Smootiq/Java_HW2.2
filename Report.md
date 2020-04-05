# Отчёт о тестировании приложения "Ticket2.0"

## Краткое описание
Проведено тестирование на ПО IntelliJ IDEA Community, для проверки работоспособности кода по расчёту бонусной программы.

## Описание тестов
На ПО IntelliJ IDEA Community, было создано базовое приложение, для тестирования работоспособности кода
> <i> public class HW { <br>
    public static void main(String[] args) { <br>
        boolean action = true; <br>
        int percent; <br>
        if (action) { <br>
            percent = 1; <br>
        } else { <br>
            percent = 0; <br>
        } <br>
        long amount = 1100; <br>
        long balance = 100; <br>
        long bonus = amount * percent / 100; <br>
        long limit = 1000; <br>
        long fix = 0; <br>
        if (amount < limit) { <br>
            bonus = fix; <br>
        } <br>
        long total = bonus + amount + balance; <br>
        System.out.println(bonus); <br>
    } <br>
} </i> <br>

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