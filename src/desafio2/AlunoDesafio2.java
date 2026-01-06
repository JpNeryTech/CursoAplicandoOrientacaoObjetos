package desafio2;

public class AlunoDesafio2 {
    private String aluno;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota() {
        return nota1;
    }

    public void setNota(double nota) {
        this.nota1 = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void calcularMedia() {

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(String.format(
                "Sendo assim a media do aluno %s é: %.2f"
                ,aluno
                ,media
        ));

    }

}
