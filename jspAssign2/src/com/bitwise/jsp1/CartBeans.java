package com.bitwise.jsp1;

import java.awt.List;
import java.util.ArrayList;

public class CartBeans {
ArrayList list=new ArrayList();
private String items;
public ArrayList getList() {
	return list;
}
public void setList(ArrayList list) {
	list = list;
}
public String getItems() {
	return items;
}
public void setItems(String items) {
	this.items = items;
	list.add(items);
}

} 




