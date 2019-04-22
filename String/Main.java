package com.marchello.labs.String;

import java.util.*;

/*
8. Слова текста, начинающиеся с гласных букв, рассортировать в алфавитном
порядке по первой согласной букве слова.
*/

/*
        for (ListIterator<String> iterator = words.listIterator(); iterator.hasNext(); ) {
        if (!startsWithVovel(iterator.next()))
        iterator.remove();
        }
*/

public class Main {
    public static void main(String[] args) {
        String text = "Октябрь. Деревья давно сбросили желтые листья. \n" +
                "В лесу идет дождь, и листва на дорожках не шуршит под ногами ionic. \n" +
                "Дрозды кружились над рябиной. Они клевали гроздья ягод. \n" +
                "В дубках кричали сойки. Над елью пискнула синичка. Рябчики пролетели в лесную чащу. \n";
        System.out.print("Исходный текст: \n"+text);
        List<String> words = new LinkedList<String>(Arrays.asList(text.split("[\\s\\p{Punct}]")));
        List<String> newWords = new LinkedList<String>();
        System.out.println("\nРазбитые слова с пустыми ячейками: \n"+words);
        for(String word: words){
            if(!word.isEmpty()){
                newWords.add(word);
            }
        }
        System.out.println("\nРазбитые слова без пустых ячеек: \n"+newWords);
        newWords.removeIf(s -> !CompareTheFirstConsonantLetter.startsWithVowel(s));
        System.out.println("\nСлова начинающиеся на гласную: \n"+newWords);
        CompareTheFirstConsonantLetter comp = new CompareTheFirstConsonantLetter();
        newWords.sort(comp);
        System.out.println("\nОтсортированыые слова по первой согласной: \n"+newWords);
    }
}