package futurelogistics.impl;

public class Utility {

    public static boolean validateTransportId(String id) {
        if (!id.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport id " + id + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
        return true;
    }

    public static GoodsTransport parseDetails(String input) {
        String[] d = input.split(":");

        if (!validateTransportId(d[0])) return null;

        if (d[3].equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(d[0], d[1], Integer.parseInt(d[2]),
                    Float.parseFloat(d[4]), Integer.parseInt(d[5]),
                    Float.parseFloat(d[6]));
        } else {
            return new TimberTransport(d[0], d[1], Integer.parseInt(d[2]),
                    Float.parseFloat(d[4]), Float.parseFloat(d[5]),
                    d[6], Float.parseFloat(d[7]));
        }
    }
}
