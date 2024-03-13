package dao;

import org.springframework.stereotype.Component;

@Component("Dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {

        /*
    Se connecter à la BD pour récupérer la temperature
         */
        System.out.println("version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
