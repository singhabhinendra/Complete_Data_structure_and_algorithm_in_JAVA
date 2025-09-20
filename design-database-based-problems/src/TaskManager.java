import java.util.*;

class TaskManager {
    private PriorityQueue<int[]> pq;
    private Map<Integer, Integer> taskPriority;
    private Map<Integer, Integer> taskOwner;

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0]; // higher priority first
            return b[1] - a[1]; // if tie → higher taskId first
        });
        taskPriority = new HashMap<>();
        taskOwner = new HashMap<>();
        for (List<Integer> t : tasks) add(t.get(0), t.get(1), t.get(2));
    }

    public void add(int userId, int taskId, int priority) {
        pq.add(new int[]{priority, taskId});
        taskPriority.put(taskId, priority);
        taskOwner.put(taskId, userId);
    }

    public void edit(int taskId, int newPriority) {
        pq.add(new int[]{newPriority, taskId});
        taskPriority.put(taskId, newPriority);
    }

    public void rmv(int taskId) {
        taskPriority.put(taskId, -1); // lazy delete
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] t = pq.poll();
            int p = t[0], id = t[1];
            if (taskPriority.getOrDefault(id, -2) == p) {
                taskPriority.put(id, -1); // mark removed
                return taskOwner.getOrDefault(id, -1);
            }
        }
        return -1;
    }
}

 class Main1 {
    public static void main(String[] args) {
        // Input simulation (like LeetCode format)
        String[] commands = {
                "TaskManager", "add", "edit", "execTop", "rmv", "add", "execTop"
        };

        Object[][] arguments = {
                { Arrays.asList(
                        Arrays.asList(1, 101, 10),
                        Arrays.asList(2, 102, 20),
                        Arrays.asList(3, 103, 15)
                ) },
                { 4, 104, 5 },
                { 102, 8 },
                {},
                { 101 },
                { 5, 105, 15 },
                {}
        };

        List<Object> output = new ArrayList<>();
        TaskManager tm = null;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "TaskManager":
                    @SuppressWarnings("unchecked")
                    List<List<Integer>> initTasks = (List<List<Integer>>) arguments[i][0];
                    tm = new TaskManager(initTasks);
                    output.add(null);
                    break;
                case "add":
                    tm.add((int) arguments[i][0], (int) arguments[i][1], (int) arguments[i][2]);
                    output.add(null);
                    break;
                case "edit":
                    tm.edit((int) arguments[i][0], (int) arguments[i][1]);
                    output.add(null);
                    break;
                case "rmv":
                    tm.rmv((int) arguments[i][0]);
                    output.add(null);
                    break;
                case "execTop":
                    output.add(tm.execTop());
                    break;
            }
        }

        System.out.println(output);
    }
}
