package edu.swun.set;

import java.util.Objects;

public class Student {
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStuId() == student.getStuId() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuId(), getName());
    }

    @Override
    public String toString() {
        return "[学号："+this.stuId+",姓名："+this.name+",成绩"+this.score+"]";
    }
}
