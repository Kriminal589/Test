package com.company;

import java.util.Scanner;

public class Work4 {
    void start(){
        char[][] number1 = new char[7][4];
        number1[0][3]=number1[1][3]=number1[2][3]=number1[3][3]=number1[4][3]=number1[5][3]=number1[6][3]='*';
        number1[1][2]=number1[2][1]=number1[3][0]='*';

        char[][] number2 = new char[7][5];
        number2[0][1]=number2[0][2]=number2[0][3]=number2[1][0]=number2[1][4]=number2[2][4]=number2[3][4]='*';
        number2[4][3]=number2[5][2]=number2[6][0]=number2[6][1]=number2[6][2]=number2[6][3]=number2[6][4]='*';

        char[][] number3 = new char[7][5];
        number3[0][1]=number3[0][2]=number3[0][3]=number3[1][0]=number3[1][4]=number3[2][4]=number3[3][2]='*';
        number3[4][4]=number3[5][4]=number3[5][0]=number3[6][1]=number3[6][2]=number3[6][3]='*';

        char[][] number4 = new char[7][5];
        number4[0][3]=number4[1][3]=number4[2][3]=number4[3][3]=number4[4][3]=number4[5][3]=number4[6][3]='*';
        number4[1][2]=number4[2][1]=number4[3][0]=number4[3][1]=number4[3][2]=number4[3][4]='*';

        char[][] number5 = new char[7][5];
        number5[0][0]=number5[0][1]=number5[0][2]=number5[0][3]=number5[0][4]=number5[1][0]=number5[2][0]='*';
        number5[2][1]=number5[2][2]=number5[2][3]=number5[3][4]=number5[4][4]=number5[5][4]='*';
        number5[6][1]=number5[6][2]=number5[6][3]=number5[6][0]='*';

        char[][] number6 = new char[7][6];
        number6[0][1]=number6[0][2]=number6[0][3]=number6[0][4]=number6[1][0]=number6[2][0]='*';
        number6[2][1]=number6[2][2]=number6[2][3]=number6[2][4]=number6[3][5]=number6[4][5]=number6[5][5]='*';
        number6[6][1]=number6[6][2]=number6[6][3]=number6[6][4]='*';
        number6[3][0]=number6[4][0]=number6[5][0]='*';

        char[][] number7 = new char[7][7];
        number7[0][0]=number7[0][1]=number7[0][2]=number7[0][3]=number7[0][4]=number7[0][5]=number7[0][6]='*';
        number7[1][5]=number7[2][4]=number7[3][3]=number7[4][2]=number7[5][1]=number7[6][0]='*';

        char[][] number8 = new char[7][5];
        number8[0][1]=number8[0][2]=number8[0][3]=number8[1][0]=number8[1][4]=number8[2][4]=number8[3][2]='*';
        number8[4][4]=number8[5][4]=number8[5][0]=number8[6][1]=number8[6][2]=number8[6][3]='*';
        number8[2][0]=number8[3][1]=number8[3][3]=number8[4][0]='*';

        char[][] number9 = new char[7][5];
        number9[0][1]=number9[0][2]=number9[0][3]=number9[1][0]=number9[1][4]=number9[2][4]=number9[3][2]='*';
        number9[4][4]=number9[5][3]=number9[6][1]=number9[2][0]='*';
        number9[3][4]=number9[3][3]=number9[3][1]='*';

        char[][] number0 = new char[7][5];
        number0[0][1]=number0[0][2]=number0[0][3]=number0[6][1]=number0[6][2]=number0[6][3]='*';
        number0[1][0]=number0[2][0]=number0[3][0]=number0[4][0]=number0[5][0]=number0[1][4]=number0[2][4]=number0[3][4]=number0[4][4]=number0[5][4]='*';

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < number.length(); j++){
                if (number.charAt(j) == '0'){
                    for (int f = 0; f < 5; f++) {
                        if (number0[i][f] == '*')
                            System.out.print(number0[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '1'){
                    for (int f = 0; f < 4; f++){
                        if (number1[i][f] == '*')
                            System.out.print(number1[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '2'){
                    for (int f = 0; f < 5; f++){
                        if (number2[i][f] == '*')
                            System.out.print(number2[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '3'){
                    for (int f = 0; f < 5; f++){
                        if (number3[i][f] == '*')
                            System.out.print(number3[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '4'){
                    for (int f = 0; f < 5; f++){
                        if (number4[i][f] == '*')
                            System.out.print(number4[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '5'){
                    for (int f = 0; f < 5; f++){
                        if (number5[i][f] == '*')
                            System.out.print(number5[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '6'){
                    for (int f = 0; f < 6; f++){
                        if (number6[i][f] == '*')
                            System.out.print(number6[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '7'){
                    for (int f = 0; f < 7; f++){
                        if (number7[i][f] == '*')
                            System.out.print(number7[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '8'){
                    for (int f = 0; f < 5; f++){
                        if (number8[i][f] == '*')
                            System.out.print(number8[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                if (number.charAt(j) == '9'){
                    for (int f = 0; f < 5; f++){
                        if (number9[i][f] == '*')
                            System.out.print(number9[i][f]);
                        else
                            System.out.print(" ");
                    }
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
