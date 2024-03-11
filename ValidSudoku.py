class ValidSudoku:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        columnSet = defaultdict(set)
        rowSet = defaultdict(set)
        squareSet = defaultdict(set)

        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    continue
                if (board[r][c] in rowSet[r] or 
                   board[r][c] in columnSet[c] or
                   board[r][c] in squareSet[r // 3, c // 3]):
                    return False
                columnSet[c].add(board[r][c])
                rowSet[r].add(board[r][c])
                squareSet[r // 3, c // 3].add(board[r][c])
        return True
