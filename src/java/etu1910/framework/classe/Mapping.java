/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1910.framework.classe;

/**
 *
 * @author Sahaza Mandresy
 */
public class Mapping {
     String className;
    String method;

    public Mapping(){

    }
    public void setClassName(String value){
        if(value!=""){
            this.className=value;
        }
    }
    public void setMethod(String value){
        if(value!=""){
            this.method=value;
        }
    }
    public String getClassName(){
        return this.className;
    }
    public String getMethod(){
        return this.method;
    }
}
