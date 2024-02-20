/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csi.userservice.modal;

/**
 *
 * @author ratnesh
 */
public class UserData {
    
    private String name;
    private NameData nameData;
    private String registeredEmailId;
    private String registeredMobileNumber;
    private String about;   

    public UserData() {
    }

    public UserData(String name, NameData nameData, String registeredEmailId, String registeredMobileNumber, String about) {
        this.name = name;
        this.nameData = nameData;
        this.registeredEmailId = registeredEmailId;
        this.registeredMobileNumber = registeredMobileNumber;
        this.about = about;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NameData getNameData() {
        return nameData;
    }

    public void setNameData(NameData nameData) {
        this.nameData = nameData;
    }

    public String getRegisteredEmailId() {
        return registeredEmailId;
    }

    public void setRegisteredEmailId(String registeredEmailId) {
        this.registeredEmailId = registeredEmailId;
    }

    public String getRegisteredMobileNumber() {
        return registeredMobileNumber;
    }

    public void setRegisteredMobileNumber(String registeredMobileNumber) {
        this.registeredMobileNumber = registeredMobileNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    
}
