package br.univille.log;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class LoggerFile implements Logger {
    int cont = 0;
    @Override
    public void log(Level level, String message){
        String filename = "teste.txt";
        message = "[" + LocalDateTime.now() + " " +  level + "] " + message + "\n";
        try {
            if (cont == 0){
            Files.write(Paths.get(filename)
                       , message.getBytes());
                    } else{
                        Files.write(Paths.get(filename)
           , message.getBytes()                   
           , StandardOpenOption.APPEND);
                    }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();

        }
        cont++;
    }
}
