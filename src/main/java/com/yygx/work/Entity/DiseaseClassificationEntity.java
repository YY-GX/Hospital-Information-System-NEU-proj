package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "diseaseClassification", schema = "backup_b", catalog = "")
public class DiseaseClassificationEntity {
    private int classificationNum;
    private String classificationName;
    private int displayOrder;
    private String diseaseType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classification_num")
    public int getClassificationNum() {
        return classificationNum;
    }

    public void setClassificationNum(int classificationNum) {
        this.classificationNum = classificationNum;
    }

    @Basic
    @Column(name = "classification_name")
    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    @Basic
    @Column(name = "display_order")
    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Basic
    @Column(name = "disease_type")
    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiseaseClassificationEntity that = (DiseaseClassificationEntity) o;
        return classificationNum == that.classificationNum &&
                displayOrder == that.displayOrder &&
                Objects.equals(classificationName, that.classificationName) &&
                Objects.equals(diseaseType, that.diseaseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classificationNum, classificationName, displayOrder, diseaseType);
    }
}
