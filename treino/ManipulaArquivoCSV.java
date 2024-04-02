import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulaArquivoCSV {
    public final String DELIMITADOR_PONTO_VIRGULA = ";";
    public final String DELIMITSDOR_VIRGULA = ",";
    public static void main(String[] arg) {
        ManipulaArquivoCSV csv = new ManipulaArquivoCSV();
        List<List<String>> registroDados = csv.leitura();
        csv.imprimeDados(registroDados);
    }  
    public List<List<String>> leitura() {
        List<List<String>> registroDados = new ArrayList<>();
        try {
            File arquivo = new File("dados/dadosclientes.csv");
            try (Scanner scanner = new Scanner(arquivo)) {
                while (scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
                    registroDados.add(geRegistrodaLinha(linha));
                    }
            }
            } catch (FileNotFoundException ex) {
                System.out.printf("Erro abertura do arquivo: %s.%n", ex.getMessage());
                System.exit(0);
            }
            return registroDados; 
        }
            
        private List<String> geRegistrodaLinha(String linha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geRegistrodaLinha'");
    }
        /*private List<String> geRegistrodaLinha(String linha) {
            List<String> listValores = new ArrayList<>();
            try (Scanner linhScanner = new Scanner(linha)) {
                linhScanner.useDelimiter(DELIMITADOR_PONTO_VIRGULA);
                Scanner linhaScanner;
                while (linhaScanner.hasNext()) {
                    listValores.add(linhaScanner.next());
                }
            }
            return listValores;
        } 
            PARTE DO CODIGO QUE NÃO ESTA FUNCIONANDO !!!
        */
        private void imprimeDados(List<List<String>> registroDados) {
            for (List<String> lista: registroDados){
                for (String elemento : lista) {
                    System.out.printf("|%15s ", elemento);
                }
                System.out.println("|");
            }
        }
    }