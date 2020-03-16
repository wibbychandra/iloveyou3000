/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloveyou3000;

/**
 *
 * @author Wibby Chandra
 */
public class Email {
    private String title;
    private String body;
    private String recepient;
    private String attachment;
    private String sender;

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    
}
