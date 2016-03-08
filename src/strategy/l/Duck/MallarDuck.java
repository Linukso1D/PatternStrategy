/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l.Duck;

import strategy.l.Duck.FlyBehavior.FlyWithWings;
import strategy.l.Duck.QuakBehavior.Quak;

/**
 *
 * @author maxxl
 */
public class MallarDuck extends Duck
{
   public MallarDuck()
   {
   quakbehavior=new Quak();
   flybehavior=new FlyWithWings();
   }
   @Override
   public void display()
   {
	System.out.println("I mallar Duck");
   }
   
}
