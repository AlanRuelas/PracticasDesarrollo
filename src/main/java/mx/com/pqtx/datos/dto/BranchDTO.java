package mx.com.pqtx.datos.dto;

import java.util.List;


public class BranchDTO {
    private String name;

    public BranchDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BranchDTO{" + "name=" + name + '}';
    }
 
    
}
