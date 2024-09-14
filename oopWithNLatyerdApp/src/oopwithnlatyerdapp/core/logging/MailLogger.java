/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopwithnlatyerdapp.core.logging;

/**
 *
 * @author Lenova
 */
public class MailLogger implements ILogger {

    @Override
    public void log(String data) {
        System.out.println("Mail gonderildi: " + data);
    }

}
