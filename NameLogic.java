/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavalagi.Function;

import latihanjavalagi.Model.ModelProgram;

/**
 *
 * @author Wibby Chandra
 */
//Abstraction
public class NameLogic {
    public String returnName(ModelProgram modelProgram){
        return "Hello you must be "+modelProgram.getName();
    }
    public String returnEmpty(ModelProgram modelProgram){
        return "Your name couldn't be empty";
    }
}
