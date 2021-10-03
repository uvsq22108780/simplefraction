import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            FractionSimple r = new FractionSimple();

            System.out.println("entrer la valeur du numérateur \n");
            Scanner scanner = new Scanner(System.in);
            Float num = scanner.nextFloat();
            r.seta(num);

            System.out.println("entrer la valeur du dénominateur \n");
            float denum = scanner.nextFloat();
            assert r.getb() !=0;
            r.affichage();
            r.setb(denum);


        }

}
