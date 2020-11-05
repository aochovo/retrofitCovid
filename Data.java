/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

/**
 *
 * @author FP Mañana A
 */
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Data {




@SerializedName("data")
@Expose
private List<Centro> data = null;

public List<Centro> getData() {
return data;
}

public void setData(List<Centro> data) {
this.data = data;
}

}

