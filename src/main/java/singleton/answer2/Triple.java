package singleton.answer2;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: Triple
 * @author: nzcer
 * @creat: 2022/7/11 22:22
 */
public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };

    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is Created");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }
    @Override
    public String toString() {
        return String.format("[Triple id = %d]", id);
    }
}
