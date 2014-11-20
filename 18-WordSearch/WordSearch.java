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

    public boolean overlap(String a, int row, int col){
	int i = 0;
	int c = col;
	while (i < a.length()){
	    if ((a.charAt(i) == board[row][c])||
		(board[row][c] == '.')){
		i++;
		c++;
	    }
	    else {
		return false;
	    }
	}
	return true;
    }

 
    public void addWordH(String w, int row, int col){
	int c = col;
	if ((w.length() + col <= board[0].length)&&
	    (w.length() + col >= 0)&&
	    (row >= 0 && row < board.length)){
	    if (overlap(w, row, col) == true){
		for (int i=0; i < w.length();i++){
		    board[row][c] = w.charAt(i);
		    c++;
		}
	    }
	}
    }

    public void addWordHR(String w, int row, int col){
	String s = "";
	for (int i = w.length() - 1;i >= 0;i--){
	    s += w.charAt(i);
	}
	addWordH(s, row, col);
    }
		
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,15); // should work
	w.addWordH("look",3,14); // test illegal overlap
       	w.addWordH("look",3,18); // test legal overlap       
	w.addWordH("look",-3,20); // test illegal row      
	w.addWordH("look",3,55); // test illegal col
	w.addWordHR("hello",5,10); // test reverse direction
	w.addWordH("pool",5,8); // test legal overlap in reverse direction
	System.out.println(w);
    }
}
