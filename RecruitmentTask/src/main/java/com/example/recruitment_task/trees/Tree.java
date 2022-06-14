package com.example.recruitment_task.trees;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public abstract class Tree {

    private String species;
    private Float height;
    private Integer age;
    private Float trunkPerimeter;
    private Float branchLenght;



    private void grow(){
        System.out.println("I'm growing");
    }

}
