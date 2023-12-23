package ua.edu.ucu.apps.lab10.documents;

public class TimedDocument extends SmartDocument {

    public TimedDocument(String gcsPath) {
        super(gcsPath);
    }

    @Override
    public String parse() {
        long start = System.nanoTime();
        super.parse();
        long end = System.nanoTime();
        // Measured time in nanoseconds and converted to seconds
        long execTime = (end - start) / (long)Math.pow(10, 9);
        return "Parsing file taken: " + execTime + " seconds.";
    }
}
