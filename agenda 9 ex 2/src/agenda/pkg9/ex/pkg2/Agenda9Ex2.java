package agenda.pkg9.ex.pkg2;

import javax.swing.JOptionPane;
public class Agenda9Ex2 {

    public static void main(String[] args) {
    
//    declarar variaveis

     int [] num = new int [20];
    int cont;
  
//   ENTRADA COM FOR

    for (cont = 0; cont < 20; cont++){
    num [cont] = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
     }
   
//   PROCESSAMENTO VALORES PARES

    for (cont = 0; cont < 20; cont++){
        if (num[cont] % 2 == 0){
     num [cont] = (num[cont] * 2);
        }
    }
//   SAÍDA  COM FOR E DISPLAY
    for (cont = 0; cont < 19; cont++){
    JOptionPane.showMessageDialog(null, "resultado de num[" + cont + "] " + num[cont]  );
    }

}
    }
    
