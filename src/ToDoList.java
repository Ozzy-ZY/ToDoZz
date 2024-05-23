
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    final int MAX_NUM_OF_TASKS = 20;
    public List<Task> list = new LinkedList<>();

    public void addTask(String task){
        if(list.size()>= MAX_NUM_OF_TASKS){
            System.err.println("You have reached the max number of tasks *20*");
            return;
        }
        else{
        Task t = new Task(task);
        list.add(t);
        }
    }
    public void removeTask(int taskId){
        if(list.isEmpty()){
            System.err.println("Get a Life");
            return;
        }
        else{
            for(int i =0;i<list.size();i++){
                if(list.get(i).getTaskId() == taskId){
                    list.remove(i);
                    return;
                }
            }
        }
    }
}
