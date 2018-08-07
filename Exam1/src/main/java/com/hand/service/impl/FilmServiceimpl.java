package com.hand.service.impl;

import com.hand.dao.IFilmDAO;
import com.hand.domain.entity.Film;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FilmServiceimpl {
    @Resource
    IFilmDAO filmdao;

    public int add(Film entity) throws Exception{
        return filmdao.add(entity);
    }
}
