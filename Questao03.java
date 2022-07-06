package testejava;

//import java.io.*; <-- Import desnecessario
//import javax.swing.JOptionPane; <-- Import desnecessario
import javax.swing.*;

public class Questao03 {
  public static void teste() {
      // public void teste() <- Static = Atributos e métodos pertencem à classe, em vez de um objeto
      System.out.println("Im am a constructor");
      runza();
  }
  private static void runza() {
      //private void runza() <- Static = Atributos e métodos pertencem à classe, em vez de um objeto
      String str = JOptionPane.showInputDialog("What's your name");
      JOptionPane.showMessageDialog(null, "Your name is: " + str);
  }
  public static void main(String[] args) {
      //public static void main(String args[]) <-- metodo main escrito errado
      //Teste tst = new Teste(); <- Acima, criamos dois método estático, o que significa que ele pode ser acessado sem criar um objeto da classe.
      teste();
  }
}
