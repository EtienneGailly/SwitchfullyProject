package com.switchfully.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface ProfessorClient {
    @PostExchange("/professors")
    void addProfessor(@RequestBody Professor professor);
    @GetExchange("/professors")
    List<Professor> getAllProfessors();

}
