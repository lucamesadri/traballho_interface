import br.univille.log.*;
public class App {
    public static void main(String[] args) throws Exception {
        Logger l = LoggerFactory.onConsole();
        Logger j = LoggerFactory.onFile();

        l.log(Level.DEBUG, "olhar pra trás");
        l.log(Level.WARNING, "conversas.");
        l.log(Level.ERROR, "memórias");

        j.log(Level.DEBUG, "cais");
        j.log(Level.WARNING, "me esquecer");
        j.log(Level.ERROR, "um sonho, um fim");
    }
}
