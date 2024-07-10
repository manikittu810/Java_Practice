package InterviewPrep.Oops.MM.SoftReference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceExample {
    public static void main(String[] args) {
        // Create a strong reference to an object
        String strongReference = new String("Hello, World!");

        // Create a soft reference to the object
        SoftReference<String> softReference = new SoftReference<>(strongReference);

        // Create a weak reference to the object
        WeakReference<String> weakReference = new WeakReference<>(strongReference);

        // Print references before nullifying the strong reference
        System.out.println("Strong Reference: " + strongReference);
        System.out.println("Soft Reference: " + softReference.get());
        System.out.println("Weak Reference: " + weakReference.get());

        // Remove the strong reference
        strongReference = null;

        // Suggest to the garbage collector to run and create memory pressure
        for (int i = 0; i < 10; i++) {
            System.gc();
            // Allocate memory to increase the pressure on the GC
            try {
                byte[] memoryFiller = new byte[10 * 1024 * 1024]; // 10MB
            } catch (OutOfMemoryError e) {
                // Ignore
            }
        }

        // Print references after garbage collection
        System.out.println("After GC:");
        System.out.println("Soft Reference: " + softReference.get());
        System.out.println("Weak Reference: " + weakReference.get());

        // Simulate additional memory pressure
        try {
            byte[] memoryFiller = new byte[100 * 1024 * 1024]; // 100MB
        } catch (OutOfMemoryError e) {
            // Ignore
        }

        // Print references after memory pressure
        System.out.println("After Memory Pressure:");
        System.out.println("Soft Reference: " + softReference.get());
        System.out.println("Weak Reference: " + weakReference.get());
    }
}
