package com.information.database.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.information.database.dao.Dao;

@Repository
public class DaoImpl implements Dao {

	JdbcTemplate jdbcTemplate;

}
