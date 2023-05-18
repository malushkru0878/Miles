public class Main {
    public static void main(String[] args) {
        int costTicket = 120; // стоимость билета в рублях
        int milePerCost = 20; // стоимость мили в рублях

        int miles; // обьявление переменной за количество миль
        if (costTicket < 0) {
            System.out.println("Стоимость билета не может быть отрицательной."); // проверка неверных данных
        } else {
            miles = costTicket / milePerCost; // подсчет миль
            System.out.println("Ваше количество миль: " + miles + ". Спасибо за покупку."); // результа
        }
    }

}


