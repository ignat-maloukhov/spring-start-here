package demo.ignat.service;

import demo.ignat.model.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);

    List<Product> getAll();
}
