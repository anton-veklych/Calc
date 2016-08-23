package com.springapp.mvc;


/*Клас производит основные математические вычисления*/
public class Calc {

    /*Функция для вычисления принимает параметр типа String формата "10|+|15|+|10", знак "|"
    служит как разделитель числа и мат. операции.
    Функция возвращает результат вычисления типа Float*/
    public Float getResult(String text){
        String[] numbers = text.split("\\|");
        Float result = Float.parseFloat(numbers[0]);

        for(int i=1; i<numbers.length; i++){
            /*В блоке try-catch проверяется формат переменной String text если формат не правельный
             * возвращается "0" */
            try{
           switch (numbers[i].charAt(0)) {
               case '+':
                   result = result + Float.parseFloat(numbers[i + 1]);
                   break;
               case '-':
                   result = result - Float.parseFloat(numbers[i + 1]);
                   break;
               case '*':
                   result = result * Float.parseFloat(numbers[i + 1]);
                   break;
               case '/':
                   result = result / Float.parseFloat(numbers[i + 1]);
           }
           } catch (Exception e){
               result = Float.parseFloat("0");
                return result;
            }
        }
        return result;
    }

}
