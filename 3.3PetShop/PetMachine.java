public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int xampoo = 10;

    private Pet pet;



    public void takeAShower(){
        if (this.pet == null) {
            System.out.println("Coloque seu pet na máquina para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.xampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");


    }

    public void addWater(){
        if (water == 30){
            System.out.println("Reservatório de agua no limite máximo");
            return;
        }

        water += 2;
    }

    public void addxampoo() {
        if (xampoo == 10) {
            System.out.println("Reservatório de xampoo no limite máximo");
            return;
        }

        xampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getXampoo() {
        return xampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, é necessário limpá-la para o uso");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " esta tomando banho nesse momento");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo");

        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.xampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
