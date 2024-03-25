package com.learnreact.learnReact.services;

import com.learnreact.learnReact.model.Cources;

import java.util.List;

public interface CourceService {
    public List<Cources> getCources();
    public Cources saveCources(Cources cources);
    public void deleteCourse(int id);

    public void updateCourse(Cources cources);

}
