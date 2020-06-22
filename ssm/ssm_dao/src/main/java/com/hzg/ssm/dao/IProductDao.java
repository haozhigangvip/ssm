package com.hzg.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hzg.ssm.domain.Product;

/**
 * 完成Product持久化操作
 * @author Administrator
 *
 */

//查询所有产品信息
public interface IProductDao {
	@Select("select * from product")
	public List<Product> findAll() throws Exception;
	
}
