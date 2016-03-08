/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l.Duck;

import strategy.l.Duck.FlyBehavior.FlyByRocketPower;
import strategy.l.Duck.QuakBehavior.Mute;

/**
 *
 * @author maxxl
 */
public class RedHeadDuck extends Duck
{
   public RedHeadDuck()
   {
	quakbehavior = new Mute();
	flybehavior = new FlyByRocketPower();
	
   }
   @Override
   public void display()
   {
	System.out.println("I'm RedHeadDuck");
   }
   
}
