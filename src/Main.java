import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MainApp {
    public static void main(String[] args){
//        List<Punct> puncte=new ArrayList<Punct>();
//        puncte.add(new Punct(1,2));
//        puncte.add(new Punct(3,4));
//        puncte.add(new Punct(5,6));
//
//        System.out.println("Lista contine punctele:");
//        for(Punct p:puncte) {
//            System.out.println(p);
//        }
//
//        puncte.remove(0);
//
//        System.out.println("Dupa stergerea primului element "+"lista contine punctele:");
//        for (int i=0;i<puncte.size();i++)
//            System.out.println(puncte.get(i));
        //Fișierul de intrare in.txt conține mai multe linii, pe fiecare linie aflându-se coeficienții
        //unei parabole. Să se citească informația din fișierul de intrare și pentru fiecare linie să se creeze
        //câte un obiect de tip Parabola care se va adăuga unei colecții de tip List. Colecția va fi apoi
        //traversată și pentru fiecare element se va afișa parabola sub forma unei funcții și apoi vârful
        //parabolei. Pentru două parabole din colecție se va afișa mijlocul segmentului care le unește
        //vârfurile și lungimea segmentului care le unește vârfurile apelând metodele dezvoltate în clasa
        //Parabola
        File parabole=new File("in.txt");
        Scanner myScanner =new Scanner(parabole);
        while (myScanner.hasNextLine()) {

        }
    }
}
