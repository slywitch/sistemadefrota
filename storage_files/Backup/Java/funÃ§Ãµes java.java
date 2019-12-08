

//resolução de tela

import java.awt.Dimension;
import java.awt.Toolkit;

public class NetUtilities {
    public static void main(String[] args) {
      try {
         Toolkit toolkit = Toolkit.getDefaultToolkit();
         Dimension dimension = toolkit.getScreenSize();
         double height = dimension.getHeight();
         double width = dimension.getWidth();
         System.out.println("Resolução: " + width + " por " + height);
      }   catch (Exception e) {
          e.printStackTrace();
      }
   }
}


//validando IE de SP

      private static boolean validaIE(String ie) {
         boolean ret = false;
         if (((ie.substring(0, 1)).toUpperCase()) == "P") {
            String s = ie.substring(1, 9);
            int[] nro = new int[12];
            for (int i = 0; i <= 7; i++)
               nro[i] = new Integer(s.substring(i, i + 1)).intValue();
            int soma = (nro[0] * 1) + (nro[1] * 3) + (nro[2] * 4)
                  + (nro[3] * 5) + (nro[4] * 6) + (nro[5] * 7) + (nro[6] * 8)
                  + (nro[7] * 10);
            int dig = soma % 11;
            if (dig >= 10)
               dig = 0;
            boolean resultado = (dig == nro[8]);
            if (!resultado)
               ret = false;
         } else {
            if (ie.length() < 12) {
               ret = false;
            } else {
               int[] nro = new int[12];
               for (int i = 0; i <= 11; i++)
                  nro[i] = new Integer(ie.substring(i, i + 1)).intValue();
               int soma = (nro[0] * 1) + (nro[1] * 3) + (nro[2] * 4)
                     + (nro[3] * 5) + (nro[4] * 6) + (nro[5] * 7)
                     + (nro[6] * 8) + (nro[7] * 10);
               int dig = soma % 11;
               if (dig >= 10)
                  dig = 0;
               boolean resultado = (dig == nro[8]);
               if (!resultado) {
                  ret = false;
               } else {
                  soma = (nro[0] * 3) + (nro[1] * 2) + (nro[2] * 10)
                        + (nro[3] * 9) + (nro[4] * 8) + (nro[5] * 7)
                        + (nro[6] * 6) + (nro[7] * 5) + (nro[8] * 4)
                        + (nro[9] * 3) + (nro[10] * 2);
                  dig = soma % 11;
                  if (dig >= 10)
                     dig = 0;
                  ret = (dig == nro[11]);
               }
            }
         }
         if (ret) {
            System.out.println("A I.E. [" + ie + "]   é   válida.");
         } else {
            System.out.println("A I.E. [" + ie + "]   é inválida.");
         }
         return ret;
      }