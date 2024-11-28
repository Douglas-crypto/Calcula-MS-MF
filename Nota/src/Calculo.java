public class Calculo {
    private double MS;
    private double MF;
    private double notaExame;

    public double CalculaMS(Materia materia){
        this.MS = (materia.getNp1() + materia.getNp2()) / 2.0;
        return this.MS;
    }

    public double CalculaMF(Materia materia,double NotaExame){
        this.notaExame = NotaExame;
        MF = (MS + NotaExame) / 2.0;
        return MF;
    }

    public boolean PassouSemExame(Materia materia){
        if (MF >= 5.0f){
            System.out.println("Passou na matéria, Boas férias");
            return true;
        } else {
            System.out.println("Você não passou na matéria");
            return false;
        }
    }

    public double Faltou(){
        double pontofaltou = MF - 10;
        return pontofaltou;
    }
}
