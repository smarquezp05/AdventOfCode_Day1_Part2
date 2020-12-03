import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String[] array = getDataFromFile();
        boolean encontrado = false;
        int i = 0;
        while (encontrado == false) {
            int numI = Integer.parseInt(array[i]);

            for (int j = 0; j < array.length; j++) {
                int numJ = Integer.parseInt(array[j]);

                for (int k = 0; k < array.length; k++) {
                    int numK = Integer.parseInt(array[k]);
                    int suma = numI + numJ + numK;
                    if (suma == 2020 && encontrado == false) {
                        int mult = numI * numJ * numK;
                        System.out.println(numI + " * " + numJ + " * " + numK + " = " + mult);
                        encontrado = true;
                    }
                }
            }
            i++;
        }
    }

    public static String[] getDataFromFile() {
        String[] nums = new String[0];
        File file = new File("src/main/java/puzzleinput1.txt");
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = in.readLine()) != null) {
                nums = str.split(",");
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return nums;
    }
}
