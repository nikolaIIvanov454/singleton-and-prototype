package Prototype_Singelton_Implementation;

public class Main {
    public static void main(String[] args) {
        DB originalDB = new DB("DB:localhost:3356");

        try {
            DB shallowDBInstance = (DB) originalDB.clone();
            shallowDBInstance.connection_data = "hello";
            System.out.println(shallowDBInstance.toString());
            System.out.println(originalDB.toString());

            DB deepDBInstance = (DB) originalDB.cloneDeep("DB:localhost:3232");
            System.out.println(deepDBInstance.toString());
            System.out.println(originalDB.toString());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
