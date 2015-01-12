package useriinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

import javax.swing.JPanel;

public class GameBoardRules extends Observable {
    private GameBoardRules[][] gameBoard;

    private int[][] generateNewGame(int[][] gameBoard) {
	return gameBoard;

    }

    private int[][] generateSolution(int[][] gameBoard, int index) {
	if (index > 80)
	    return gameBoard;
	int x = index % 9;
	int y = index / 9;
	List<Integer> numbers = new ArrayList<Integer>();
	for (int i = 0; i < 9; i++) {
	    numbers.add(i);
	    Collections.shuffle(numbers);
	    while (numbers.size() > 0) {
		int number = getNextPossibleNumber(gameBoard, x, y, numbers);
		if (number == -1)
		    return null;
		gameBoard[y][x] = number;
		int[][] tempGame = generateSolution(gameBoard, index + 1);
		if (tempGame != null)
		    return tempGame;
	    }
	}
	return null;
    }

    private int getNextPossibleNumber(int[][] gameBoard, int x, int y, List<Integer> numbers) {
	while(numbers.size()>0){
	    int number = numbers.remove(0);
	    if(isPossibleX(gameBoard,y,number)&&
		    isPossibleY(gameBoard,x,number)&&
		    isPossibleBlock(gameBoard,x,y,number))
		return number;
	}
	return 0;
    }

}