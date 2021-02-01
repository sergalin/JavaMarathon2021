package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health + 50 > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);

        if (hero.health - attackScore < 0) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }

    }
}
