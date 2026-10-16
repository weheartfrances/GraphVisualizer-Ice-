/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author frances
 */
public class AlgorithmLogger {
    
}  private final List<String> logs = new ArrayList<>();

    public void log(String message) {
        logs.add(message);
        System.out.println("[ALGORITHM TRACE] " + message);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }

    public void clear() {
        logs.clear();
    }

    public void displayLogs() {
        System.out.println("\n--- Algorithm Trace ---");

        for (String message : logs) {
            System.out.println(message);
        }

        System.out.println("--- End of Trace ---\n");
    }
}

