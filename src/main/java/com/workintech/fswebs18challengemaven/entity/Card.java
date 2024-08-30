package com.workintech.fswebs18challengemaven.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "casino", schema = "public")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer value;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Color color;

    public Card(Long id, Integer value, Color color) {
        this.id = id;
        this.value = value;
        this.type = null;
        this.color = color;
    }

    public Card(Long id, Color color, Type type) {

        if(type.equals(Type.JOKER)){
            this.color = null;
        } else {
            this.color = color;
        }

        this.id = id;
        this.value = null;
        this.type = type;
    }
}