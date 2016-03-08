/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l.Duck.FlyBehavior;

/**
 *
 * @author maxxl
 */
public class FlyWithWings implements FlyBehavior
{
   @Override
   public void fly()
   {
	System.out.println("Fly with Wings");
   }
   
}
