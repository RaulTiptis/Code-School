package com.example.Code.School.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Progress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private boolean javaLevelOne = false;
    private boolean javaLevelTwo = false;
    private boolean javaLevelThree = false;
    private boolean pythonLevelOne = false;
    private boolean pythonLevelTwo = false;
    private boolean pythonLevelThree = false;
    private boolean cLevelOne = false;
    private boolean cLevelTwo = false;
    private boolean cLevelThree = false;

    public Integer getId(){
        return id;
    }

    public boolean getJavaLevelOne(){
        return javaLevelOne;
    }

    public void setJavaLevelOne(boolean javaLevelOne){
        this.javaLevelOne = javaLevelOne;
    }

    public boolean getJavaLevelTwo(){
        return javaLevelTwo;
    }

    public void setJavaLevelTwo(boolean javaLevelTwo){
        this.javaLevelTwo = javaLevelTwo;
    }

    public boolean getJavaLevelThree(){
        return javaLevelThree;
    }

    public void setJavaLevelThree(boolean javaLevelThree){
        this.javaLevelThree = javaLevelThree;
    }

    public boolean getPythonLevelOne(){
        return pythonLevelOne;
    }

    public void setPythonLevelOne(boolean pythonLevelOne){
        this.pythonLevelOne = pythonLevelOne;
    }

    public boolean getPythonLevelTwo(){
        return pythonLevelTwo;
    }

    public void setPythonLevelTwo(boolean pythonLevelTwo){
        this.pythonLevelTwo = pythonLevelTwo;
    }

    public boolean getPythonLevelThree(){
        return pythonLevelThree;
    }

    public void setPythonLevelThree(boolean pythonLevelThree){
        this.pythonLevelThree = pythonLevelThree;
    }

    public boolean getCLevelOne(){
        return cLevelOne;
    }

    public void setCLevelOne(boolean cLevelOne){
        this.cLevelOne = cLevelOne;
    }

    public boolean getCLevelTwo(){
        return cLevelTwo;
    }

    public void setCLevelTwo(boolean cLevelTwo){
        this.cLevelTwo = cLevelTwo;
    }

    public boolean getCLevelThree(){
        return cLevelThree;
    }

    public void setCLevelThree(boolean cLevelThree){
        this.cLevelThree = cLevelThree;
    }

    public Progress(){ }

    public Progress(Integer id, boolean javaLevelOne, boolean javaLevelTwo, boolean javaLevelThree,
                    boolean pythonLevelOne, boolean pythonLevelTwo, boolean pythonLevelThree,
                    boolean cLevelOne, boolean cLevelTwo, boolean cLevelThree){

        this.id = id;
        this.javaLevelOne = javaLevelOne;
        this.javaLevelTwo = javaLevelTwo;
        this.javaLevelThree = javaLevelThree;
        this.pythonLevelOne = pythonLevelOne;
        this.pythonLevelTwo = pythonLevelTwo;
        this.pythonLevelThree = pythonLevelThree;
        this.cLevelOne = cLevelOne;
        this.cLevelTwo = cLevelTwo;
        this.cLevelThree = cLevelThree;
    }

}
