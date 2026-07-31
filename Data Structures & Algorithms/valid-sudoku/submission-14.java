class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char current = board[r][c];
                if(current=='.'){
                    continue;
                }

                String squareKey = (r/3) + "," + (c/3);

                if(rows.computeIfAbsent(r, HashSet::new).contains(current) ||
                cols.computeIfAbsent(c, k-> new HashSet<>()).contains(current)||
                square.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(current)){
                    return false;
                }

                rows.get(r).add(current);
                cols.get(c).add(current);
                square.get(squareKey).add(current);

            }
        }
        return true;
    }
}