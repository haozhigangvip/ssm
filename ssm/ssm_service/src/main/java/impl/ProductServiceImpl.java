package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzg.ssm.dao.IProductDao;
import com.hzg.ssm.domain.Product;
import com.hzg.ssm.service.IProductService;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao productDao;
	
	@Override
	public  List<Product> findAll() throws Exception{
		return productDao.findAll();
	}
}
