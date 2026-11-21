package matrizes.app.service;

import javax.swing.JOptionPane;

public class MatrizServise {

        public void exercutarmatriz(){
            int[][] matrizA = new int[2][2];        
            int[][] matrizB = new int[2][2];
            long[][] resultado = new long[2][2];

            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++){
                    matrizA[i][j] = lerInteiro("Digite o valor da matriz A: ");
                    matrizB[i][j] = lerInteiro("Digite o valor da matriz B: ");
                }   
            for (int i = 0; i <2; i++){
                for (int j = 0; j < 2; j++){
                    resultado[i][j] = (long) matrizA[i][j] + matrizB[i][j];
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Resultado da soma das matrizes:\n");
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++){
                    sb.append(resultado[i][j]).append(" ");
                }
                sb.append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    private Integer lerInteiro(String mensagem) {
        while (true) {
            String valor = JOptionPane.showInputDialog(mensagem);
            if (valor == null) throw new java.util.concurrent.CancellationException();
            try { return Integer.valueOf(valor.trim()); }
            catch (NumberFormatException e) { JOptionPane.showMessageDialog(null, "Digite um número inteiro válido."); }
        }
    }
}
