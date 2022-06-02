package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductServiceImpl implements ProductService {
    List<Product> products;

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    public ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(1, "Long"));
        products.add(new Product(2, "Hoa"));
        products.add(new Product(3, "Huy"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i<products.size();i++){
            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                productList.add(products.get(i));
            }
        }
        return productList;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }
}

