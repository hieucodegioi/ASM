/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hieud
 */
public class Student implements Serializable {

    private int stuCode;
    private String stuName;
    private Province stuHomeTown;
    private boolean stuSex;
    private float maths;
    private float physics;
    private float chemistry;
    private float english;
    private float literature;

    public Student() {
    }

    public Student(int stuCode, String stuName, Province stuHomeTown, boolean stuSex, float maths, float physics, float chemistry, float english, float literature) {
        this.stuCode = stuCode;
        this.stuName = stuName;
        this.stuHomeTown = stuHomeTown;
        this.stuSex = stuSex;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.english = english;
        this.literature = literature;

    }

    public int getStuCode() {
        return stuCode;
    }

    public void setStuCode(int stuCode) {
        this.stuCode = stuCode;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Province getStuHomeTown() {
        return stuHomeTown;
    }

    public void setStuHomeTown(Province stuHomeTown) {
        this.stuHomeTown = stuHomeTown;
    }

    public boolean isStuSex() {
        return stuSex;
    }

    public void setStuSex(boolean stuSex) {
        this.stuSex = stuSex;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getLiterature() {
        return literature;
    }

    public void setLiterature(float literature) {
        this.literature = literature;
    }

    @Override
    public String toString() {
        return "Student{" + "stuCode=" + stuCode + ", stuName=" + stuName + ", stuHomeTown=" + stuHomeTown + ", stuSex=" + stuSex + ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english + ", literature=" + literature + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.stuCode != other.stuCode) {
            return false;
        }
        if (this.stuSex != other.stuSex) {
            return false;
        }
        if (Float.floatToIntBits(this.maths) != Float.floatToIntBits(other.maths)) {
            return false;
        }
        if (Float.floatToIntBits(this.physics) != Float.floatToIntBits(other.physics)) {
            return false;
        }
        if (Float.floatToIntBits(this.chemistry) != Float.floatToIntBits(other.chemistry)) {
            return false;
        }
        if (Float.floatToIntBits(this.english) != Float.floatToIntBits(other.english)) {
            return false;
        }
        if (Float.floatToIntBits(this.literature) != Float.floatToIntBits(other.literature)) {
            return false;
        }
        if (!Objects.equals(this.stuName, other.stuName)) {
            return false;
        }
        return Objects.equals(this.stuHomeTown, other.stuHomeTown);
    }

}
