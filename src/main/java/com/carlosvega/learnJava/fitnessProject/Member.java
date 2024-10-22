package com.carlosvega.learnJava.fitnessProject;

public class Member {
    private char memberType = ' ';
    private int memberId = 0;
    private String name = "";
    private double fee = 0;

    public Member(char memberType, int memberId, String name, double fee){
        this.memberType = memberType;
        this.memberId = memberId;
        this.name = name;
        this.fee = fee;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public char getMemberType() {
        return memberType;
    }
    public void setMemberType(char memberType) {
        this.memberType = memberType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return memberType + ", " + memberId + ", " + name + ", " + fee;
    }
}
