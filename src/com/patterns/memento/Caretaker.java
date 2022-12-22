package com.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker class stores a list of Memento objects, allowing the originator to restore
 * its previous states at a later time. It has methods for saving and restoring Memento objects.
 */
class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();
    
    /**
     * Saves a Memento object.
     *
     * @param memento the Memento object to save
     */
    public void save(Memento memento) {
        mementos.add(memento);
    }
    
    /**
     * Restores the originator to the state saved at a specific index in the list of Memento objects.
     *
     * @param index the index of the Memento object to restore
     * @return the Memento object at the given index
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    public Memento restore(int index) {
        return mementos.get(index);
    }
    
    /**
     * Gets the number of Memento objects stored in the caretaker.
     *
     * @return the number of Memento objects stored in the caretaker
     */
    public int size() {
        return mementos.size();
    }
}
