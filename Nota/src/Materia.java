public class Materia {
    private final String nome;
    private final Float np1;
    private final Float np2;


    //Constructor
    public Materia(String nome, Float np1, Float np2) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Matéria sem nome não existe");
        }
        this.nome = nome;
        this.np1 = np1;
        this.np2 = np2;
    }

    public String getNome() {
        return this.nome;
    }
    public Float getNp1() {
        return this.np1;
    }
    public Float getNp2() {
        return this.np2;
    }
 }

