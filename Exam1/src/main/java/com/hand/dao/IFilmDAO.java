package com.hand.dao;

import com.hand.domain.entity.Film;

/**
 *电影数据访问接口
 */
public interface IFilmDAO {
    /**
     * 插入一条记录
     */
    public int add(Film entity);
}
