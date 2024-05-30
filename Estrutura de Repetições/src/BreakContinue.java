public class BreakContinue {
    public static void main(String[] args) {
        for (int numero= 1; numero <=5; numero++){
            if(numero == 3)
                continue; // continua o código
                //break; interrompe o código
            System.out.println(numero);
        }
    }
}
