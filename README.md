# Задания

## Урок 1. Знакомство с языком программирования Java

  hw_1_1 Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
  
  hw_1_2 Перевернуть слова в строке
  
## Урок 2. Почему вы не можете не использовать API

  hw_2_1 Дана последовательность N целых чисел. Найти сумму простых чисел.
  
  hw_2_2 Дана последовательность N целых чисел. Верно ли, что последовательность является возрастающей.
  
  hw_2_3 Дана последовательность N целых чисел. Найти сумму простых чисел.
  
  hw_2_4 Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
      Пример:
      Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
      Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
      Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
  
  Sudoku Отвалидировать доску судоку
      /Требования
      Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
      1. Каждая строка должна содержать цифру 1-9 без повторения
      2. Каждая колонка должна содержать цифру 1-9 без повторения
      3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
      Ограничения
      • board.length == 9
      • board[i].length == 9
      • board[i][j] значение число или '.'
      */
      public class Main {
      public static void main(String[] args) {
      char[][] board = {
      {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

          System.out.println("Validete:" + isValidSudoku(board));  }

## Урок 3. Коллекции JAVA: Введение

## Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
    hw_4_1 Вывести список на экран в перевернутом виде (без массивов и ArrayList) Пример: 1 -> 2->3->4 Вывод: 4->3->2->1
    hw_4_2 https://leetcode.com/problems/valid-parentheses/

## Урок 5. 
