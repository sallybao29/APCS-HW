public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
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

    public boolean overlapH(String a, int row, int col){
	int i = 0;
	int c = col;
	while (i < a.length()){
	    if ((a.charAt(i) == board[row][c])||
		(board[row][c] == '.')){
		i++;
		c++;
	    }
	    else {return false;}
	}
	return true;
    }

    public boolean overlapV(String a, int row, int col){
	int i = 0;
	int r = row;
	while (i < a.length()){
	    if ((a.charAt(i) == board[r][col])||
		(board[r][col] == '.')){
		i++;
		r++;
	    }
	    else {return false;}
	}
	return true;
    }

    public boolean overlapD(String a, int row, int col){
	int i = 0,
	    r = row,
	    c = col;
	while (i < a.length()){
	    if ((a.charAt(i) == board[r][c])||
		(board[r][c] == '.')){
		i++;
		r++;
		c++;
	    }
	    else {return false;}
	}
	return true;

    }

 
    public void addWordH(String w, int row, int col){
	int c = col;
	if ((w.length() + col <= board[0].length)&&
	    (col >= 0)&&
	    (row >= 0 && row < board.length)){
	    if (overlapH(w, row, col) == true){
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c++;
		}
	    }
	}
    }

    public void addWordHR(String w, int row, int col){
	String s = reverse(w);
	addWordH(s, row, col);
    }

    public void addWordV(String w, int row, int col){
	int r = row;
	if ((w.length() + row <= board.length)&&
	    (row >= 0)&&
	    (col >= 0 && col < board[0].length)){
	    if (overlapV(w, row, col) == true){
		for (int i = 0; i < w.length();i++){
		    board[r][col] = w.charAt(i);
		    r++;
		}
	    }
	}
    }

    public void addWordVR(String w, int row, int col){
	String s = reverse(w);
	addWordV(s, row, col);
    }

    public void addWordD(String w, int row, int col){
	int r = row;
	int c = col;
	if ((col >= 0 && col + w.length() <= board[0].length)&&
	    (row >= 0 && row + w.length() <= board.length)){
	    if (overlapD(w, row, col) == true){
		for (int i = 0; i < w.length();i++){
		    board[r][c] = w.charAt(i);
		    r++;
		    c++;
		}
	    }
	}

    }
		
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	   	System.out.println(w);
	w.addWordD("hello",3,15); // should work
       	w.addWordD("look",4,15); // test illegal overlap
		w.addWordD("look",6,15); // test legal overlap       
	w.addWordD("look",-3,20); // test illegal row      
	w.addWordD("look",3,55); // test illegal col
	// 	w.addWordDR("hello",5,10); // test reverse direction
		w.addWordD("pool",3,10); // test legal overlap in reverse direction
		System.out.println(w);
       
    }
}
