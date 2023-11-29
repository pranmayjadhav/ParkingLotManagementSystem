package Models;

import java.util.Date;

public class BaseModel {
    private int id;
    private Date createdDateAt;
    private Date lastUpdatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDateAt() {
        return createdDateAt;
    }

    public void setCreatedDateAt(Date createdDateAt) {
        this.createdDateAt = createdDateAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
