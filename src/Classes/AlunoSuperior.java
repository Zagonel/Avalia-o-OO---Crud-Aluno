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
public class AlunoSuperior extends Aluno {

    private String notaConceito[];
    private String NotaFinal;

    private void calculaNotaConceito(int qtdNotas) {

    }

    public String[] getNotaConceito() {
        return notaConceito;
    }

    public void setNotaConceito(String[] notaConceito) {
        this.notaConceito = notaConceito;
    }

    @Override
    public String NotaFinal() {
        return this.NotaFinal;
    }

}
