
// Aqui trabalhamos com arrays multidimensionais
// É como se fosse uma tabela de excel (lihas x colunas) - bidimensional

package matrizesmultidimensionais;

public class MatrizBidimensional {

    public static void main(String[] args) {
        
        double [][] notasAlunos = new double [3] [4];
        //Aluno 1:
        notasAlunos [0][0] = 10;
        notasAlunos [0][1] = 7;
        notasAlunos [0][2] = 9;
        notasAlunos [0][3] = 9.5;
        //Aluno 2:
        notasAlunos [1][0] = 9;
        notasAlunos [1][1] = 8;
        notasAlunos [1][2] = 7;
        notasAlunos [1][3] = 9;
        //Aluno 3:
        notasAlunos [2][0] = 8;
        notasAlunos [2][1] = 9;
        notasAlunos [2][2] = 10;
        notasAlunos [2][3] = 7;
        
        // Imprimindo uma matriz bidimensional
        for (int i=0; i<notasAlunos.length; i++){
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
        // Manipulando o valor de uma célula da matriz
        notasAlunos[1][3] = 8;
        
        System.out.println(); // quebra de linha
        
        for (int i=0; i<notasAlunos.length; i++){
            for (int j=0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Calculando a média de cada aluno
        System.out.println("Calculando a media de cada aluno");
        System.out.println();
        
        double soma;
        for (int i=0; i<notasAlunos.length; i++){
            
            soma = 0;
            for (int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println(" Media do aluno " + i + " : " + (soma/4));
        }
        
        // outra forma de inicializar um array vetorial:
        double [] notasAluno1 = {7, 8, 9, 10};
        
        // outra forma de iniciar um array bidimensional:
        double [][] notasAluno2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
        System.out.println();
        
        System.out.println("Output da matriz notasAluno2");
        System.out.println();
        
        for (int i=0; i<notasAluno2.length; i++){
            for (int j=0; j<notasAluno2[i].length; j++){
                System.out.print(notasAluno2[i][j] + " | ");
            }
            System.out.println();
        }
    }    
}