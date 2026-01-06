package com.arrays;

public class ValidSuduko {
	public boolean isValidSudoku(char[][] board) {

        // Valid rows;
        // Valid cols;

        for (int i = 0; i < 9; i++) {
        	
        	//Note either define hashset here or define as global variable and clear the set for next row and column check.
        	// if not same vale might be in row1 and row2 . exist condition check returns wrong value.
            HashSet<Character> rSet = new HashSet<>();
            HashSet<Character> cSet = new HashSet<>();
            
            // rSet.clear();
            //cSet.clear();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.' && !rSet.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !cSet.add(board[j][i])) {
                    return false;
                }
            }
        }

        // valid every Square

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                
                HashSet<Character> dt = new HashSet<>();
//dt.clear();  here clear if hashset is made global variable;
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.' && !dt.add(board[i][j])) {
                            return false;
                        }
                    }
                }

            }
        }
        return true;

    }
	
	
}


public boolean isValidSudoku(char[][] board) {
    
    HashSet<Character> rSet = new HashSet<>();
    HashSet<Character> cSet = new HashSet<>();
   // HashSet<Character> boxSet = new HashSet<>();
    
            HashSet<Character> dt = new HashSet<>();
    
    
    for (int i=0 ; i<9;i++){
                rSet.clear();
        cSet.clear();
        for (int j=0; j< 9 ;j++){
            
      
            if (board[i][j] != '.' && !rSet.add(board[i][j])){
                
                System.out.println("ryes"+ board[i][j]);
                 return false;
            }
               
            if (board[j][i] != '.' && !cSet.add(board[j][i])){
                 System.out.println("cyes" + j);
                return false;
            }      
        }
    }
                

    for (int row = 0; row < 9; row += 3) {
          
        
        for (int col = 0; col < 9; col += 3) {
                   dt.clear();

            for (int i = row; i < row + 3; i++) {
                for (int j = col; j < col + 3; j++) {
                    if (board[i][j] != '.' && !dt.add(board[i][j])) {
                         System.out.println("byes");
                        return false;
                    }
                }
            }

        }
    }
    return true;
}


}
