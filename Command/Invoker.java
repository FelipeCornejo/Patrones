package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Order> orderList = new ArrayList<Order>();/*como si fuera una pila */

    public void takeOrder(Order order){ /*añade ordeners a la pila */
        orderList.add(order);
    }

    public void placeOrders(){ /*ejecuta todas las ordenes en la pila */ 
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
