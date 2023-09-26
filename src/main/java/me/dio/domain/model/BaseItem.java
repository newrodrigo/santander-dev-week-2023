package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    public Long getId() {
        return id;
    }

    public BaseItem setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public BaseItem setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BaseItem setDescription(String description) {
        this.description = description;
        return this;
    }
}
