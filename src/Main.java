

public class Main {
    public static void main(String[] args) {
        // Стоимость билета (в рублях)
        int ticketPrice = 13676;

        // Количество рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Количество бонусных миль
        int miles = ticketPrice / rublesPerMile;

        // Вывод количества бонусных миль на экран
        System.out.println("Количество начисленных миль: " + miles);
    }
}