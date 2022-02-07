package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Work3 {
    void start(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] vowels = new int[10];
        int count = 0;
        ArrayList<StringBuilder> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case 'а':
                case 'А':
                    vowels[0]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'е':
                case 'Е':
                    vowels[1]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'ё':
                case 'Ё':
                    vowels[2]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'и':
                case 'И':
                    vowels[3]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'о':
                case 'О':
                    vowels[4]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'у':
                case 'У':
                    vowels[5]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'ы':
                case 'Ы':
                    vowels[6]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'э':
                case 'Э':
                    vowels[7]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'ю':
                case 'Ю':
                    vowels[8]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case 'я':
                case 'Я':
                    vowels[9]++;
                    count++;
                    word.append(line.charAt(i));
                    break;
                case ' ':
                    words.add(word);
                    word = new StringBuilder();
                    count = 0;
                    break;
                default:
                    word.append(line.charAt(i));
            }
        }
        words.add(word);
        sort(words);
        for(StringBuilder w:words)
            Capital(w);
        for (StringBuilder w:words){
            System.out.println(w);
        }
    }

    void sort(ArrayList<StringBuilder> words){
        for (int i = 0; i < words.size()-1; i++){
            for (int j = i+1; j < words.size(); j++){
                if (CountOfVowels(words.get(i)) < CountOfVowels(words.get(j))) {
                    StringBuilder t = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, t);
                }
            }
        }
    }

    int CountOfVowels(StringBuilder word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'а': case 'А': case 'е': case 'Е': case 'ё': case 'Ё':
                case 'и': case 'И': case 'о': case 'О': case 'у': case 'У':
                case 'ы': case 'Ы': case 'э': case 'Э': case 'ю': case 'Ю':
                case 'я': case 'Я':
                    count++;
            }
        }
        return count;
    }

    void Capital(StringBuilder word){
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'а':
                    word.setCharAt(i, 'A');
                    return;
                case 'е':
                    word.setCharAt(i, 'Е');
                    return;
                case 'ё':
                    word.setCharAt(i, 'Ё');
                    return;
                case 'и':
                    word.setCharAt(i, 'И');
                    return;
                case 'о':
                    word.setCharAt(i, 'О');
                    return;
                case 'у':
                    word.setCharAt(i, 'У');
                    return;
                case 'ы':
                    word.setCharAt(i, 'Ы');
                    return;
                case 'э':
                    word.setCharAt(i, 'Э');
                    return;
                case 'ю':
                    word.setCharAt(i, 'Ю');
                    return;
                case 'я':
                    word.setCharAt(i, 'Я');
                    return;
                case 'А':
                case 'Е':
                case 'Ё':
                case 'И':
                case 'О':
                case 'У':
                case 'Ы':
                case 'Э':
                case 'Ю':
                case 'Я':
                    return;
            }
        }
    }
}
