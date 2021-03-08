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
                    case (0) -> System.out.println(odin.fireBall());
                    case (1) -> System.out.println(odin.iceBall());
                    case (2) -> System.out.println(odin.iceArrow());
                    default -> System.out.println(odin.flash());
                }

                toDo = random.nextInt(4);
                switch (toDo) {
                    case (0) -> System.out.println(ulrick.bendDown());
                    case (1) -> System.out.println(ulrick.jump());
                    case (2) -> {
                        System.out.println(ulrick.run());
                        isBattle = false;
                    }
                    default -> {
                        System.out.println(ulrick.death());
                        isBattle = false;
                    }
                }

                if (isBattle) {               // Атака второго воина
                    toDo = random.nextInt(3);
                    switch (toDo) {
                        case (0) -> System.out.println(ulrick.hailOfArrows());
                        case (1) -> System.out.println(ulrick.shootArrow());
                        default -> System.out.println(ulrick.throwsABow());
                    }

                    toDo = random.nextInt(5);
                    switch (toDo) {
                        case (0) -> System.out.println(odin.invisible());
                        case (1) -> System.out.println(odin.iceShield());
                        case (2) -> System.out.println(odin.fireShield());
                        case (3) -> {
                            System.out.println(odin.run());
                            isBattle = false;
                        }
                        default -> {
                            System.out.println(odin.death());
                            isBattle = false;
                        }
                    }
                }
            }
        }
        System.out.println("\nКонец боя");
    }
}


