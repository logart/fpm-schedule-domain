package edu.dnu.fpm.schedule.domain;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 7/26/12
 *         Time: 6:59 PM
 */
//TODO add immutability
public class Day {
    Pair[] pairs;

    public Day() {
        this.pairs = new Pair[5];
        for (int i = 0, dayContentLength = pairs.length; i < dayContentLength; i++) {
            pairs[i] = new Pair();
        }
    }

    public void setLesson(int positionOfLessonInDay, String name, SubgroupFlag subgroupFlag, EvenOddFlag evenOddFlag) {
        pairs[positionOfLessonInDay].setLesson(name, subgroupFlag, evenOddFlag);
    }

    public Pair[] getPairs() {
        return pairs;
    }

    public void setPairs(Pair[] pairs) {
        this.pairs = pairs;
    }
}
