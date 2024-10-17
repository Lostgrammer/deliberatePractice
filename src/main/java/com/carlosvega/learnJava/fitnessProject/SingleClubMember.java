package com.carlosvega.learnJava.fitnessProject;

public class SingleClubMember extends Member{
    private int club;

    public SingleClubMember(char memberType, int memberId, String name, double fee, int club) {
        super(memberType, memberId, name, fee);
        this.club = club;
    }

    public int getClub() {
        return club;
    }
    public void setClub(int club) {
        this.club = club;
    }

    @Override
    public String toString() {
        //en el libro es diferente
        return getMemberType() + ", " + getMemberId() + ", " + getName() + ", " + getFee() + ", " + getClub();
    }
}
