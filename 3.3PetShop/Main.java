import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args){


        var option = -1;

        do {
            System.out.println("<===Escolha as opções===>");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abaster a máquina com xampoo");
            System.out.println("4 - Verficar o nível de água");
            System.out.println("5 - Verificar o nível de xampoo");
            System.out.println("6 - Verificar se tem pet dentro da máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addxampoo();
                case 4 -> {
                    var amount = petMachine.getWater();
                    System.out.println("A máquina no momento tem " + amount + " litro(s) de água");
                }
                case 5 -> {
                    var amount = petMachine.getXampoo();
                    System.out.println("A máquina no momento tem " + amount + " litro(s) de xampoo");
                }
                case 6 -> {
                    boolean hasPet = petMachine.hasPet();
                }
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }


        }while (true);
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do seu pet");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado dentro da máquina");
    }
}
