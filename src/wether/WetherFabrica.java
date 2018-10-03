package wether;

public class WetherFabrica {

    private WetherFabrica(){

    }

    public static GlobWether createWether(){
        GlobWether globWether = new GlobWether();

        return globWether;
    }

}
