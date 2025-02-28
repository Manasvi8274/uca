import java.util.*;
import java.io.*;

public class twentyfour{
    
}

// public class MazeSynchronizer {
//     // Directions: U, D, L, R
//     static int[] dr = {-1, 1, 0, 0};
//     static int[] dc = {0, 0, -1, 1};
//     static char[] moves = {'U','D','L','R'};
//     // Parent class for the long-bitmask version.
//     static class LongParent {
//         long prev;
//         char move;
//         public LongParent(long prev, char move) {
//             this.prev = prev;
//             this.move = move;
//         }
//     }
//     // Parent class for the BitSet version.
//     static class BSParent {
//         BitSet prev;
//         char move;
//         public BSParent(BitSet prev, char move) {
//             this.prev = prev;
//             this.move = move;
//         }
//     }
//     public static void main(String[] args) throws Exception {
//         // Read the maze from standard input.
//         // Maze symbols: '#' = wall, '.' = free space, 'E' = exit.
//         Scanner sc = new Scanner(System.in);
//         List<String> lines = new ArrayList<>();
//         while (sc.hasNextLine()) {
//             String line = sc.nextLine();
//             if (line.trim().isEmpty()) continue;
//             lines.add(line);
//         }
//         if (lines.isEmpty()) return;
//         int R = lines.size();
//         int C = lines.get(0).length();
//         char[][] maze = new char[R][C];
//         for (int i = 0; i < R; i++) {
//             maze[i] = lines.get(i).toCharArray();
//         }
//         // Map every free cell ('.' or 'E') to an index.
//         // Now, the exit is treated just like any other free cell.
//         int[][] cellIndex = new int[R][C];
//         for (int i = 0; i < R; i++) {
//             Arrays.fill(cellIndex[i], -1);
//         }
//         List<int[]> freeCells = new ArrayList<>();
//         int exitIndex = -1;
//         for (int r = 0; r < R; r++) {
//             for (int c = 0; c < C; c++) {
//                 if (maze[r][c] != '#') {
//                     int idx = freeCells.size();
//                     freeCells.add(new int[]{r, c});
//                     cellIndex[r][c] = idx;
//                     if (maze[r][c] == 'E') {
//                         exitIndex = idx;
//                     }
//                 }
//             }
//         }
//         int n = freeCells.size();
//         if (exitIndex == -1) {
//             System.out.println("No exit found in maze");
//             return;
//         }
//         // Precompute transitions for each free cell for each move.
//         // Unlike before, the exit cell is NOT absorbing.
//         int[][] trans = new int[n][4];  // trans[i][d]: destination from cell i on move moves[d]
//         for (int i = 0; i < n; i++) {
//             int r = freeCells.get(i)[0];
//             int c = freeCells.get(i)[1];
//             for (int d = 0; d < 4; d++) {
//                 int nr = r + dr[d];
//                 int nc = c + dc[d];
//                 if (nr < 0 || nr >= R || nc < 0 || nc >= C || maze[nr][nc] == '#') {
//                     // If move hits a wall or is out of bounds, stay in place.
//                     trans[i][d] = i;
//                 } else {
//                     int nxt = cellIndex[nr][nc];
//                     trans[i][d] = nxt;
//                 }
//             }
//         }
//         // Now, we want to find a sequence of moves such that, regardless of the robot's starting cell,
//         // after executing the sequence the robot is exactly at the exit.
//         // Our states will be sets of indices (possible positions). The target state is the singleton set {exitIndex}.
//         // Use a long bitmask if possible.
//         String solution;
//         if (n <= 64) {
//             solution = solveUsingLong(n, exitIndex, trans);
//         } else {
//             solution = solveUsingBitSet(n, exitIndex, trans);
//         }
//         System.out.println(solution);
//     }
//     // Long-bitmask version: each state is a long where bit i is 1 if the robot might be at free cell i.
//     static String solveUsingLong(int n, int exitIndex, int[][] trans) {
//         // Initial state: all free cells are possible.
//         long init = 0L;
//         for (int i = 0; i < n; i++) {
//             init |= (1L << i);
//         }
//         // Target state: only the exit cell.
//         long target = (1L << exitIndex);
//         Queue<Long> queue = new LinkedList<>();
//         Map<Long, LongParent> parent = new HashMap<>();
//         queue.offer(init);
//         parent.put(init, null);
//         while (!queue.isEmpty()) {
//             long state = queue.poll();
//             if (state == target) {
//                 // Reconstruct the sequence.
//                 StringBuilder sb = new StringBuilder();
//                 long cur = state;
//                 while (parent.get(cur) != null) {
//                     LongParent lp = parent.get(cur);
//                     sb.append(lp.move);
//                     cur = lp.prev;
//                 }
//                 return sb.reverse().toString();
//             }
//             // Try each move.
//             for (int d = 0; d < 4; d++) {
//                 long nextState = 0L;
//                 long temp = state;
//                 while (temp != 0) {
//                     int i = Long.numberOfTrailingZeros(temp);
//                     temp &= temp - 1;
//                     int nxt = trans[i][d];
//                     nextState |= (1L << nxt);
//                 }
//                 if (!parent.containsKey(nextState)) {
//                     parent.put(nextState, new LongParent(state, moves[d]));
//                     queue.offer(nextState);
//                 }
//             }
//         }
//         return "No solution";
//     }
//     // BitSet version for cases where n > 64.
//     static String solveUsingBitSet(int n, int exitIndex, int[][] trans) {
//         BitSet init = new BitSet(n);
//         for (int i = 0; i < n; i++) {
//             init.set(i);
//         }
//         // Target state: only the exit cell.
//         BitSet target = new BitSet(n);
//         target.set(exitIndex);
//         Queue<BitSet> queue = new LinkedList<>();
//         Map<BitSet, BSParent> parent = new HashMap<>();
//         BitSet initClone = (BitSet) init.clone();
//         queue.offer(initClone);
//         parent.put(initClone, null);
//         while (!queue.isEmpty()) {
//             BitSet state = queue.poll();
//             if (state.equals(target)) {
//                 // Reconstruct the sequence.
//                 StringBuilder sb = new StringBuilder();
//                 BitSet cur = state;
//                 while (parent.get(cur) != null) {
//                     BSParent bp = parent.get(cur);
//                     sb.append(bp.move);
//                     cur = bp.prev;
//                 }
//                 return sb.reverse().toString();
//             }
//             for (int d = 0; d < 4; d++) {
//                 BitSet nextState = new BitSet(n);
//                 for (int i = state.nextSetBit(0); i >= 0; i = state.nextSetBit(i+1)) {
//                     int nxt = trans[i][d];
//                     nextState.set(nxt);
//                 }
//                 BitSet nextClone = (BitSet) nextState.clone();
//                 if (!parent.containsKey(nextClone)) {
//                     parent.put(nextClone, new BSParent(state, moves[d]));
//                     queue.offer(nextClone);
//                 }
//             }
//         }
//         return "No solution";
//     }
// }

// class Codechef
// {
//     static class Parent {
//         long state;
//         char move;
//         Parent(long state, char move) {
//             this.state = state;
//             this.move = move;
//         }
//     }
    
//     public static String getUniversalPath(char[][] maze) {
//         List<int[]> freeCells = new ArrayList<>();
//         int exitIdx = 0;
//         int[][] trans = new int[maze.length][maze[0].length];
//         int dirs[][] = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
//         char direction[] = {'D', 'U', 'L', 'R'};
        
//         for (int i = 0; i < maze.length; i++) {
//             Arrays.fill(trans[i], -1);
//         }
        
//         for (int i = 0; i < maze.length; i++) {
//             for (int j = 0; j < maze[0].length; j++) {
//                 if (maze[i][j] != '#') {
                    
//                     freeCells.add(new int[] {i, j});
//                     if (maze[i][j] == 'E') {
//                         exitIdx = freeCells.size() - 1;
//                     }
//                     trans[i][j] = freeCells.size() - 1;
//                 }
//             }
//         }
        
//         int[][] preComputePath = new int[freeCells.size()][4];
        
//         for (int i = 0 ; i < freeCells.size(); i++) {
//             int freeCell[] = freeCells.get(i);
//             if (i == exitIdx) {
//                 continue;
//             } else {
//                 for (int d = 0; d < 4; d++) {
//                     int dir[] = dirs[d];
//                     int nextCell[] = new int[] {freeCell[0] + dir[0], freeCell[1] + dir[1]};
                    
//                     if (nextCell[0] < 0 || nextCell[1] < 0 || nextCell[0] >= maze.length || nextCell[1] >= maze[0].length || trans[nextCell[0]][nextCell[1]] == -1) {
//                         preComputePath[i][d] = i;
//                     } else {
//                         preComputePath[i][d] = trans[nextCell[0]][nextCell[1]];
//                     }
//                 }
//             }
//         }
        
//         // for (int  i = 0; i < preComputePath.length; i++) {
//         //     for (int j = 0 ; j < preComputePath[0].length; j++) {
//         //         System.out.print(preComputePath[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }
        
//         long targetState = 1L << exitIdx; // 0L
//         long currentState = 0L;
//         Map<Long, Parent> parentMapping = new HashMap<>();
        
        
        
//         for (int i = 0; i < freeCells.size(); i++) {
//             //if (i != exitIdx) {
//                 currentState = currentState | (1 << i);
//             //}
//         }
        
//         //System.out.println(exitIdx + " " + Long.toBinaryString(currentState));
        
//         Queue<Long> q = new LinkedList<>();
//         q.offer(currentState);
//         parentMapping.put(currentState, null);
        
//         while (!q.isEmpty()) {
//             long now = q.poll();
            
//             if (now == targetState) {
//                 return getSolution(now, parentMapping);
//             }
            
//             for (int d = 0; d < 4; d++) {
//                 long temp = now;
//                 long next = 0L;
                
//                 while (temp != 0) {
//                     int i = Long.numberOfTrailingZeros(temp);
//                     temp = temp & (temp - 1);
//                     int nxt = preComputePath[i][d];
                    
//                     //if (nxt != exitIdx) {
//                         next |= (1L << nxt);
//                     //}
//                 }
                
//                 //System.out.println(Long.toBinaryString(next));
                
//                 if (!parentMapping.containsKey(next)) {
//                     parentMapping.put(next, new Parent(now, direction[d]));
//                     q.offer(next);
//                 }
//             }
//         }
        
         
        
//         // freeCells.forEach(e -> {
//         //   System.out.println(e[0] + " " + e[1]); 
//         // });
        
        
//         return "No Solution";
//     }
    
//     public static String getSolution(long p, Map<Long, Parent> parentMapping) {
//         StringBuilder str = new StringBuilder("");
//         while (parentMapping.containsKey(p)) {
//             Parent curr = parentMapping.get(p);
//             if (curr == null) {
//                 break;
//             }
//             str.append(curr.move);
//             p = curr.state;
//         }
//         return str.reverse().toString();
//     }
    
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		char[][] maze = { {'#', '#', '#', '#', '#', '#'} ,
// 		                  {'#', '.', '.', '.', '.', '#'} ,
// 		                  {'#', '.', 'E', '#', '.', '#'} ,
// 		                  {'#', '#', '#', '#', '#', '#'}
// 		                };
		                
// 		System.out.println(getUniversalPath(maze));
// 	}
// }

