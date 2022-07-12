package singleton.answer1;

/**
 * @project: GraphicalDesignPatterns
 * @ClassName: TicketMaker
 * @author: nzcer
 * @creat: 2022/7/11 22:04
 */
public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    private int ticket = 1000;

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
