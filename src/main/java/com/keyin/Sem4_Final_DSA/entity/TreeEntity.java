package com.keyin.Sem4_Final_DSA.entity;

import com.keyin.Sem4_Final_DSA.trees.BinaryNode;
import com.keyin.Sem4_Final_DSA.trees.BinaryNodeConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "trees")
public class TreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numbers;

    @Convert (converter = BinaryNodeConverter.class)
    private BinaryNode rootNode;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   

    public String getNumbers() {
        return numbers;
    }   

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }   

    public BinaryNode getRootNode() {
        return rootNode;
    }   

    public void setRootNode(BinaryNode rootNode) {
        this.rootNode = rootNode;
    }
}
