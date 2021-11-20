/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import Business.Order.Order;
import Business.Restaurant.Dishes;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String userName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;

    Customer(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    int id = 1;
    public void addOrder(String RestaurantName, String CustomerName, String DeliveryManName, ArrayList<Dishes> Order, String Price, String DeliveryAddress) {
        Order order=new Order();
        order.setOrderId(String.valueOf(id));
        order.setCustomerName(CustomerName);
        order.setRestaurantName(RestaurantName);
        order.setDeliveryMan(DeliveryManName);
        order.setOrder(Order);
        order.setPrice(Price);
        order.setDeliveryAddress(DeliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    
}
