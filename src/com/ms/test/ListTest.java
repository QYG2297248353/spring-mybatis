package com.ms.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ms.mapper.CategoryMapper;
import com.ms.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ListTest {
	@Autowired
    private CategoryMapper categoryMapper;
	
	@Autowired
	Category c;
 
    @Test
    public void testAdd() {
        c.setName("new11 Category");
        categoryMapper.add(c);
    }
 
    @Test
    public void testList() {
        System.out.println(categoryMapper);
        List<Category> cs=categoryMapper.list();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }
}
