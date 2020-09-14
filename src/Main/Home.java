package Main;

import Classes.Aluno;
import Classes.AlunoMedio;
import Classes.AlunoSuperior;
import Classes.ErroNotaErrada;
import Utilitario.Teclado;

public class Home {

    public static Aluno alunosCadastrados[] = new Aluno[5];
    public static Aluno aluno;

    public static void menuprincipal() {
        System.out.println("|--------------------Menu-----------------------|");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Deletar");
        System.out.println("4 - Modificar");
        System.out.println("5 - Lançamento de notas");
        System.out.println("6 - Sair \n");

        int opcao = Teclado.leInt("Digite uma opção : ");
        switch (opcao) {
            case 1:
                cadastrarAluno();
                break;
            case 2:
                buscaAluno();
                break;
            case 3:
                deletarAluno();
                break;
            case 4:
                modificaAluno();
                break;
            case 5:
                lancarNotasAlunos();
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void cadastrarAluno() {
        System.out.println("--------------------Cadastrar-----------------------");
        System.out.println("1 - Aluno Ensino Superior");
        System.out.println("2 - Aluno Ensino Medio");
        System.out.println("3 - Voltar\n");

        int opcao = Teclado.leInt("Digite uma opcao: ");

        switch (opcao) {
            case 1:
                aluno = new AlunoSuperior();
                aluno.setMatricula(Teclado.leString("Digite a Matricula: "));
                System.out.println("\n");
                aluno.setNome(Teclado.leString("Digite o Nome: ").toLowerCase());
                System.out.println("\n");
                aluno.setNivelEscolaridade("Superior");

                for (int i = 0; i < 5; i++) {
                    if (alunosCadastrados[i] == null) {
                        alunosCadastrados[i] = aluno;
                        break;
                    }
                }
                imprimirTeste();
                cadastrarAluno();
                break;

            case 2:
                aluno = new AlunoMedio();
                aluno.setMatricula(Teclado.leString("Digite a Matricula: "));
                System.out.println("\n");
                aluno.setNome(Teclado.leString("Digite o Nome completo: ").toLowerCase());
                System.out.println("\n");
                aluno.setNivelEscolaridade("Medio");

                for (int i = 0; i < 5; i++) {
                    if (alunosCadastrados[i] == null) {
                        alunosCadastrados[i] = aluno;
                        break;
                    }
                }
                imprimirTeste();
                cadastrarAluno();
                break;
            case 3:
                menuprincipal();
                break;
            default:
                System.out.println("Opção invalida");
                cadastrarAluno();
        }
    }

    public static void buscaAluno() {
        imprimirTeste();
        System.out.println("--------------------Resultado-----------------------");

        for (int i = 0; i < 5; i++) {
            if (alunosCadastrados[i] != null) {
                System.out.println("Nome: " + alunosCadastrados[i].getNome() + "   |   " + " Nota Final: " + alunosCadastrados[i].NotaFinal());
            }
        }
        menuprincipal();
    }

    public static void modificaAluno() {
        System.out.println("--------------------Pesquisar-----------------------");
        System.out.println("1 - Matricula do aluno a ser modificado");
        System.out.println("2 - Nome do aluno a ser modificado");
        System.out.println("3 - Voltar\n");

        int opcao = Teclado.leInt("Digite uma opção : ");
        switch (opcao) {
            case 1:
                String matricula = Teclado.leString("Digite a Matricula a ser procurada: ");
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getMatricula().equals(matricula)) {
                                alunosCadastrados[i].setMatricula(Teclado.leString("Digite a nova Matricula: "));
                                alunosCadastrados[i].setNome(Teclado.leString("Digite o novo Nome: ").toLowerCase());
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    modificaAluno();
                }
                modificaAluno();
                break;
            case 2:
                String nome = Teclado.leString("Digite o nome completo a ser procurado: ");
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getNome().equals(nome)) {
                                alunosCadastrados[i].setMatricula(Teclado.leString("Digite a nova Matricula: "));
                                alunosCadastrados[i].setNome(Teclado.leString("Digite o novo Nome: ").toLowerCase());
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    modificaAluno();
                }
                modificaAluno();
                break;
            case 3:
                menuprincipal();
                break;
            default:
                System.out.println("Opção invalida");
                modificaAluno();
        }

    }

    public static void deletarAluno() {

        System.out.println("--------------------Pesquisar-----------------------");
        System.out.println("1 - Matricula do aluno a ser deletado");
        System.out.println("2 - Nome do aluno a ser deletado");
        System.out.println("3 - Voltar\n");

        int opcao = Teclado.leInt("Digite uma opção : ");
        switch (opcao) {
            case 1:
                String matricula = Teclado.leString("Digite a Matricula a ser procurada: ");
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getMatricula().equals(matricula)) {
                                alunosCadastrados[i] = null;
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    deletarAluno();
                }
                deletarAluno();
                break;
            case 2:
                String nome = Teclado.leString("Digite o nome completo a ser procurado: ");
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getNome().equals(nome)) {
                                alunosCadastrados[i] = null;
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    deletarAluno();
                }
                deletarAluno();
                break;
            case 3:
                menuprincipal();
                break;
            default:
                System.out.println("Opção invalida");
                deletarAluno();
        }

    }

    public static void lancarNotasAlunos() {

        System.out.println("--------------------Pesquisar-----------------------");
        System.out.println("1 - Matricula do aluno para lançar nota");
        System.out.println("2 - Nome do aluno para lançar nota");
        System.out.println("3 - Voltar\n");

        int opcao = Teclado.leInt("Digite uma opção : ");
        switch (opcao) {
            case 1:
                String matricula = Teclado.leString("Digite a Matricula a ser procurada: ");
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getMatricula().equals(matricula)) {
                                try {
                                    alunosCadastrados[i].calculaNota();
                                } catch (ErroNotaErrada erro) {
                                    System.out.println(erro.getMessage());
                                }
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    lancarNotasAlunos();
                }

                lancarNotasAlunos();
                break;
            case 2:
                String nome = Teclado.leString("Digite o nome completo a ser procurado:").toLowerCase();
                if (isEmpty() != 5) {
                    for (int i = 0; i < 5; i++) {
                        if (alunosCadastrados[i] != null) {
                            if (alunosCadastrados[i].getNome().equals(nome)) {
                                try {
                                    alunosCadastrados[i].calculaNota();
                                } catch (ErroNotaErrada erro) {
                                    System.out.println(erro.getMessage());
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Nao foi cadastrado nenhum aluno ainda !!!!!");
                    lancarNotasAlunos();
                }
                lancarNotasAlunos();
                break;
            case 3:
                menuprincipal();
                break;
            default:
                System.out.println("Opção invalida");
                lancarNotasAlunos();
        }

    }

    public static int isEmpty() {
        int aux = 0;
        for (int i = 0; i < 5; i++) {
            if (alunosCadastrados[i] == null) {
                aux++;
            }
        }
        return aux;
    }

    public static void imprimirTeste() {
        for (int i = 0; i < 5; i++) {
            System.out.println(alunosCadastrados[i]);
        }
    }

    public static void main(String[] args) {
        menuprincipal();
    }

}
