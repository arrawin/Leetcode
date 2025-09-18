class TaskManager {
    public PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a, b) ->
            (a[0] == b[0] ? b[1] - a[1] : b[0] - a[0])
    );

    public HashMap<Integer, Integer> taskIdPriority = new HashMap<>();
    public HashMap<Integer, Integer> taskIdUser = new HashMap<>();

    public TaskManager(List<List<Integer>> tasks) {
        for (List<Integer> list : tasks) {
            int userId = list.get(0);
            int taskId = list.get(1);
            int priority = list.get(2);


            add(userId, taskId, priority);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        taskIdUser.put(taskId, userId);
        taskIdPriority.put(taskId, priority);
        pq.add(new int[]{priority, taskId});
    }
    
    public void edit(int taskId, int newPriority) {
        taskIdPriority.put(taskId, newPriority);
        pq.add(new int[]{newPriority, taskId});
    }
    
    public void rmv(int taskId) {
        taskIdUser.remove(taskId);
        taskIdPriority.remove(taskId);
    }
    
    public int execTop() {
        while (!pq.isEmpty()) {
            int[] element = pq.poll();
            int priority = element[0];
            int taskId = element[1];

            if (taskIdPriority.getOrDefault(taskId, -1) == priority) {
                int result = taskIdUser.get(taskId);
                rmv(taskId);
                return result;
            }
        }

        return -1;
    }
}