package Prototype_Singelton_Implementation;

public class Logger {
    private static Logger loggerInstance;

    private Logger(){

    }

    public static Logger createInstance(){
        if(loggerInstance != null){
            return loggerInstance;
        }

        return new Logger();
    }
}
