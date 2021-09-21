/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгадать
        //Если пользователь отгадал, он выиграл 
        //Иначе пользователь проиграл
        int max = 5, min = 0;
        Random random = new Random();
        int gameNum = random.nextInt(max - min + 1) + min;
        System.out.print("Программа загадала число от 0 до 5, угадай: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(gameNum == userNum){
            System.out.println("Ура! Ты выиграл!");
        }else{
            System.out.println(":( Ты проиграл. Задумано число: " + gameNum);
        }
    }
    
}
