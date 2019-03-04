package cn.com.jcs.leetCode.problem463.IslandPerimeter;

/**
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 * Example:
 * 
 * [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 * 
 * Answer: 16 Explanation: The perimeter is the 16 yellow stripes in the image
 * below:
 */
public class Solution {
	public int islandPerimeter(int[][] grid) {
		int[][] dealgrid = new int[grid.length + 2][grid[0].length + 2];
		System.out.println(dealgrid.length);
		System.out.println(dealgrid[0].length);
		for (int i = 0; i < dealgrid.length; i++) {
			for (int j = 0; j < dealgrid[0].length; j++) {
				if (i == 0 || i == dealgrid.length - 1) {
					dealgrid[i][j] = 0;
					continue;
				}
				if (j == 0 || j == dealgrid[0].length - 1) {
					dealgrid[i][j] = 0;
					continue;
				}
				dealgrid[i][j] = grid[i - 1][j - 1];
			}
		}
		for (int[] a : dealgrid) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println("\n");
		}
		int countIsland = 0;
		int near = 0;
		int perimeter = 0;
		for (int i = 1; i < dealgrid.length - 1; i++) {
			for (int j = 1; j < dealgrid[0].length - 1; j++) {
				if (dealgrid[i][j] == 1) {
					countIsland++;
					if (dealgrid[i - 1][j] == 1 ) {
						near++;
					}
					if ( dealgrid[i][j - 1] == 1 ) {
						near++;
					}
					if ( dealgrid[i + 1][j] == 1 ) {
						near++;
					}
					if ( dealgrid[i][j + 1] == 1 ) {
						near++;
					}
				}
			}
		}
		perimeter = 4 * countIsland - near;
		return perimeter;
	}
}