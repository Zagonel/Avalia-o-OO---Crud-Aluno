/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Utilitario.Teclado;
import java.util.InputMismatchException;

/**
 *
 * @author igor_
 */
public class AlunoMedio extends Aluno {

    private double notas[] = new double[5];

    private double notaFinal;

    @Override
    public void calculaNota() {

        for (int i = 0; i < 5; i++) {
            try {
                double nota = Teclado.leDouble("Digite a " + (i + 1) + "º" + " nota");
                notas[i] = nota;
            } catch (InputMismatchException erro) {
                throw new ErroNotaErrada("Tipo de nota errado para o aluno");
            }
        }

        double aux = 0;

        for (int i = 0; i < 5; i++) {
            aux += notas[i];
            this.notaFinal = (aux / 5);
        }

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
