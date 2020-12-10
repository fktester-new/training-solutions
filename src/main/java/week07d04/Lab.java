package week07d04;

import java.time.LocalDateTime;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void complete(LocalDateTime finished){
        completed = true;
        completedAt = finished;
    }

    public void complete(){
        completed = true;
        completedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
