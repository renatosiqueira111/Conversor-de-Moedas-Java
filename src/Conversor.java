import java.util.Scanner;

public class Conversor {

    public static void msgInicial() {
        System.out.println("*****************************************************************\n " +
                "  Seja bem-vindo/a ao Conversor de Moeda =]\n\n        1) Dólar =>> Peso argentino\n        2) Peso argentino =>> Dólar\n        3) Dólar =>> Real brasileiro\n        4) Real brasileiro =>> Dólar \n        5) Dólar =>> Peso colombiano\n        6) Peso colombiano => Dólar\n        7) Sair\n        Escolha uma opção válida:\n*****************************************************************");
    }

    public static void msgAnteriorAConversao() {
        System.out.println("Digite o valor para realização a conversão de moedas:");
    }

    public static void msgConversaoDolarParaPesoArgentino() {
        System.out.println("Digite o valor para realização da conversão de dólar americano para peso argentino:");
    }

    public static void msgConversaoPesoArgentinoParaDolar() {
        System.out.println("Digite o valor para realização da conversão de peso argentino para dólar:");
    }



    public static void msgConversaoRealParaDolar() {
        System.out.println("Digite o valor para realização da conversão de real brasileiro para dólar americano");
    }

    public static void msgConversaoDolarParaReal() {
        System.out.println("Digite o valor para realização da conversão de dólar americano para real:");
    }


    public static void msgComOResutaldoFinalUSDParaBRL() {
        System.out.println("O resultado do valor digitado em dólar para real fica em: ");
    }

    public static void msgComOResutaldoFinalUSDParaARS() {
        System.out.println("O resultado do valor digitado em dólar para peso argentino fica em: ");
    }

    public static void msgComOResutaldoFinalARSParaUSD() {
        System.out.println("O resultado do valor digitado em peso argentino para dólar fica em: ");
    }

    public static void msgComOResutaldoFinalDolarParaPesoColombiano(){
        System.out.println("O resultado do valor digitado em dólar para peso colombiano fica em: ");
    }

    public static void msgComOResutaldoFinalPesoColombianoParaDolar(){
        System.out.println("O resultado do valor digitado em peso colombiano para peso dólar fica em: ");
    }

    public static void msgComOResutaldoFinalBRLParaUSD() {
        System.out.println("O resultado do valor digitado em real brasileiro para dólar americano fica em: ");
    }

    public static void msgConversaoDolarParaPesoColombiano() {
        System.out.println("O resultado do valor digitado em dólar para peso colombiano fica em: ");
    }


    public static void msgConversaoPesoColombianoParaDolar() {
        System.out.println("O resultado do valor digitado em peso colombiano para dólar fica em: ");
    }


    public static void msgAplicacaoEncerrada() {
        System.out.println("Aplicação encerrada.");
    }



}

