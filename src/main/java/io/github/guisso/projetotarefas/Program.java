package io.github.guisso.projetotarefas;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Testes das entidades e outros pontos do sistema.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 09/03/2022
 */
public class Program {

//    // Uso de Logger para geração de logs em arquivos
//    private static final Logger LOGGER;
//
//    static {
//        String caminho = Program.class.getClassLoader()
//                .getResource("logging.properties").getFile();
//        System.setProperty("java.util.logging.config.file", caminho);
//        LOGGER = Logger.getLogger(Program.class.getName());
//    }
//
//    // Exemplo de declaração de constantes -> final
//    public final int GERENTE_RESTAURANTE = 3;
//    public final int GERENTE_PROJETO = 4;
//    
    public static void main(String[] args) {
        
        try {
            int x = 1 / 0;
        } catch(Exception ex) {
            System.out.println(">> " + ex.getMessage());
        }
        

//        // Valores numéricos das enumerações
//        System.out.println(">> "
//                + Papel.LIDER.ordinal());
//        System.out.println(">> "
//                + Papel.MEMBRO.ordinal());
//
//        // Atribuição de enumeração a atributo do objeto
//        Atuacao a = new Atuacao();
////        a.setPapel(Papel.LIDER);
//        a.setPapel(Papel.MEMBRO);
//
//        // Condicional com enumeração
//        if (a.getPapel() == Papel.LIDER) {
//            System.out.println("É um líder");
//        } else {
//            System.out.println("Não é um líder");
//        }
//
//        // Condicional com enumeração
//        switch (a.getPapel()) {
//            case LIDER:
//                System.out.println("É um líder.");
//                break;
//            case MEMBRO:
//                System.out.println("É um membro comum.");
//                break;
//            default:
//                // Erro (exceção)
//                throw new AssertionError("Tipo desconhecido.");
//        }
//
        //
        // Testes de entidades
        //
        Projeto marcenaria = new Projeto();
        System.out.println("(0) " + marcenaria);

        Tarefa orcarTintas
                = new Tarefa("Orçar tintas", LocalDate.of(2022, 3, 30));
        System.out.println("-- " + orcarTintas);

        Tarefa comprarTintas
                = new Tarefa("Comprar tintas", LocalDate.of(2022, 3, 22));
        System.out.println("-- " + comprarTintas);

        Tarefa abastecer
                = new Tarefa("Abastecer veículo", LocalDate.of(2022, 3, 1));
        // todo Testar: sem data de conclusão; conclusão em dia; e conclusão em atraso
        abastecer.setConclusao(LocalDate.of(2022, 3, 2));
        System.out.println("-- " + abastecer);

//        System.out.println(">> " + orcarTintas.hashCode());
//        System.out.println(">> " + comprarTintas.hashCode());
//
//        System.out.println(">> " + orcarTintas.equals(comprarTintas));
//        System.out.println(">> " + comprarTintas.equals(orcarTintas));
//
        marcenaria.adicionarAExecutar(orcarTintas);
        marcenaria.adicionarAExecutar(comprarTintas);
        marcenaria.adicionarAExecutar(abastecer);
        System.out.println("(1) " + marcenaria);

        // Tenta...
        try {
            // ... remover uma tarefa existente (descrição e data
            // limite idênticos aos de uma tarefa já adicionada)
            marcenaria.removerAExecutar(
                    new Tarefa("Abastecer veículo", LocalDate.of(2022, 3, 1)));
            System.out.println("(2) " + marcenaria);

            // ... remover uma tarefa já removida
            marcenaria.removerAExecutar(abastecer);
            System.out.println("(3) " + marcenaria);

        } catch (RuntimeException ex) {
//            LOGGER.log(Level.WARNING, null, ex);
            System.out.println("<1> " + ex);
        }

        // Tenta...
        try {
            // ... mover uma tarefa existente de uma lista para outra
            marcenaria.moverParaEmExecucao(orcarTintas);

        } catch (RuntimeException ex) {
//            LOGGER.log(Level.WARNING, null, ex);
            System.out.println("<2> " + ex);
        }

        // Tenta...
        try {
            // ... mover uma tarefa vazia (não existente!) para concluídas
            marcenaria.moverParaConcluidas(new Tarefa());

            // ... mover uma tarefa existente de uma lista para outra
            // No entanto, esta instrução não é executada porque
            // a anterior gera uma exceção e interrompe a execução
            // deste bloco de procedimentos
            marcenaria.moverParaConcluidas(orcarTintas);

        } catch (RuntimeException ex) {
//            LOGGER.log(Level.WARNING, null, ex);
            System.out.println("<3> " + ex);
            
        } finally {
            // Este bloco SEMPRE é executado, havendo exceção ou não
            System.out.println("> Nova tentativa de movimentação de 'Orçar tintas' a seguir");
        }
        
        // Tenta...
        try {
            // ... mover uma tarefa existente de uma lista para outra
            marcenaria.moverParaConcluidas(orcarTintas);

        } catch (RuntimeException ex) {
//            LOGGER.log(Level.WARNING, null, ex);
            System.out.println("<4> " + ex);
        } finally {
            // Este bloco SEMPRE é executado, havendo exceção ou não
            System.out.println("> Tentativa de movimentação de 'Orçar tintas' executada");
        }

        System.out.println("!! Programa não travou, mesmo com exceções !!");
        
        System.out.println("(4) " + marcenaria);
    }

}
