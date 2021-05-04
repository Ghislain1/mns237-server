package org.mns237.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="shoppings")
public class Shoppings {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name="name")
    String name;
    @Column(name="description")
    String description;

  /*  @OneToMany
    @JoinColumn(name="products")
    private Set<Products> products;

    @OneToMany
    @JoinColumn(name="clients")
    private Set<Users> clients;
*/
    public Shoppings(){}
    public Shoppings(long id, String name){
        this.id = id;
        this.name = name;
    }

    // setter and getter


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    /*public Products getProducts() {
        return (Products) products;
    }*/

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

   /* public Users getClients() {
        return (Users) clients;
    }

    public void setClients(Users clients) {
        this.clients = (Set<Users>) clients;
    }

    public void setProducts(Products products) {
        this.products = (Set<Products>) products;
    }*/
}
