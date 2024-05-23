public class Task {
    private String task;
    private final int taskId;
    private boolean done;
    public int generate6digitRandomNumber(){
        return (int) (Math.random() * 900000) + 100000;
    }
    public Task(String task){
        this.task = task;
        done = false;
        taskId = generate6digitRandomNumber();
    }
    public int getTaskId(){
        return taskId;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public void setTask(String task){
        this.task = task;
    }

    public String getTask() {
        return task;
    }
    public Boolean isDone(){
        return done;
    }
}
