package InterviewPrep.Oops.MM;

import java.lang.ref.WeakReference;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {
    public static void main(String[] args) {
        // Create a strong reference to an object
        String strongReference = new String("Hello, World!");

        // Create a weak reference to the object
        WeakReference<String> weakReference = new WeakReference<>(strongReference);

        // The object is still reachable through the strong reference
        System.out.println("Strong Reference: " + strongReference);
        System.out.println("Weak Reference: " + weakReference.get());

        // Remove the strong reference
        strongReference = null;

        // Suggest to the garbage collector to run
        System.gc();

        // After garbage collection, the object might be reclaimed
        System.out.println("Weak Reference after GC: " + weakReference.get());
    }
}


