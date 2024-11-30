public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("CDPlayer starting...");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stopping...");
    }
}
