package OopsPractice;

public class o12StaticFunction {
    public static void main(String[] args) {
        // accessing static variable directly by name of class
      //  o11StaticFunction.count = 0;
      //  System.out.println(o11StaticFunction.count);

        // if private kia to upar jaise access nhi hoga

        // lets  access as function ko static kia so access kar paa rha hai

        o11StaticFunction obj = new o11StaticFunction("sahil",45);
        o11StaticFunction obj1 = new o11StaticFunction("ss",33);

        System.out.println(o11StaticFunction.getCount());// static funcion hai isliye class ke nam se access kar



    }
}
