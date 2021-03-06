package com.niit.JewelleryBackend.DaoImpl;







import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.JewelleryBackend.Dao.BillingDao;
import com.niit.JewelleryBackend.Dao.ProductDao;
import com.niit.JewelleryBackend.Dao.SupplierDao;
import com.niit.JewelleryBackend.Dao.UsersDao;
import com.niit.JewelleryBackend.Model.Billing;
import com.niit.JewelleryBackend.Model.Product;
import com.niit.JewelleryBackend.Model.Supplier;
import com.niit.JewelleryBackend.Model.Users;




@Repository("productDao")
@Transactional


public class ProductDaoImpl implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean saveorupdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	@Override
	public boolean delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
		return true;
		
	}

	@Override
	public Product getProduct(String Id) {
		String q1 = "from Product where Id = '"+ Id+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		List<Product> list = (List<Product>)w.list();
		if(list==null || list.isEmpty())
		{
		return null;
		}
		return  list.get(0);
	}

	@Override
	public List<Product> productlist() {
		List<Product> product =(List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return product;
	}
	
	
	@Override
	public List<Product> getProductsById(String catId) {
	String c1="from Product where catId='"+catId+"'";
	Query w=sessionFactory.getCurrentSession().createQuery(c1);
	List<Product> list= (List<Product>)w.list();
	if(list==null || list.isEmpty())
	{
	return null;
	}

	return list;
	}

	@Override
	public List<Product> getProductsBySupplierId(String supplierId)
	{
	String c="from Product where supplierId='"+supplierId+"'";
	Query w=sessionFactory.getCurrentSession().createQuery(c);
	List<Product> list= (List<Product>)w.list();
	if(list==null || list.isEmpty())
	{
	return null;
	}

	return list;
	}


	}
