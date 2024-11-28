public class Main {
    public static void main(String[] args) {
    Materia poo = new Materia("Programação Orientada a Objetos",5.0f,5.0f);

    Calculo calculo = new Calculo();
    double mediaSemestral = calculo.CalculaMS(poo);
        System.out.println("MS: " + calculo.CalculaMS(poo));
    calculo.PassouSemExame(poo);
    double mediaFinal = calculo.CalculaMF(poo,1.0);
        System.out.println("MF: " + mediaFinal);
        System.out.println(calculo.PassouSemExame(poo));
        System.out.println("Faltou: " + calculo.Faltou());

    }
}