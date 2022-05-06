import classes.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente();
        Cliente c2;
        
        int valor22 = 12212;
        
        System.out.println(c1.cpf);
 
        // tipo variavel;

        int[] array_java1 = new int[5];

        array_java1[0] = 12;
        array_java1[1] = 12;
        array_java1[2] = 12;
        array_java1[3] = 12;
        array_java1[4] = 12;

        int[] array_direto = { 1, 2, 3, 4, 5 };

        int[][] matrizes = new int[2][4];

        matrizes[0][0] = 1;

        System.out.println(matrizes[0].length);

    }
}
