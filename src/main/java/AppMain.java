import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppMain {
    static  void addMang(List<Integer> a,Scanner sc){
        System.out.print("Nhap do dai mang : ");
        int length = sc.nextInt();
        for (int i = 0; i < length ; i++){
            System.out.print("Nhap du lieu thu " + i + ": ");
            a.add(sc.nextInt());
        }
        System.out.println("");
    }
    static void merge(List<Integer> a, List<Integer> b){
        a = a.stream().sorted().collect(Collectors.toList());
        b = b.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        a.addAll(b);
        System.out.println(a.toString());

    }
    static  void   intersection(List<Integer> a, List<Integer> b){
        List<Integer> newa = new ArrayList<>();
        List<Integer> newb = a.size() > b.size() ? a : b;
        for (int i: newb){
            Serializable serializable = a.contains(i) && b.contains(i) ? newa.add(i) : "";
        }
        System.out.println(newa.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayListA = new ArrayList<>();
        List<Integer> arrayListB = new ArrayList<>();

        addMang(arrayListA,sc);
        addMang(arrayListB,sc);

        merge(arrayListA,arrayListB);

        intersection(arrayListA,arrayListB);

    }
}
