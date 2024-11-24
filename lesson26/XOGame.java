package lesson26;

import java.util.Scanner;

public class XOGame {
    FieldXO gameField;
    Scanner scan = new Scanner(System.in);
    char whoMakeNextTurn;
    boolean gameOver = false;

    void setupNewGame() {
        System.out.println("Будем играть в крестики нолики");
        this.gameField = new FieldXO();
        this.gameField.initField();
    }
    void play() {
        this.setupNewGame();
        System.out.println("Кто ходит первым?");
        char first = this.scan.next().charAt(0);
        if (first == 'X' || first == 'O') {
            this.whoMakeNextTurn = first;
        } else {
            System.out.println("Я распознаю только Х или О, так что первым будет Х");
            this.whoMakeNextTurn = 'X';
        }
        while (!gameOver) {
            turn();
            this.gameOver = this.gameField.isGameOver(this.whoMakeNextTurn);
            if (this.gameOver) {
                System.out.println(this.whoMakeNextTurn + " выйграл!");
            }
            if (this.whoMakeNextTurn == 'X') {
                this.whoMakeNextTurn = 'O';
            } else {
                this.whoMakeNextTurn = 'X';
            }
        }
        System.out.println("Игра закончена.");
    }

    void turn() {
        System.out.println(whoMakeNextTurn + " твой ход.");
        System.out.print("Назови строку:");
        int rowNumber = this.scan.nextInt();
        System.out.print("Назови столбец:");
        int colNumber = this.scan.nextInt();
        int rowIndex = rowNumber - 1;
        int colIndex = colNumber - 1;
        if (this.gameField.isPlaceFree(rowIndex, colIndex)) {
            this.gameField.setValue(rowIndex, colIndex, whoMakeNextTurn);
            this.gameField.printField();
        } else {
            System.out.println(" Ячейка занята, сделай еще ход");
            turn();
        }
    }
}




