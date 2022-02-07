package com.company;

import java.util.Scanner;

public class Work2 {
    void start(){
        try{
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(1 + " ");
            fuct(num, 2);
        }catch (Exception e){
            System.out.println("Введенное число некоректно");
        }
    }

    void fuct(int num, int fuct){
        if (fuct > num)
            return;
        if (num % fuct == 0)
        {
            System.out.println(fuct + " ");
            while(num % fuct == 0)
                num = num / fuct;

        }
        fuct(num,fuct+1);
    }
}
