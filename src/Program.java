public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79277753125", "Петр");
        res = hashMap.put("+79277753122", "Андрей");
        res = hashMap.put("+79277753122", "Антон");
        res = hashMap.put("+79277753123", "Валерий");
        res = hashMap.put("+79277753124", "Оксана");
        res = hashMap.put("+79277753125", "Кристина");
        res = hashMap.put("+79277753126", "Олег");
        res = hashMap.put("+79277753127", "Вера");
        res = hashMap.put("+79277753128", "Артем");
        res = hashMap.put("+79277753129", "Анжелла");


        //res = hashMap.get("+79277753126");
        
        //hashMap.remove("+79277753128");
        
        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}