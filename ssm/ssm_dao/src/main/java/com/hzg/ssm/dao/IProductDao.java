package com.hzg.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.hzg.ssm.domain.Product;

/**
 * ���Product�־û�����
 * @author Administrator
 *
 */

//��ѯ���в�Ʒ��Ϣ
@Repository
public interface IProductDao {
	@Select("select * from product")
	public List<Product> findAll() throws Exception;
	
}
