package org.mns237.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "code")
    String code;
    @Column(name = "name")
    String name;
    @Column(name = "price")
    float price;
    @Column(name = "quantity")
    float quantity;
    @Column(name = "inventorystatus")
    String inventorystatus;
    @Column(name = "category")
    String category;
    @Column(name = "image")
    String image;
    @Column(name = "rating")
    float rating;
    @Column(name = "createdDate")
    Date createdDate;
    @Column(name = "publishedDate")
    Date publishedDate;
    @Column(name = "title")
    String title;
    @Column(name = "imageUrl")
    String imageUrl;
    @Column(name = "heart")
    boolean heart;
    @Column(name = "content")
    String content;
    @Column(name = "updatedDate")
    Date updatedDate;
    @Column(name = "summary")
    String summary;

    public Products() {
    }

    public Products(long id, String title) {
        this.id = id;
        this.title = title;
    }
    // setter and getter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCategory() {
        return category;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isHeart() {
        return heart;
    }

    public float getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getRating() {
        return rating;
    }

    public String getCode() {
        return code;
    }

    public String getImage() {
        return image;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public String getInventorystatus() {
        return inventorystatus;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setHeart(boolean heart) {
        this.heart = heart;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setInventorystatus(String inventorystatus) {
        this.inventorystatus = inventorystatus;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
