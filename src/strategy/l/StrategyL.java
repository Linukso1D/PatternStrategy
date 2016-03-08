/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l;

import strategy.l.Duck.FlyBehavior.FlyWithMagic;
import strategy.l.Duck.MallarDuck;
import strategy.l.Duck.QuakBehavior.Mute;
import strategy.l.Duck.RedHeadDuck;

/**
 *
 * @author maxxl
 */
public class StrategyL
{

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args)
   {
	MallarDuck mallar = new MallarDuck();
	mallar.display();
	mallar.performFly();
	mallar.performQuack();
	RedHeadDuck redhead = new RedHeadDuck();
	redhead.display();
	redhead.performFly();
	redhead.performQuack();
	
	System.out.println("***Magic***");
	
	mallar.setFlybehavior(new FlyWithMagic());
	redhead.setFlybehavior(new FlyWithMagic());
	mallar.setQuakbehavior(new Mute());
	redhead.setQuakbehavior(new Mute());
	mallar.display();
	mallar.performFly();
	mallar.performQuack();
	redhead.display();
	redhead.performFly();
	redhead.performQuack();
	
   	
   }
   
}
