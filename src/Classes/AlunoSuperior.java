/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Main.Home;
import Utilitario.Teclado;

/**
 *
 * @author igor_
 */
public class AlunoSuperior extends Aluno {

    private String NotaFinal;

    @Override
    public void calculaNota() {
        int aux = 0;
        int media = 0;
        for (int i = 0; i < 5; i++) {
            String nota = Teclado.leString("Digite a " + (i + 1) + "º" + " nota").toUpperCase();

            if (nota.equals("A") || nota.equals("B") || nota.equals("C") || nota.equals("D") || nota.equals("F")) {
                if (nota.equals("A")) {
                    aux += 9;
                }
                if (nota.equals("B")) {
                    aux += 8;
                }
                if (nota.equals("C")) {
                    aux += 7;
                }
                if (nota.equals("D")) {
                    aux += 6;
                }
                if (nota.equals("F")) {
                    aux += 5;
                }
            } else {
                throw new ErroNotaErrada("Tipo de nota errado para o aluno");
            }    
        }
        media = (aux / 5);
        if (media >= 9) {
            this.NotaFinal = "A";
        }
        if (media >= 8 && media < 9) {
            this.NotaFinal = "B";
        }
        if (media >= 7 && media < 8) {
            this.NotaFinal = "C";
        }
        if (media >= 6 && media < 7) {
            this.NotaFinal = "D";
        }
        if (media < 6) {
            this.NotaFinal = "F";
        }
    }

    @Override
    public String NotaFinal() {
        return this.NotaFinal;
    }

}
