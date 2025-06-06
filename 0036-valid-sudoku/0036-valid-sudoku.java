class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++){
            HashSet<Character> res = new HashSet<>();
            for (int j = 0; j < n; j++){
                if (res.contains(board[i][j])){
                    return false;
                } else {
                    if (board[i][j] != '.'){
                        res.add(board[i][j]);
                    }
                }
            }
        }

        for (int j = 0; j < n; j++){
            HashSet<Character> res = new HashSet<>();
            for (int i = 0; i < m; i++){
                if (res.contains(board[i][j])){
                    return false;
                } else {
                    if (board[i][j] != '.'){
                        res.add(board[i][j]);
                    }
                }
            }
        }

        HashMap<List<Integer>,List<Character>> dict1 = new HashMap<>();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                List<Integer> ans = new ArrayList<>();
                ans.add(i/3);
                ans.add(j/3);
                if (dict1.get(ans) == null){
                    dict1.put(ans,new ArrayList<>());
                    if (board[i][j] != '.'){
                        dict1.get(ans).add(board[i][j]);
                    }
                } else {
                    if (dict1.get(ans).contains(board[i][j])){
                        return false;
                    } else {
                        if (board[i][j] != '.'){
                            dict1.get(ans).add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}