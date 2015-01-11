/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.archive.spring.dao;


import com.archive.spring.model.Image;
import com.archive.spring.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Iob
 */

@Repository
public class ImageDaoImpl implements ImageDao{
    
        private static final Logger logger = LoggerFactory.getLogger(ImageDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
        
        

    @Override
    public void addImage(Image img) {
                Session session = this.sessionFactory.getCurrentSession();
		session.persist(img);
		logger.info("Image added successfully"); 
    }

    @Override
    public void updateImage(Image img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image getImageById(int id) {
                String hql = "FROM Image I WHERE I.id=:id";
                Query query = sessionFactory.openSession().createQuery(hql);
                query.setParameter("ID ",id);
                List results = query.list();
                if(results.isEmpty())
                    return null;
                else
		    return (Image) results.get(0);    }

    @Override
    public List<Image> getAllImages() {
            Session session = this.sessionFactory.getCurrentSession();
            List<Image> imgList = session.createQuery("from Image").list();
            return imgList ;
    }

    @Override
    public void removeImage(int id) {
    }
    
}
