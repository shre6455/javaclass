package BeanPackage;

public class EducationDetails {
    public String degree;
    public enum DegreeTypeEnum{Master, Graduate};
    public DegreeTypeEnum degreeType;

    public boolean isMasterCompleted(){
        return DegreeTypeEnum.Master == this.degreeType;
    }

    public boolean isGraduationCompleted(){
        return DegreeTypeEnum.Graduate == this.degreeType;
    }

    public boolean isNoDegree() {
        return isGraduationCompleted() || isMasterCompleted();

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public DegreeTypeEnum getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeTypeEnum degreeType) {
        this.degreeType = degreeType;
    }
}


