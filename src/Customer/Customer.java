package Customer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Customer {
    private long id;
    private String name;
    private String dob;   

    public Customer(long id, String name, String dob) throws Exception {
        if (!isValidId(id)) {
            throw new Exception("Invalid Identification");
            }
            
        if (!isValidName(name)) {
            throw new Exception("Invalid customer's name");
            }

        if (!isValidDob(dob)) {
            throw new Exception("Invalid Date of Birth");
        }

        if (repOk(id, name, dob)) {            
            this.id = id;
            this.name = name;
            this.dob = dob;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //Data validation
    private boolean isValidId(long id) {
        return id > 0; 
    }

    private boolean isValidName(String name) {
        String regex = "[A-Za-z\\s]+";
        if (name.isEmpty()) {
            return false;
        } else if (!name.matches(regex)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isValidDob(String dob) {
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        df.setLenient(false);
        try {
            df.parse(dob);
            return true;
        } catch (Exception e) {
            System.out.println("Error when parsing date format!");
            return false;
        }
    }

    public boolean repOk(long id, String name, String dob) {
        if (isValidId(id) && isValidName(name) && isValidDob(dob)) {
            return true;
        }
        return false;
    }

    //Functions
    @Override
    public String toString() {
        return "[Id: "+ getId() + "\nName: " + getName() + "\nDOB: " + getDob() + "]";
    }

    public String getCustomer() {
        return toString();
    }
}
