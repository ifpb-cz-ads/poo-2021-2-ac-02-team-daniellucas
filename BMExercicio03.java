public class BMExercicio03 {
    
    public static void main(String[] args) {
        // Letra A
        double precoItem1 = 2.95;
        double precoItem2 = 3.50;

        // Letra B
        System.out.println("O item 1 custa: " + precoItem1);
        System.out.println("O item 2 custa: " + precoItem2);

        // Letra C
        double total = precoItem1 + precoItem2;
        System.out.println("O custo total é: " + total);

        // Letra D
        final double TAXA = 8.25 / 100;
        double taxaCalculada = TAXA * total;
        System.out.println("A taxa adicionada é: " + taxaCalculada);

        // Letra E
        precoItem1 += taxaCalculada;
        precoItem2 += taxaCalculada;
        double novoCusto = precoItem1 + precoItem2;

        // Letra F
        boolean muitoCaro = novoCusto > 10;
        System.out.println("O preco é muito caro: " + muitoCaro);
    }

}