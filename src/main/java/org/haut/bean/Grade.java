package org.haut.bean;

public class Grade {
    private Integer gradeID;
    private String gradeName;
    public Grade(Integer gradeID, String gradeName){
        System.out.println("正在执⾏ Grade 的有参构造⽅法，参数分别为：gradeId=" + gradeID + ",gradeName=" + gradeName);
        this.gradeID=gradeID;
        this.gradeName=gradeName;
    }
    public Grade(){
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeID=" + gradeID +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }

    public void setGradeID(Integer gradeID) {
        System.out.println("正在执⾏ Grade 类的 setGradeID() ⽅法…… ");
        this.gradeID = gradeID;
    }

    public void setGradeName(String gradeName) {
        System.out.println("正在执⾏ Grade 类的 setGradeName() ⽅法…… ");
        this.gradeName = gradeName;
    }
}
