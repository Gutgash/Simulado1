import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Mazda("MX3", 180f, 20000.00f, "1991 - 1998"));
        carros.add(new Nissan("Silvia S15", 235f, 150000.00f, "2002"));
        carros.add(new Subaru("Impreza", 197f, 40000.00f, "1993-"));

        System.out.println("CARROS");
        for (Carro carro: carros) {
            if(carro instanceof Mazda) {
                System.out.println("MAZDA");
            } else if (carro instanceof Nissan) {
                System.out.println("NISSAN");
            } else {
                System.out.println("SUBARU");
            }
            System.out.println(carro.getModelo());
            System.out.println(carro.getVelocidade());
            System.out.println(carro.getPreco());
            System.out.println();
        }
        System.out.println("----------------------");
    }
}