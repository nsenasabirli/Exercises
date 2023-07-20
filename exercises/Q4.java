public class Q4 {
    public static void main(String[] args) {
        int array[] = {0,0,0,0,0,0,0,0,0,0};
        int bonus[];
        bonus = new int[15];

        for(int i=0; i<15; i++) {
            bonus[i]+=1;
        }

        int bestScores[]={10,20,30,40,50};
        for(int j = 0; j<5; j++) {
            System.out.println(bestScores[j]);
        }
    }
}
