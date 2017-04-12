package edu.sdsu.cs.maze;

import edu.sdsu.cs.datastructures.IBasicDeque;

import java.awt.*;
import java.util.Arrays;

/**
 * The MazeSolution class implements a breadth-first search algorithm to produce a Deque of moves from the origin to
 * the destination.
 *
 * @author Your name here.
 * @account Your edoras user name
 */
public class MazeSolution {

    private final int UNVISITED = -1;

    private final Maze myMaze;
    private int[][] distances;

    public MazeSolution(Maze toSolve) {
        myMaze = toSolve;
        distances = new int[myMaze.size()][myMaze.size()];
        resetDistanceGrid();
    }

    private void resetDistanceGrid() {
        for (int rowCounter = 0; rowCounter < myMaze.size(); rowCounter++)
            Arrays.fill(distances[rowCounter], UNVISITED);
    }

    /**
     * STUDENTS MUST CODE:
     * <p>
     * Given the starting and ending points within the maze, this method performs a breadth-first search and returns
     * one shortest path between them. The strategy should be:
     * <p>
     * <li>Mark all rooms unvisited</li>
     * <li>Enqueue the starting room and record the current distance as 0</li>
     * <li><b>While</b> the queue of rooms has items:</li>
     * <li>Dequeue a room and mark it as visited</li>
     * <li>Mark each accessible, adjoining room as distance (current)+1 and place it in the queue</li>
     * <p>
     * This process will determine the number of steps one must take to return to the starting point from any room
     * in the maze. With these data, you will then work backward to build a stack of moves. To find the shortest
     * path, one only need to push the destination room on a stack, and then work backwards from there by selecting
     * the connected room at each step with the shortest distance back to the origin. As you find the next step to
     * take, push it on the stack and continue. When you reach the origin, your stack will contain the list of rooms
     * one must visit, in sequential order, to exit the maze.</p>
     *
     * @param start The starting position in the maze. The .y component refers to the row and comes first when referring
     *              to the grid[y][x].
     * @param end   The destination point in the maze.
     * @return A Deque of the rooms one must visit to reach the exit.
     */
    public IBasicDeque<MazeRoom> solve(Point start, Point end) {
        // TODO: Code this
        return null;
    }

}
