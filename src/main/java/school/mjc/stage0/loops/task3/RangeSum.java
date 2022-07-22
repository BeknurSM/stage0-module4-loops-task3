package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        while (firstBoarder != secondBoarder+1){
            sum = sum + firstBoarder;
            firstBoarder++;
        }
        System.out.println(sum);
    }
}
