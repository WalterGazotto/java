import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ArquivosTexto {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados/poema.txt");
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()){
                String linha = scanner.nextLine();
                System.out.printf("%s%n", linha);
                
            }    
        } catch (FileNotFoundException ex) {
            System.out.printf("Erro abertura do arqivo: %s.%n", ex.getMessage());
        }
    }
}
