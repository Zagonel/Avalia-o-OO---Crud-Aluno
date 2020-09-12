/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author igor_
 */
public class AlunoMedio extends Aluno{

    private double notas[];

    private double notaFinal;

    private double calculaMediaAritmetica(int qtdNotas) {
        double x = 0;

        return x;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String NotaFinal() {        
        String nota = String.valueOf(this.notaFinal);
        return nota;        
    }

}
