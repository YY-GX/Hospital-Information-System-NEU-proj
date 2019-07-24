package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "disease", schema = "backup_b", catalog = "")
public class DiseaseEntity {
    private int diseaseNum;
    private String diseaseName;
    private String intelIcd;
    private int diseaseClassification;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disease_num")
    public int getDiseaseNum() {
        return diseaseNum;
    }

    public void setDiseaseNum(int diseaseNum) {
        this.diseaseNum = diseaseNum;
    }

    @Basic
    @Column(name = "disease_name")
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Basic
    @Column(name = "intel_ICD")
    public String getIntelIcd() {
        return intelIcd;
    }

    public void setIntelIcd(String intelIcd) {
        this.intelIcd = intelIcd;
    }

    @Basic
    @Column(name = "disease_classification")
    public int getDiseaseClassification() {
        return diseaseClassification;
    }

    public void setDiseaseClassification(int diseaseClassification) {
        this.diseaseClassification = diseaseClassification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiseaseEntity that = (DiseaseEntity) o;
        return diseaseNum == that.diseaseNum &&
                diseaseClassification == that.diseaseClassification &&
                Objects.equals(diseaseName, that.diseaseName) &&
                Objects.equals(intelIcd, that.intelIcd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diseaseNum, diseaseName, intelIcd, diseaseClassification);
    }
}
