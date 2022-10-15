class Solution {
    public class Pair{
        int x;
        int y;
        Pair(int x,int y)
        {
        this.x = x;
        this.y = y;
        }
    }
    public int orangesRotting(int[][] arr) {
        LinkedList<Pair> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] == 2)
                {
                    q.add(new Pair(i,j));
                }
                else if(arr[i][j] == 1)
                {
                    fresh++;
                }
            }
        }
        if(fresh == 0)
        {
            return 0;
        }
        
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int level = -1;
        
        while(q.size() > 0)
        {
            int size = q.size();
            level++;
            while(size-- > 0)
            {
                Pair rem = q.removeFirst();
                for(int i=0;i<4;i++)
                {
                    int rdash = rem.x + dir[i][0];
                    int cdash = rem.y + dir[i][1];
                    
                    if(rdash < arr.length && cdash < arr[0].length && rdash >= 0 && cdash >= 0 && arr[rdash][cdash] == 1)
                    {
                        q.add(new Pair(rdash,cdash));
                        arr[rdash][cdash] = 0;
                        fresh--;
                    }
                }
            }
        }
        
        if(fresh == 0)
        {
            return level;
        }
        else
        {
            return -1;
        }
        
    }
}