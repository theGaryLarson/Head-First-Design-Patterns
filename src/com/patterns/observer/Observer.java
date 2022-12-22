package com.patterns.observer;

/**
 * Interface for objects that can be notified of updates from a subject.
 */
public interface Observer {
    /**
     * Receives an update from the subject.
     *
     * @param value the updated value from the subject
     */
    void update(int value);
}
