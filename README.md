## Тестовое задание от Qoden
### Задача 1. Хэш-таблица
Реализовать хэш-таблицу с функцией хэширования X % N, где X — целое число, помещаемое
в хэш-таблицу, N — целое число, от деления на которое берётся остаток. Коллизии разрешаются с помощью односвязного списка.  
Реализованная программа должна выполнять добавление в хэш-таблицу элементов, заданных во входной последовательности. После ввода всех элементов программа выводит на экран содержимое хэш-таблицы.

Использование реализаций списка из стандартной библиотеки ( list, ArrayList, LinkedList, Hashtable и т. п.) не допускается. В ходе решения должна быть получена своя реализация хэш-таблицы и односвязного списка с указанными интерфейсами.

### Задача 2. Диаграмма частоты слов
Написать генератор диаграммы относительной частоты встречаемости слов в тексте.
Диаграмма должна быть представлена в текстовой форме и иметь следующий формат:


><слово1> <точки, отображающее относительное количество вхождения слова1 в
текст>  
<слово2> <точки, отображающее относительное количество вхождения слова2 в
текст>  
...  
<словоN> <точки, отображающее относительное количество вхождения словаN в текст> 

Столбец слов и точек должен быть разделён одним пробелом.

Столбец слов должен иметь ширину, равную длине самого длинного слова, при этом более короткие слова выравниваются по правому краю (то есть, при выводе перед ними записывается нужное количество знаков подчёркивания (_)).

Столбец точек имеет максимальную ширину в 10 символов. 10 точек соответствуют частоте встречаемости самого частого слова. Частота встречаемости остальных слов считается относительно этого значения. Округление производится по правилам математики, при этом значения вида ЦЕЛОЕ + 0.5 округляются вверх.
Список слов должен быть упорядочен от самого редкого до самого частого.

В тексте гарантированно могут быть только следующие символы: маленькие буквы от a до z, пробел.

### Задача 3. Простейший калькулятор
Написать программу, выполняющую операции над числами. Программа принимает в себя арифметическое выражение в постфиксной нотации: последовательность чисел и операторов действий над двумя последними числами.  

Например, входная последовательность 5 10 + означает: 5 + 10.  
5 10 + 10 * означает (5 + 10) * 10.  
5 10 15 + - означает 5 - (10 + 15).  

Числа во входной последовательности гарантированно целые. Допустимые операторы: + (сложение), - (вычитание), * (умножение), / (деление).

Операторы и числа во входной последовательности отделены друг от друга пробелом.

Входная последовательность операторов и чисел гарантированно даёт целый результат.

### Компиляция и запуск кода 
На примере task1:  
1. Компиляция  
```
javac task1/Solver.java
```
2. Запуск
```
cd task1  
java Solver
   ```
task2 и task3 по аналогии. 
