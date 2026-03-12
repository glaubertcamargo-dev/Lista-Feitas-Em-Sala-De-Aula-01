
public class Exercicio14 {

    public static void main(String[] args) {

        int temperatura = 40;
        if (temperatura < 10) {
            System.out.println("Frio");
        } else if (temperatura <= 25) {
            System.out.println("Temperatura agradável.");
        } else { 
            if (temperatura <= 35) {
                System.out.println("Quente.");
            } else { 
                System.out.println("Muito quente.");
            }
        }
    }
}
