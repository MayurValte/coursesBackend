package com.learnreact.learnReact.services;

//import com.learnreact.learnReact.dao.CourceDao;
import com.learnreact.learnReact.dao.CourceDao;
import com.learnreact.learnReact.model.Cources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourceServiceImpl implements CourceService{
    @Autowired
    private CourceDao courceDao;
//    List<Cources> allCources=new ArrayList<>();
    @Override
    public List<Cources> getCources() {
        List<Cources> allCources = this.courceDao.findAll();
//        Cources c1=new Cources(2,"Java","Java Cource");
//        Cources c2=new Cources(3,"Python","Learn Python");
//
//        allCources.add(c1);
//        allCources.add(c2);

        return allCources;
    }

    @Override
    public Cources saveCources(Cources cources) {
        Cources savedCource = this.courceDao.save(cources);
//        allCources.add(cources);
        return cources;
    }

    @Override
    public void deleteCourse(int id) {
        this.courceDao.deleteById(id);
    }

    @Override
    public void updateCourse(Cources cources) {
        this.courceDao.save(cources);
    }
}
