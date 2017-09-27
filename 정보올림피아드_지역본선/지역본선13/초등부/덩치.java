package 지역본선13.초등부;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 27..
 */

class Person{
    int no, kg, cm, rank;

    public Person(int no, int kg, int cm) {
        this.no = no;
        this.kg = kg;
        this.cm = cm;
    }

    public int getKg() {
        return kg;
    }

    public int getCm() {
        return cm;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

public class 덩치 {
    public ArrayList<Integer> solution(int peopleNumber, int[][] hulking) {
        ArrayList<Integer> ret = new ArrayList<>();

        Person[] person = new Person[peopleNumber];
        for (int i = 0; i < peopleNumber; i++){
            person[i] = new Person(i, hulking[i][0], hulking[i][1]);
        }

        // standart = 기준 , compare = 비교 대상
        // 루프를 돌면서 나보다 덩치가 큰 경우 rank 값을 1씩 증가시킴
        // 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다
        for (int standard = 0; standard < peopleNumber; standard++){
            int win = 1;

            for (int compare = 0; compare < peopleNumber; compare++){
                if (standard != compare){
                    // 여기에서 비교 대상이 클 경우 기준의 win을 욜리고 win이 곧 rank가 된다
                    if (person[standard].getKg() < person[compare].getKg() &&
                            person[standard].getCm() < person[compare].getCm())
                        win++;
                }
            }

            person[standard].setRank(win);
        }

        for (int i = 0; i < peopleNumber; i++)
            ret.add(person[i].getRank());


        return ret;
    }

    public static void main(String[] args) {
        덩치 application = new 덩치();

        Scanner scanner = new Scanner(System.in);

        int peopleNumber = scanner.nextInt();
        int[][] hulking = new int[peopleNumber][2];

        for (int i = 0; i < peopleNumber; i++){
            hulking[i][0] = scanner.nextInt();
            hulking[i][1] = scanner.nextInt();
        }

        ArrayList<Integer> ret = application.solution(peopleNumber, hulking);

        for (Integer i : ret){
            System.out.print(i+" ");
        }
    }
}
