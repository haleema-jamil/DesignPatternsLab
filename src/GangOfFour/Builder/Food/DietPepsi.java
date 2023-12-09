/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GangOfFour.Builder.Food;

public class DietPepsi extends ColdDrink implements DietDrink {

   @Override
   public float price() {
      return 30.0f; // Assuming a specific price for Diet Pepsi
   }

   @Override
   public String name() {
      return "Diet Pepsi";
   }
}