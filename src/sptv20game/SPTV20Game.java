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
        int max = 5, min = 0, attempt = 1, userNum = -1;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int gameNum = random.nextInt(max - min + 1) + min;
        System.out.print("Программа загадала число от 0 до 5, угадай: ");
        for(int i = 0; i < 3; i++){
            userNum = scanner.nextInt();
            if(gameNum == userNum){
                System.out.println("Ура! Ты выиграл!");
                break;
            }else{
                if(attempt < 3){
                    System.out.print("Неправильно, попробуй еще раз: ");
                }else{
                    System.out.println(":( Ты проиграл. Задумано число: " + gameNum);
                }
            }
            attempt++;
        }
    }
    
}
