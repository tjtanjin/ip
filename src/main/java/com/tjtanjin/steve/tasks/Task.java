package com.tjtanjin.steve.tasks;

import java.time.LocalDate;

/**
 * Encapsulates a task and supports operators to retrieve
 * information about the task such as taskName, status and type.
 */
public class Task {

    //task details
    private final String taskName;
    private String status;
    private final String type;

    /**
     * Constructor for Task class.
     *
     * @param taskName name of task
     * @param status task completion status
     * @param type type of task
     */
    public Task(String taskName, String status, String type) {
        this.taskName = taskName;
        this.status = status;
        this.type = type;
    }

    /**
     * Gets name of task.
     *
     * @return name of task
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Gets status of task.
     *
     * @return status of task
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Gets type of task.
     *
     * @return type of task
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gets empty array of dates since overridden in deadline and event child class.
     *
     * @return empty array of size 1
     */
    public LocalDate[] getDates() {
        return new LocalDate[1];
    }

    /**
     * Marks the task as completed.
     */
    public void markCompleted() {
        this.status = "complete";
    }

    /**
     * Gets the string describing task.
     *
     * @return String describing task
     */
    @Override
    public String toString() {
        if (this.getStatus().equals("incomplete")) {
            return "[" + this.getType().charAt(0) + "][ ] " + this.getTaskName();
        } else {
            return "[" + this.getType().charAt(0) + "][X] " + this.getTaskName();
        }
    }
}
