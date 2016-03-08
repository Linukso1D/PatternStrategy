/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.l.Duck;

import strategy.l.Duck.FlyBehavior.FlyBehavior;
import strategy.l.Duck.QuakBehavior.QuakBehavior;

/**
 *
 * @author maxxl
 */
public abstract class Duck
{
   FlyBehavior flybehavior;
   QuakBehavior quakbehavior;
   
   public Duck()
   {
   
   }
   public void swim()
   {
   System.out.println("All ducks can float");
   }
   public void setFlybehavior(FlyBehavior flybehavior)
   {
	this.flybehavior = flybehavior;
   }

   public void setQuakbehavior(QuakBehavior quakbehavior)
   {
	this.quakbehavior = quakbehavior;
   }
   
   public void performFly()
   {
   flybehavior.fly();
   }
   public void performQuack()
   {
   quakbehavior.quack();
   }
   
abstract void display();
   
}
