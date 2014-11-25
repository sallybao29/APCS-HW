import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;
    private Random r = new Random();

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,20);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public String reverse(String w){
	String s = "";
	for (int i = w.length() - 1;i >= 0;i--){
	    s += w.charAt(i);
	}
	return s;
    }


    public boolean overlap(String a, char type, int row, int col){
	int i = 0,
	    r = row,
	    c = col;
	while (i < a.length()){
	    if ((a.charAt(i) == board[r][c])||
		(board[r][c] == '.')){
		if (type == 'h' || type == 'r'){
		    c++;
		}
		if (type != 'h'){
		    r++;
		}
		if (type == 'l'){
		    c--;
		}
		i++;
	    }
	    else {return false;}
	}
	return true;
    }
 
    public void addWordH(String w, int row, int col, boolean right){
	int c = col;
	if (right == false){
	    w = reverse(w);
	}
	if ((w.length() + col < board[0].length)&&
	    (col >= 0)&&
	    (row >= 0 && row < board.length)){
	    if (overlap(w, 'h', row, col) == true){
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c++;
		}
	    }
	}
	else{throw new IllegalArgumentException();}
    }

    public void addWordV(String w, int row, int col, boolean down){
	int r = row;
	if (down == false){
	    w = reverse(w);
	}
	if ((w.length() + row < board.length)&&
	    (row >= 0)&&
	    (col >= 0 && col < board[0].length)){
	    if (overlap(w, 'v', row, col) == true){
		for (int i = 0; i < w.length();i++){
		    board[r][col] = w.charAt(i);
		    r++;
		}
	    }
	}
	else {
	    throw new IllegalArgumentException();
	}
    }

    public void addWordD1(String w, int row, int col, boolean down){
	int r = row;
	int c = col;
	if (down == false){
	    w = reverse(w);
	}
	if ((col >= 0 && col + w.length() < board[0].length)&&
	    (row >= 0 && row + w.length() < board.length)){
	    if (overlap(w, 'r',  row, col) == true){
		for (int i = 0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    r++;
		    c++;
		}
	    }
	}
	else {
	    throw new IllegalArgumentException();
	}
    }

    public void addWordD2(String w, int row, int col, boolean down){
	int r = row;
	int c = col;
	if (down == false){
	    w = reverse(w);
	}
	if ((col < board[0].length &&  col - w.length() >= 0)&&
	    (row >= 0 && row + w.length() < board.length)){
	    if (overlap(w, 'l',  row, col) == true){
		for (int i = 0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    r++;
		    c--;
		}
	    }
	}
	else {
	    throw new IllegalArgumentException();
	}
    }

    public boolean addWord(String w){
	int x = r.nextInt(board[0].length),
	    y = r.nextInt(board.length),
	    method = r.nextInt(8);
	try{
	    switch(method){
	    case 0: addWordV(w, y, x, true); break;
	    case 1: addWordV(w, y, x, false); break;
	    case 2: addWordH(w, y, x, true); break;
	    case 3: addWordH(w, y, x, false); break;
	    case 4: addWordD1(w, y, x, true); break;
	    case 5: addWordD1(w, y, x, false); break;
	    case 6: addWordD2(w, y, x, true); break;
	    case 7: addWordD2(w, y, x, false); break;
	    }
	} catch(IllegalArgumentException e){
	    return false;
	}
	return true;  
    }

    public void makePuzzle(String f){
	Scanner sc = null;
	try {
	    sc =new Scanner(new File(f));
	} catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	while (sc.hasNext()){
	    String s = sc.next();
	     while (addWord(s) == false){ }
	}
	int row = 0,
	    col = 0;
	while (row < board.length){
	    col = 0;
	    while (col < board[row].length){
		if (board[row][col] == '.'){
		    board[row][col] = (char)(r.nextInt(26) + 97);
		}
		col++;
	    }
	    row++;
	}
    }
		
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.makePuzzle("word.txt");
       	System.out.println(w);
       
    }
}
