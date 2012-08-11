package edu.dnu.fpm.schedule.domain;

/**
 * @author Artem Loginov (logart) logart2007@gmail.com
 *         Date: 7/26/12
 *         Time: 6:49 PM
 */
//TODO add immutability
public class Lesson {
    String name;
    EvenOddFlag evenOddFlag;
    SubgroupFlag subgroupFlag;

    public Lesson() {
    }

    public Lesson(String name, SubgroupFlag subgroupFlag, EvenOddFlag evenOddFlag) {
        this.name = name;
        this.subgroupFlag = subgroupFlag;
        this.evenOddFlag = evenOddFlag;
    }

    @Override
    public String toString() {
        return name + " " + subgroupFlag + " " + evenOddFlag + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvenOddFlag getEvenOddFlag() {
        return evenOddFlag;
    }

    public void setEvenOddFlag(EvenOddFlag evenOddFlag) {
        this.evenOddFlag = evenOddFlag;
    }

    public SubgroupFlag getSubgroupFlag() {
        return subgroupFlag;
    }

    public void setSubgroupFlag(SubgroupFlag subgroupFlag) {
        this.subgroupFlag = subgroupFlag;
    }
}
