package FinalExamTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MMORPGParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Hero> party = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] heroData = scanner.nextLine().split("\\s+");
            String name = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            party.add(new Hero(name, hp, mp));
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" - ");
            String action = command[0];
            String heroName = command[1];

            Hero hero = getHeroByName(party, heroName);
            if (hero != null) {
                switch (action) {
                    case "CastSpell":
                        String spellName = command[3];
                        int mpNeeded = Integer.parseInt(command[2]);
                        hero.castSpell(spellName, mpNeeded);
                        break;
                    case "TakeDamage":
                        String attacker = command[3];
                        int damage = Integer.parseInt(command[2]);
                        hero.takeDamage(damage, attacker);
                        break;
                    case "Recharge":
                        int amount = Integer.parseInt(command[2]);
                        hero.recharge(amount);
                        break;
                    case "Heal":
                        amount = Integer.parseInt(command[2]);
                        hero.heal(amount);
                        break;
                }
            }

            input = scanner.nextLine();
        }

        for (Hero hero : party) {
            if (hero.isAlive()) {
                System.out.println(hero.getName());
                System.out.println("  HP: " + hero.getHP());
                System.out.println("  MP: " + hero.getMP());
            }
        }
    }

    static class Hero {
        private String name;
        private int hp;
        private int mp;

        public Hero(String name, int hp, int mp) {
            this.name = name;
            this.hp = hp;
            this.mp = mp;
        }

        public String getName() {
            return name;
        }

        public int getHP() {
            return hp;
        }

        public int getMP() {
            return mp;
        }

        public void setHP(int hp) {
            this.hp = hp;
        }

        public void setMP(int mp) {
            this.mp = mp;
        }

        public void castSpell(String spellName, int mpNeeded) {
            if (mp >= mpNeeded) {
                mp -= mpNeeded;
                System.out.println(name + " has successfully cast " + spellName + " and now has " + mp + " MP!");
            } else {
                System.out.println(name + " does not have enough MP to cast " + spellName + "!");
            }
        }

        public void takeDamage(int damage, String attacker) {
            if (hp > damage) {
                hp -= damage;
                System.out.println(name + " was hit for " + damage + " HP by " + attacker + " and now has " + hp + " HP left!");
            } else {
                System.out.println(name + " has been killed by " + attacker + "!");
                hp = 0;
            }
        }

        public void recharge(int amount) {
            int mpRecovered = Math.min(amount, 200 - mp);
            mp += mpRecovered;
            System.out.println(name + " recharged for " + mpRecovered + " MP!");
        }

        public void heal(int amount) {
            int hpRecovered = Math.min(amount, 100 - hp);
            hp += hpRecovered;
            System.out.println(name + " healed for " + hpRecovered + " HP!");
        }

        public boolean isAlive() {
            return hp > 0;
        }
    }


    private static Hero getHeroByName(List<Hero> party, String heroName) {
        for (Hero hero : party) {
            if (hero.getName().equals(heroName)) {
                return hero;
            }
        }
        return null;
    }
}
