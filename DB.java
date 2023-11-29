package Prototype_Singelton_Implementation;

public class DB implements Cloneable{
    public String connection_data;

    public DB(String connection_data) {
        this.connection_data = connection_data;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public DB cloneDeep(String newConnection) {
        try {
            DB clonedDB = (DB) super.clone();

            clonedDB.connection_data = newConnection;
            this.connection_data = newConnection;

            return clonedDB;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "DB{" +
                "connection_data='" + connection_data + '\'' +
                '}';
    }
}
