package com.hzg.ssm.service;

import java.util.List;

import com.hzg.ssm.domain.Product;

public interface IProductService {
	public List<Product> findAll() throws Exception;
}
