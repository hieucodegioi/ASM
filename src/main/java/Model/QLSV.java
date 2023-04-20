/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class QLSV {

    private ArrayList<Student> stuList;
    private String choose;

    public QLSV() {
        this.stuList = new ArrayList<Student>();
        this.choose = "";
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public QLSV(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public void insert(Student stu) {
        this.stuList.add(stu);
    }

    public void delete(Student stu) {
        this.stuList.remove(stu);
    }

    public void update(Student stu) {
        this.stuList.remove(stu);
        this.stuList.add(stu);
    }

    public boolean checkforExistence(Student stu) {
        for (Student student : stuList) {
            if (student.getStuCode() == stu.getStuCode()) {
                return true;
            }
        }
        return false;
    }

}
