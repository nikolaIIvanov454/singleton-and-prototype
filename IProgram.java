package Prototype_Singelton_Implementation;

abstract class IProgram {
    private Logger myLogger;

    public IProgram(){
        this.myLogger = Logger.createInstance();
    }

    abstract void log(String message);
}
