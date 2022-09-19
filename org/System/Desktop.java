package org.System;

public class Desktop extends Computer   {
    public void desktopSize() {
    	System.out.println("DesktopSize:13.5 inches");
    }
    public static void main(String[] args) {
      Desktop D=new Desktop();
      D.ComputerModel();
      D.desktopSize();
}
}