package Lesson3.Figure;

public abstract class FigureAbstract {
    private String material;
    abstract double getArea();
    abstract double getPerimetr();
    public FigureAbstract()
    {
        material = "Aluminium";
        //Carton
        //Plastic
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double calcPrice()
    {
        if(material=="Aluminum")
        return 20*getArea();
        else if(material.equals("Carton"))
            return 5*getArea();
        else
            return 15*getArea();
    }


    public FigureAbstract(String material) {
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }
}
