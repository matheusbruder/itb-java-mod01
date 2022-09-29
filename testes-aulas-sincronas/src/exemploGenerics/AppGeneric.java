package exemploGenerics;

import java.util.ArrayList;
import java.util.List;

public class AppGeneric {
    public static void main(String[] args) {
        MyClass<Integer> obj1 = new MyClass<>(222);
        MyClass<String> obj2 = new MyClass<>("Minha string");
        MyClass<Float> obj3 = new MyClass<>();
        obj3.setObj(23.5F);

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());
        System.out.println(obj3.getObj());

        // Não é uma boa prática, embora seja uma possibilidade
        List<?> lista = new ArrayList<>();

    }
}
