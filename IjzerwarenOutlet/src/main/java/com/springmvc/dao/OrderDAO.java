package com.springmvc.dao;

import com.springmvc.model.Order;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addOrder(Order order) {
        getCurrentSession().save(order);
    }

    public void updateOrder(Order order) {
        Order orderToUpdate = getOrder(order.getId());
        orderToUpdate.setUser(order.getUser());
        orderToUpdate.setId(order.getId());
        orderToUpdate.setDate();
        orderToUpdate.setAmount(order.getAmount());
        orderToUpdate.setTotalPrice(order.getTotalPrice());
        orderToUpdate.setShippingCosts(order.getShippingCosts());
        orderToUpdate.setProductEstablishment(order.getProductEstablishment());
        getCurrentSession().update(orderToUpdate);
    }

    public Order getOrder(int id) {
        Order order = (Order) getCurrentSession().get(Order.class, id);
        return order;
    }

    public void deleteOrder(int id) {
        Order orderToDelete = getOrder(id);
        if (orderToDelete != null) {
            getCurrentSession().delete(orderToDelete);
        }

    }

    public List<Order> getOrders() {
        return getCurrentSession().createQuery("from Order").list();
    }

    public void StoreAllOrders(List<Order> orders) {

        for (Order order : orders) {
            getCurrentSession().save(order);
        }
    }

}
