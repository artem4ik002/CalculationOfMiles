
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 700; //Стоимость билета
        int rublesOneMile = 20; // Количество рублей для одной бонусной мили
        int x = ticketPrice / rublesOneMile; // Количество начисленных миль за купленный билет

        System.out.println("Количество начисленных миль за купленный билет составляет " + x);
    }
}