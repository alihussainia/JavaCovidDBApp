package mc190402102;

/**
 *
 * @author MOHAMMAD
 */
class Patient {

    private String id;
    private String name;
    private String address;
    private String isEffected;
    
    public Patient()
    {
        id = name = address = isEffected = " ";
    }
    
    public Patient(String id, String name, String address, String isEffected)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isEffected = isEffected;
    }

// Setters
    public void setID(String id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setEffected(String isEffected)
    {
        this.isEffected = isEffected;
    }

// Getters
    public String getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getEffected()
    {
        return isEffected;
    }

}
