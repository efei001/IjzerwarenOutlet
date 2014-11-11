package com.springmvc.dao;

import com.springmvc.model.Role;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addRole(Role role) {
        // code
    }

    public void updateRole(Role role) {
        // code

    }

    public Role getRole(int id) {
        Role role = (Role) getCurrentSession().get(Role.class, id);
        return role;
    }

    public void deleteRole(int id) {
        //
        
    }
    

    @SuppressWarnings("unchecked")
    public List<Role> getRoles() {
        return getCurrentSession().createQuery("from Role").list();
    }

    public  void storeAllRoles(List<Role> roles) {
             
       //
    }
}
