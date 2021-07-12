package com.ms.mapper;

import java.util.List;

import com.ms.pojo.Product;

public interface ProductMapper {
	public int add(Product product); 
    
    public void delete(int id); 
        
    public Product get(int id); 
      
    public int update(Product product);  
        
    public List<Product> list();
     
    public int count(); 
}
