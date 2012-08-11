package edu.dnu.fpm.schedule.domain;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 7/26/12
 *         Time: 6:58 PM
 */
//TODO add immutability
public class ScheduleTable {
    Day[] scheduleContent;
    String groupName;

    public ScheduleTable(String groupName) {
        this.groupName = groupName;
        scheduleContent = new Day[5];
        for (int i = 0, scheduleContentLength = scheduleContent.length; i < scheduleContentLength; i++) {
            scheduleContent[i] = new Day();
        }
    }

    public void setLesson(int dayNumber, int positionOfLessonInDay, String name, SubgroupFlag subgroupFlag, EvenOddFlag evenOddFlag) {
        scheduleContent[dayNumber].setLesson(positionOfLessonInDay, name, subgroupFlag, evenOddFlag);
    }

    public Day[] getScheduleContent() {
        return scheduleContent;
    }

    public String getGroupName() {
        return groupName;
    }

    public ScheduleTable() {
    }
}
