package Java.Mayo_09;

import java.util.Date;

public abstract class TablaBase {

    private int id;
    private Date createdAt;
    private Date updatedAt;
    private Date expiration;

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id+","+createdAt+","+updatedAt;
    }

    public TablaBase(int id, Date createdAt, Date updatedAt,Date expiration) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expiration = expiration;
    }

    /* METODOS SIN IMPLEMENTAR */
    public abstract void createRecord();

    public abstract void updateRecord();

    public abstract void deleteRecord();

    /* METODOS CON IMPLEMENTACIO (DEFAULT) */
    public void viewCreationDate() {
        System.out.println(createdAt);
    }

    public void viewUpdateDate() {
        System.out.println(updatedAt);
    }
    
    /* GETTERS Y SETTERS */
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpiration() {
        return expiration;
    }
    
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

}
