package com.niit.JewelleryBackend.Config;




import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.JewelleryBackend.Dao.AuthenticationDao;
import com.niit.JewelleryBackend.Dao.BillingDao;
import com.niit.JewelleryBackend.Dao.CardDao;
import com.niit.JewelleryBackend.Dao.CartDao;
import com.niit.JewelleryBackend.Dao.CartItemsDao;
import com.niit.JewelleryBackend.Dao.CategoryDao;
import com.niit.JewelleryBackend.Dao.OrderItemsDao;
import com.niit.JewelleryBackend.Dao.OrdersDao;
import com.niit.JewelleryBackend.Dao.PayDao;
import com.niit.JewelleryBackend.Dao.ProductDao;
import com.niit.JewelleryBackend.Dao.ShippingDao;
import com.niit.JewelleryBackend.Dao.SupplierDao;
import com.niit.JewelleryBackend.Dao.UsersDao;
import com.niit.JewelleryBackend.DaoImpl.AuthenticationDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.BillingDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.CardDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.CartDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.CartItemsDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.CategoryDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.OrderItemsDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.OrdersDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.PayDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.ProductDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.ShippingDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.SupplierDaoImpl;
import com.niit.JewelleryBackend.DaoImpl.UsersDaoImpl;
import com.niit.JewelleryBackend.Model.Authentication;
import com.niit.JewelleryBackend.Model.Billing;
import com.niit.JewelleryBackend.Model.Card;
import com.niit.JewelleryBackend.Model.Cart;
import com.niit.JewelleryBackend.Model.CartItems;
import com.niit.JewelleryBackend.Model.Category;
import com.niit.JewelleryBackend.Model.OrderItems;
import com.niit.JewelleryBackend.Model.Orders;
import com.niit.JewelleryBackend.Model.Pay;
import com.niit.JewelleryBackend.Model.Product;
import com.niit.JewelleryBackend.Model.Shipping;
import com.niit.JewelleryBackend.Model.Supplier;
import com.niit.JewelleryBackend.Model.Users;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContext 
{

	@Bean(name="dataSource")
	public DataSource getDataSource() 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/project1");
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");

		// Properties connectionProperties=new Properties();
		// connectionProperties.setProperty("hibernate.show_sql", "true");
		// connectionProperties.setProperty("hibernate.dialect",
		// "org.hibernate.dialect");
		return dataSource;
	}

	private Properties getHibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.connection.pool_size", "10");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		return properties;
	}

	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) 
	{
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Authentication.class);
		sessionBuilder.addAnnotatedClass(Billing.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(CartItems.class);
		sessionBuilder.addAnnotatedClass(Orders.class);
		sessionBuilder.addAnnotatedClass(OrderItems.class);
		sessionBuilder.addAnnotatedClass(Pay.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Shipping.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Users.class);
		sessionBuilder.addAnnotatedClass(Card.class);
		return sessionBuilder.buildSessionFactory();

	}

	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("printing session factory here : "+sessionFactory);
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("printing transactionManager factory here : "+transactionManager);
		return transactionManager;
	}



   	@Autowired
   	@Bean(name="categoryDao")
   	public CategoryDao getCategoryDao(SessionFactory sessionFactory) 
   	{
   		return new CategoryDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="authenticationDao")
   	public AuthenticationDao getAuthenticationDao(SessionFactory sessionFactory) 
   	{
   		return new AuthenticationDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="billingDao")
   	
   	public BillingDao getBillingDao(SessionFactory sessionFactory) 
   	{
   		return new BillingDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="cartDao")
   	public CartDao getCartDao(SessionFactory sessionFactory) 
   	{
   		return new CartDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="cartItemsDao")
   	public CartItemsDao getCartItemsDao(SessionFactory sessionFactory) 
   	{
   		return new CartItemsDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="ordersDao")
   	public OrdersDao getOrdersDao(SessionFactory sessionFactory) 
   	{
   		return new OrdersDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="orderItemsDao")
   	public OrderItemsDao getOrederItemsDao(SessionFactory sessionFactory) 
   	{
   		return new OrderItemsDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="payDao")
   	public PayDao getPayDao(SessionFactory sessionFactory) 
   	{
   		return new PayDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="shippingDao")
   	public ShippingDao getShippingDao(SessionFactory sessionFactory) 
   	{
   		return new ShippingDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="productDao")
   	public ProductDao getProductDao(SessionFactory sessionFactory) 
   	{
   		return new ProductDaoImpl(sessionFactory);
   	}
	
   	@Autowired
   	@Bean(name="usersDao")
   	public UsersDao getUsersDao(SessionFactory sessionFactory) 
   	{
   		return new UsersDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="supplierDao")
   	public SupplierDao getSupplierDao(SessionFactory sessionFactory) 
   	{
   		return new SupplierDaoImpl(sessionFactory);
   	}
   	@Autowired
   	@Bean(name="cardDao")
   	public CardDao getCardDao(SessionFactory sessionFactory) 
   	{
   		return new CardDaoImpl(sessionFactory);
   	}
   	
   	
   	
}
     