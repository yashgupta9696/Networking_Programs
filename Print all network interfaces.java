 // getting list of network interfaces
  Enumeration<NetworkInterface> interfaces = NetworkInterface
    .getNetworkInterfaces();

  System.out.println();
  System.out
    .println("================ Following are the available network interfaces ===============");
  System.out.println();
  if (interfaces == null) {
   System.out.println("No network interfaces found");
  } else {

   for (NetworkInterface netIf : Collections.list(interfaces)) {
    System.out.println("Display Name : "
      + netIf.getDisplayName());
    System.out.println("Name : " + netIf.getName());
    System.out.println();
   }
  }
 } catch (UnknownHostException ex) {
  System.out.println("Error Occured : " + ex.getMessage());
 } catch (SocketException e) {
  System.out.println("Error Occured : " + e.getMessage());
 }
 }

}