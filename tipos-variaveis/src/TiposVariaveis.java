public class TiposVariaveis {
    public static void main(String[] args) throws Exception{

        String meuNome = "Kauê Rodrigues";

        byte idade = 123;
        short ano = 2024;
        int cep = 07130130;
        long cpf =  32427688843L; // tipo Long é obrigatório terminar com L
        float pi = 3.14F; //tipo Float é obrigatório terminar com F
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}

    