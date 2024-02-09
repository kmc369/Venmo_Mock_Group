// hello - Luis
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {


    @PostMapping("")
    public List<Stock> addStockToCart(int stock_id, int cart_id){

        //find the cart by the id
        //find the stock by the id

        //if they both exsits, append Stock to cart list else return no stock 
    }


    @DeleteMapping("/api/cart/stock/{id}")
    public List<Stock> deleteFromCart(int stock_id, int cart_id)

    //find the cart by the id
        //find the stock by the id

        //remove it from the cart

}
