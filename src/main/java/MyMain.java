public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int successes = 0;
        for (int i = 0; i<100000; i++) {
            int sixes = 0;
            for (int j = 0; j<6; j++) if (((int)((Math.random()/0.1666666666666)) +1)==6) sixes +=1;
            if (sixes>=1) successes +=1;
        }
        return 100*((double)successes/(double)100000);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int successes = 0;
        for (int i = 0; i<100000; i++) {
            int sixes = 0;
            for (int j = 0; j<12; j++) if (((int)((Math.random()/0.1666666666666)) +1)==6) sixes +=1;
            if (sixes>=2) successes +=1;
        }
        return 100*((double)successes/(double)100000);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int successes = 0;
        for (int i = 0; i<100000; i++) {
            int sixes = 0;
            for (int j = 0; j<18; j++) if (((int)((Math.random()/0.1666666666666)) +1)==6) sixes +=1;
            if (sixes>=3) successes +=1;
        }
        return 100*((double)successes/(double)100000);
    }


    public static void main(String[] args) {
        System.out.println("Probability of at least 1 six in 6 rolls: "+probabilityOneSix()+"%.");
        System.out.println("Probability of at least 2 sixes in 12 rolls: "+probabilityTwoSixes()+"%.");
        System.out.println("Probability of at least 3 sixes in 18 rolls: "+probabilityThreeSixes()+"%.");


    }
}
