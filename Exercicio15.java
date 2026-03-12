
public class Exercicio15 {

    public static void main(String[] args) {
        int nota, frequencia;

        nota = 60;
        frequencia = 75;

        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else if (frequencia >= 75) {
            if (nota >= 60) {
                System.out.println("Aprovado!");
            } else if (nota < 60) {
                if (nota >= 40) {
                    System.out.println("Recuperação.");
                } else if (nota < 40) {
                    System.out.println("Reprovado por nota.");
                }
            }
        }
    }
}
