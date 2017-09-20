package com.test.dao;

import com.test.entity.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.MetadataSources;

import java.util.List;

/**
 * Created by chenhansen on 2017/9/17.
 */
public class UserDao {
    public List<UserEntity> query(){
        Session session=null;
        List<UserEntity> list=null;
        try{
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
            StandardServiceRegistry registry = builder.configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
          /*  StandardServiceRegistry  serviceRegistry=new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sf=new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();*/
           /* //实例化Configuration,这行代码默认加载hibernate.cfg.xml文件
            Configuration conf=new Configuration().confiigure();
            //以Configuration创建SessionFactory
            SessionFactory sf=conf.buildSessionFactory();*/
            //实例化Session
            session=sessionFactory.openSession();
            String hql="from UserEntity";
            Query query=session.createQuery(hql);
            list=query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        }/*finally {
            if(session!=null)
                session.close();
        }*/
        return list;
    }

}
