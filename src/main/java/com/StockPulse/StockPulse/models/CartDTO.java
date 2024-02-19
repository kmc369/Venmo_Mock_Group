package com.StockPulse.StockPulse.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import com.StockPulse.models.Stock;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CartDTO {

    private Long id;
    private List <Stock> stocks;

    public CartDTO() {
    }

    public CartDTO(Long id, List<Stock> stocks) {
        this.id = id;
        this.stocks = stocks;
    }

    public CartDTO id(Long id) {
        setId(id);
        return this;
    }

    public CartDTO stocks(List<Stock> stocks) {
        setStocks(stocks);
        return this;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Stock> getStocks() {
        return this.stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }



   

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CartDTO)) {
            return false;
        }
        CartDTO cartDTO = (CartDTO) o;
        return Objects.equals(id, cartDTO.id) && Objects.equals(stocks, cartDTO.stocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stocks);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", stocks='" + getStocks() + "'" +
            "}";
    }
    

}
