/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l.Duck.QuakBehavior;

/**
 *
 * @author maxxl
 */
public class Mute implements QuakBehavior
	   
{
   @Override
   public void quack()
   {
	System.out.println(" Mute ");
   }
   
}
