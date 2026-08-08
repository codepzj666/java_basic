package cn.codepzj;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("请输入5名学生的成绩");
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[5];

        int i = 0;
        while (i < 5) {
            scores[i] = sc.nextDouble();
            i++;
        }

        // 关闭scanner
        sc.close();
        System.out.printf("%.2f", CalcScore(scores));
    }

    public static double CalcScore(double[] scores) {
        double maxScore = scores[0];
        double minScore = scores[0];
        double sumScore = 0;
        for (double score : scores) {
            if (maxScore < score) {
                maxScore = score;
            }
            if (minScore > score) {
                minScore = score;
            }
            sumScore += score;
        }

        return (sumScore - maxScore - minScore) / (scores.length - 2);
    }
}
