package edu.dnu.fpm.schedule.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 7/26/12
 *         Time: 6:56 PM
 */
//TODO add immutability
public class Pair {
    List<Lesson> lessons;

    public Pair() {
        lessons = new ArrayList<Lesson>(4);
    }

    public void setLesson(String name, SubgroupFlag subgroupFlag, EvenOddFlag evenOddFlag) {
        lessons.add(new Lesson(name, subgroupFlag, evenOddFlag));
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
}
