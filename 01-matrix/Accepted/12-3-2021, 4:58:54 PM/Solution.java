// https://leetcode.com/problems/01-matrix

class Solution {
   

    public int[][] updateMatrix(int[][] mat) {
        int[][] dist = new int[mat.length][mat[0].length];
    for(int i = 0; i < mat.length; i++) {
        Arrays.fill(dist[i], Integer.MAX_VALUE -100000);
    }
    //start from the top of the array and fill each of the cell of the dist matrix with values from
	//top and left. We do not have right and bottom yet as they are empty(or filled with max 
	//integer like in our case
	
    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat[0].length;j++)
        {
            if(mat[i][j]==0)
                dist[i][j]=0;
            else{
                if(i>0)
                    dist[i][j] = Math.min(dist[i][j],dist[i-1][j]+1);
                if(j>0)
                    dist[i][j] = Math.min(dist[i][j],dist[i][j-1]+1);
            }    
        }
    }
	//start from the bottom of the array and fill each of the cell of the dist matrix with values from 
	//right and bottom.
	
    for(int i=mat.length-1;i>=0;i--)
    {
        for(int j=mat[0].length-1;j>=0;j--)
        {   
            if(i<mat.length-1)
                dist[i][j] = Math.min(dist[i][j],dist[i+1][j]+1);
            if(j<mat[0].length-1)
                dist[i][j] = Math.min(dist[i][j],dist[i][j+1]+1);   
        }
    }
   return dist;
}}