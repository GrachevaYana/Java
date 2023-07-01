import java.util.HashMap;
import java.util.Map;

public class hw_6_main {
    public static void main(String[] args) {
        int num = 0;
        Map<Integer, String> findList = new HashMap<>();
        findList.put(1, "Производитель");
        findList.put(2, "Диагональ экрана");
        findList.put(3, "Производитель процессора");
        findList.put(4, "Тип видеокарты");
        findList.put(5, "Тип жесткого диска");
        findList.put(6, "Цена");
        findList.put(7, "Выход");
        System.out.println("Выберите вариант поиска из списка:");
        while (num != 7) {
            num = hw_6_database.findChoice(findList);
            new hw_6_database().filterList(num);
        }
        System.out.println("Благодарю за использование!");
    }
}