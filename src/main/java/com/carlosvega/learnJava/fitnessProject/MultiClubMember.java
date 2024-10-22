package com.carlosvega.learnJava.fitnessProject;

public class MultiClubMember extends Member{
    private int points;

    public MultiClubMember(char memberType, int memberId, String name, double fee, int points) {
        super(memberType, memberId, name, fee);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        //en el libro es diferente
        return getMemberType() + ", " + getMemberId() + ", " + getName() + ", " + getFee() + ", " + getPoints();
    }
}
