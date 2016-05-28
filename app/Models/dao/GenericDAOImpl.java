package Models.dao;

import controllers.Models.*;


import java.util.List;

import javax.persistence.Query;

import play.db.jpa.JPA;

/**
 * Camada genérica para acesso ao Banco de Dados
 */
public class GenericDAOImpl implements GenericDAO {

    @Override
    public boolean persist(Object e) {
        JPA.em().persist(e);
        return true;
    }

    @Override
    public void flush() {
        JPA.em().flush();
    }

    @Override
    public void merge(Object e) {
        JPA.em().merge(e);
    }

    @Override
    public <T> T findByEntityId(Class<T> clazz, Long id) {
        return JPA.em().find(clazz, id);
    }

    @Override
    public <T> List<T> findAllByClassName(String className) {
        String hql = "FROM " + className;
        Query hqlQuery = JPA.em().createQuery(hql);
        return hqlQuery.getResultList();
    }

    @Override
    public <T> void removeById(Class<T> classe, Long id) {
        JPA.em().remove(findByEntityId(classe, id));
    }

    @Override
    public void remove(Object objeto) {
        JPA.em().remove(objeto);
    }

    @Override
    public <T> List<T> findByAttributeName(String className,
            String attributeName, String attributeValue) {
        String hql = "FROM " + className + " c" + " WHERE c." + attributeName
                + " = '" + attributeValue + "'";
        Query hqlQuery = JPA.em().createQuery(hql);
        return hqlQuery.getResultList();
    }

    @Override
    public Query createQuery(String query) {
        return JPA.em().createQuery(query);
    }

    public User getUserByEmail(String email) {
        User user = null;

        List<Object> userList = findAllByClassName("User");
        for (Object u : userList) {
            User temp = (User) u;
            if(temp.getEmail().equals(email)){
                user = temp;
                break;
            }

        }

        return user == null ? new User() : user;
    }




}