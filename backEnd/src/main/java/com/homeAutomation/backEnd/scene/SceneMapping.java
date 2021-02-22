package com.homeAutomation.backEnd.scene;


import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table
public class SceneMapping {

    @Id
    @SequenceGenerator(
            name = "sceneMapping_sequence",
            sequenceName = "sceneMapping_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sceneMapping_sequence"
    )
    private Long sceneMappingid;
    private String name;
    private String sceneCondition;
    private String sceneProducts;//format : pid-pstatus

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public SceneMapping() {
    }

    public SceneMapping(Long id, String name, String sceneCondition, String sceneProducts, Long userId) {
        this.sceneMappingid = id;
        this.name = name;
        this.sceneCondition = sceneCondition;
        this.sceneProducts = sceneProducts;
    }

    public Long getSceneMappingid() {
        return sceneMappingid;
    }

    public void setSceneMappingid(Long sceneMappingid) {
        this.sceneMappingid = sceneMappingid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSceneCondition() {
        return sceneCondition;
    }

    public void setSceneCondition(String sceneCondition) {
        this.sceneCondition = sceneCondition;
    }

    public String getSceneProducts() {
        return sceneProducts;
    }

    public void setSceneProducts(String sceneProducts) {
        this.sceneProducts = sceneProducts;
    }


    @Override
    public String toString() {
        return "SceneMapping{" +
                "sceneMappingid=" + sceneMappingid +
                ", name='" + name + '\'' +
                ", sceneCondition='" + sceneCondition + '\'' +
                ", sceneProducts='" + sceneProducts + '\'' +
                '}';
    }
}
