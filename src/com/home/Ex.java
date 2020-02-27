package com.home;

import java.io.*;

import static java.lang.System.*;

public class Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // создаем поток ввода с консоли
while (true) {// бесконечный цикл

    out.print("строка" + '>' + " ");
    String y = in.readLine(); // чтение строк
    if ((y == null) || y.equals("quit"))
        break;


    out.print("число 1" + '>' + " ");
    String x = in.readLine(); // чтение строк
    if ((x == null) || x.equals("quit"))
        break;
    Integer i = Integer.parseInt(x);

    out.print("число 2" + '>' + " ");
    String z = in.readLine(); // чтение строк
    if ((z == null) || z.equals("quit"))
        break;
    Integer j = Integer.parseInt(z);






   StringBuffer sb = new StringBuffer(y); // промежуточный объект для хранение стринг)

    String v = sb.substring(i,j);
        out.println("подстрока" + " " +v);
    }
    }
}

