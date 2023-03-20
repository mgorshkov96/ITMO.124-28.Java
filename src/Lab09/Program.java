package Lab09;
import java.util.*;

public class Program {
    public static void main(String[] args){
        System.out.println("##Exercise2");
        List<Integer> notUniqueList = new ArrayList<>();
        notUniqueList.add(1);
        notUniqueList.add(1);
        notUniqueList.add(2);
        notUniqueList.add(2);
        notUniqueList.add(3);
        notUniqueList.add(3);
        notUniqueList.add(4);
        notUniqueList.add(4);
        notUniqueList.add(5);
        notUniqueList.add(5);
        System.out.println(notUniqueList);
        System.out.println(listWithoutDuplicate(notUniqueList));

        System.out.println("##Exercise3");
        List<String> arrayList = new ArrayList<>();
        long arrayAddStartTime = System.currentTimeMillis();
        arrayList = addToList(arrayList);
        System.out.println("arrayList заполнен за " + (System.currentTimeMillis() - arrayAddStartTime) + " миллисек.");

        List<String> linkedList = new LinkedList<>();
        long linkedAddStartTime = System.currentTimeMillis();
        linkedList = addToList(linkedList);
        System.out.println("linkedList заполнен за " + (System.currentTimeMillis() - linkedAddStartTime) + " миллисек.");

        long arrayChooseStartTime = System.currentTimeMillis();
        chooseElements(arrayList);
        System.out.println("Элементы из arrayList выбраны за " + (System.currentTimeMillis() - arrayChooseStartTime) +
                " миллисек.");

        long linkedChooseStartTime = System.currentTimeMillis();
        chooseElements(arrayList);
        System.out.println("Элементы из linkedList выбраны за " + (System.currentTimeMillis() - linkedChooseStartTime) +
                " миллисек.");

        System.out.println("##Exercise4");
        User ivan = new User("Иван");
        User pavel = new User("Павел");
        User sergey = new User("Сергей");
        Map<User, Integer> userScores = new HashMap<>();
        userScores.put(ivan, 3);
        userScores.put(pavel, 2);
        userScores.put(sergey, 5);
        Integer scores = getScores(userScores);
        if (scores != null){
            System.out.println("Количество очков: " + scores);
        } else {
            System.out.println("Такого юзера не существует");
        }


    }

    public static List<Integer> listWithoutDuplicate(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        return uniqueList;
    }

    public static List<String> addToList(List<String> list){
        for (int i = 0; i < 1000000; i++){
            list.add(String.valueOf(i + 25));
        }
        return list;
    }

    public static void chooseElements(List<String> list){
        Random random = new Random();
        int randomIndex;
        String container;
        for (int i = 0; i < 100000; i++){
            randomIndex = random.nextInt(list.size());
            container = list.get(randomIndex);
        }
    }

    public static Integer getScores(Map<User, Integer> userScores){
        Integer result = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя юзера: ");
        String userName = sc.nextLine();

        for (Map.Entry<User, Integer> pair : userScores.entrySet()) {
            User pairKey = pair.getKey();
            Integer pairValue = pair.getValue();

            if (userName.equals(pairKey.getName())){
                result = pairValue;
            }
        }
        return result;
    }
}
