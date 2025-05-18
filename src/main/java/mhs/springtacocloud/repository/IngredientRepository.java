package mhs.springtacocloud.repository;

import java.util.Optional;

import mhs.springtacocloud.model.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}