public class Main {
    public static void main(String[] args) {
        float score;
        score = (float) 100;
        float addit;
        addit = (float) 1100;
        float bonus;
        if (addit > 100) {
            bonus = (int) (addit / 100);
        } else {
            bonus = 0;
        }
        float fullscore = score + addit + bonus;
        System.out.println(fullscore);
    }


}
