package com.example.Code.School.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Entity
public class Progress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ElementCollection
    private List<Boolean> levels = new ArrayList<Boolean>(Arrays.asList(new Boolean[150]));

    public Integer getId(){
        return id;
    }

    public List<Boolean> getLevels() {return levels;}

    public void setLevels(List<Boolean> levels) {this.levels = levels;}

    public Progress(){
        Collections.fill(levels, false);
    }

    public Progress(Integer id){
        this.id = id;
        this.levels = new ArrayList<Boolean>(Arrays.asList(new Boolean[150]));
        Collections.fill(levels, true);
    }

}
