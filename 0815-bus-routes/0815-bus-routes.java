class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        int n = routes.length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<routes[i].length;j++)
            {
                int busStopno = routes[i][j];
                ArrayList<Integer> busNo = map.getOrDefault(busStopno, new ArrayList<>());
                busNo.add(i);
                map.put(busStopno, busNo);
            }
        }
        
        LinkedList<Integer> q = new LinkedList<>();
        HashSet<Integer> busStopvis = new HashSet<>();
        HashSet<Integer> busVis = new HashSet<>();
        int level = 0;
        
        q.addLast(source);
        busStopvis.add(source);
        
        while(q.size() > 0)
        {
            int size = q.size();
            while(size-->0)
            {
                int rem = q.removeFirst();
                if(rem == target)
                {
                    return level;
                }
                ArrayList<Integer> buses = map.get(rem);
                for(int bus : buses)
                {
                    if(busVis.contains(bus) == true)
                    {
                        continue;
                    }
                    int arr[] = routes[bus];
                    for(int busStop : arr)
                    {
                        if(busStopvis.contains(busStop) == true)
                        {
                            continue;
                        }
                        q.addLast(busStop);
                        busStopvis.add(busStop);
                    }
                    busVis.add(bus);
                }
            }
            level++;
        }
        return -1;
        
    }
}