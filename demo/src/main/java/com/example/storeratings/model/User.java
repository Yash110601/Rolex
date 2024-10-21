package com.example.storeratings.model;


import jakarta.persistence.*;

@Entity  // Marks this class as an entity (maps to the 'user' table)
public class User {

    @Id  // Marks the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private Long id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 16)
    private String password;

    @Column(nullable = false, length = 400)
    private String address;

    @Column(nullable = false)
    private String role;  // Role can be 'ADMIN', 'USER', or 'STORE_OWNER'

    // Getters and Setters (for accessing private fields)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
