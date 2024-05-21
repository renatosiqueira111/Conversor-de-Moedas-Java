import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HTTP url = new HTTP();
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);

        int opcaoEscolhidaMenu;
        double valorParaConversao;
        boolean maisConversoes = true;
        String linkAPI = "https://v6.exchangerate-api.com/v6/SUA_CHAVE_DE_AUTENTICACAO";

        while(maisConversoes) {
            conversor.msgInicial();
            opcaoEscolhidaMenu = scanner.nextInt();
            switch (opcaoEscolhidaMenu) {
                case 1:
                    conversor.msgConversaoDolarParaPesoArgentino();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/USD/ARS/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalUSDParaARS();
                    System.out.println(url.HTTPrequest());
                    break;

                case 2:
                    conversor.msgConversaoPesoArgentinoParaDolar();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/ARS/USD/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalARSParaUSD();
                    System.out.println(url.HTTPrequest());
                    break;
                case 3:
                    conversor.msgConversaoDolarParaReal();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/USD/BRL/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalUSDParaBRL();
                    System.out.println(url.HTTPrequest());
                    break;

                case 4:
                    conversor.msgConversaoRealParaDolar();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/BRL/USD/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalBRLParaUSD();
                    System.out.println(url.HTTPrequest());
                    break;

                case 5:
                    conversor.msgConversaoDolarParaPesoColombiano();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/USD/COP/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalDolarParaPesoColombiano();
                    System.out.println(url.HTTPrequest());
                    break;
                case 6:
                    conversor.msgConversaoPesoColombianoParaDolar();
                    valorParaConversao = scanner.nextDouble();
                    url.setUrl(linkAPI + "/pair/COP/USD/"
                            + valorParaConversao);
                    conversor.msgComOResutaldoFinalPesoColombianoParaDolar();
                    System.out.println(url.HTTPrequest());
                    break;

                case 7:
                    maisConversoes = false;
                    conversor.msgAplicacaoEncerrada();
                    break;


            }
        }

    }


}
