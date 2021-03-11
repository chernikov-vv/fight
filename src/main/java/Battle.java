import java.util.Random;


public class Battle {

    Random random = new Random();
    private final int count = 5 + random.nextInt(7);
    protected int toDo;
    private boolean isBattle = true;

    protected void start() {
        Shooter ulrick = new Shooter();
        Wizard odin = new Wizard();

        ulrick.name = "Ульрик";
        ulrick.specialization = "Стрелок";

        odin.name = "Один";
        odin.specialization = "Маг";


        for (int i = 0; i < count; i++) {   // Не судите строго симулятор боя, я старался))
            if (isBattle) {                 // Атака первого воина
                toDo = random.nextInt(4);

                switch (toDo) {
                    case 0:
                        System.out.println(odin.fireBall());
                        break;
                    case 1:
                        System.out.println(odin.iceBall());
                        break;
                    case 2:
                        System.out.println(odin.iceArrow());
                        break;
                    default:
                        System.out.println(odin.flash());
                        break;
                }

                toDo = random.nextInt(4);
                switch (toDo) {
                    case 0:
                        System.out.println(ulrick.bendDown());
                        break;
                    case 1:
                        System.out.println(ulrick.jump());
                        break;
                    case 2:
                        System.out.println(ulrick.run());
                        isBattle = false;
                        break;
                    default:
                        System.out.println(ulrick.death());
                        isBattle = false;
                        break;
                }

                if (isBattle) {               // Атака второго воина
                    toDo = random.nextInt(3);
                    switch (toDo) {
                        case 0:
                            System.out.println(ulrick.hailOfArrows());
                            break;
                        case 1:
                            System.out.println(ulrick.shootArrow());
                            break;
                        default:
                            System.out.println(ulrick.throwsABow());
                            break;
                    }

                    toDo = random.nextInt(5);
                    switch (toDo) {
                        case 0:
                            System.out.println(odin.invisible());
                            break;
                        case 1:
                            System.out.println(odin.iceShield());
                            break;
                        case 2:
                            System.out.println(odin.fireShield());
                            break;
                        case 3:
                            System.out.println(odin.run());
                            isBattle = false;
                            break;
                        default:
                            System.out.println(odin.death());
                            isBattle = false;
                            break;
                    }
                }
            }
        }
        System.out.println("\nКонец боя");
    }
}


