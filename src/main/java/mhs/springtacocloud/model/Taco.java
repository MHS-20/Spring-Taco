package mhs.springtacocloud.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

import mhs.springtacocloud.repository.IngredientUDT;
import mhs.springtacocloud.repository.TacoUDRUtils;

@Data
public class Taco {
    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<IngredientUDT> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(TacoUDRUtils.toIngredientUDT(ingredient));
    }
}