package org.mns237.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name ="autor")
    private String autor;
    @Column(name ="createdDate")
    private Date createdDate;
    @Column(name ="msg")
    private String msg;
    @Column(name="email")
    private String email;

    @ManyToOne
    private Topic topic;


    public Comments() {
    }

    public Comments(long id, String msg){
        this.id = id;
        this.msg = msg;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getEmail() {
        return email;
    }

    public String getMsg() {
        return msg;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }
}