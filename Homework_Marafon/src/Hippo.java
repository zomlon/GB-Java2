public class Hippo extends Animal implements Swimable {
    private int swim_limit;
    private final int RUN_LIMIT = 50;
    private final int SWIM_LIMIT = 200;

    public Hippo(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        swim_limit = SWIM_LIMIT;
    }
    public Hippo(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        swim_limit = swim_limit;
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
}