package com.nt.sbeans;

public class Cart {
  private Product product;
  private int cartId;
  private String userName;
  
  
  
  public Product getProduct() {
	return product;
}



  public void setProduct(Product product) {
	this.product = product;
  }



  public int getCartId() {
	return cartId;
  }



  public void setCartId(int cartId) {
	this.cartId = cartId;
  }



  public String getUserName() {
	return userName;
  }



  public void setUserName(String userName) {
	this.userName = userName;
  }



  public String showDetails() {
	  return "User Name: "+this.userName+"\nCart id: "+this.cartId+"\nProduct In cart:"+product.name+"\nProduct Id: "+product.productId+"\nProduct Price: "+product.price;
  }
}
