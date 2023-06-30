package com.bookingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookingMain {
    static HashMap<String, Passenger> user = new HashMap<>();
    static Scanner in ;
    static {
        Train.trainCall();
        PassengerObject.createObject();
    }

    public static void main(String[] args) {

            in= new Scanner(System.in);
            boolean bool = true;
            int task=0;
            while (bool) {
                System.out.println("1.Create Account 2.Login 3. Book Ticket 4.Download ticket 5.Cancel ticket 6.Admin Login");
                try {
                    task= in.nextInt(); } catch (Exception e) {
                    System.out.println("Invalid Input");
                    main(args);
                }
                    switch (task) {
                        case 1: {
                            createNewAccount();
                            break;
                        }
                        case 2: {
                            String uname = login();
                            boolean value = true;
                            do {
                                System.out.println("1.Book Tickets 2.Download Ticket 3.Cancel Ticket 4.Main menu");
                                int logintask = in.nextInt();
                                switch (logintask) {
                                    case 1: {
                                        bookTicket(uname);
                                        break;
                                    }
                                    case 2: {
                                        downloadTicket(uname);
                                        break;
                                    }
                                    case 3: {
                                        cancelTicket(uname);break;
                                    }
                                    case 4: {
                                        value = false;
                                        break;
                                    }
                                }
                            } while (value);

                            break;
                        }
                        case 3: {
                            System.out.println("Do You have Account y/n");
                            char ch = in.next().charAt(0);
                            if (ch == 'y' || ch == 'Y') {
                                String uname = login();
                                bookTicket(uname);
                            } else {
                                createNewAccount();
                            }
                            break;
                        }
                        case 4: {
                            String uname = login();
                            downloadTicket(uname);
                            break;
                        }
                        case 5: {String uname=login();
                            cancelTicket(uname);
                            break;
                        }
                        case 6: {
                            if (adminLogin()) {
                                System.out.println("1.Downloading ticket based on train ");
                                System.out.println(String.format("%-10s%-10s%-10s%-10s%-10s%-10s ", "NAME", "AGE", "PNR-NO", "STATUS","START","END"));
                                for (Object t : Ticket.train1ticket) {
                                    System.out.println((PassengerDetails) t);
                                }
                                for (Object t : Ticket.train2ticket) {
                                    System.out.println((PassengerDetails) t);
                                }
                            } else {
                                System.out.println("Access has been restricted");
                            }
                            break;

                        }

                    }
                }
    }

    private static boolean adminLogin() {
        System.out.println("Enter the Admin id:");
        int id = in.nextInt();
        System.out.println("Enter the Password");
        String password = in.next();
        Admin admin = new Admin(id, password);
        return admin.b;
    }

    private static void downloadTicket(String uname) {
        try {
            Passenger list = user.get(uname);
            System.out.println(String.format("%-10s%-10s%-10s%-10s%-10s", "PNR-NO", "STATUS", "TRAINCODE","START","END"));
            for (Object o : list.tickets) {
                Ticket li = (Ticket) o;
                System.out.println(String.format("%-10s%-10s%-10s%-10s%-10s", li.getPnrNo(), li.getStatus(), li.getTrainCode(),li.getStart(),li.getEnd()));
            }
        } catch (Exception e) {
            System.out.println("An error occurred while downloading the ticket " );
        }
    }

    private static void createNewAccount() {
        try {
            System.out.println("Enter Username to create an account: (Contains 6 characters and mix of upper ,lowercase and number)");
            String uname = in.next();
            if (Pattern.matches("[a-zA-Z0-9]", uname)) {
                if (!user.containsKey(uname)) {
                    System.out.println("Enter Your Password");
                    String password = in.next();
                    System.out.println("Enter your Name:");
                    String name = in.next();
                    System.out.println("Enter your age");
                    int age = in.nextInt();
                    long ph_no=0;boolean b=true;
                    do{
                        System.out.println("Enter your number");
                        ph_no= in.nextLong();
                        String value=String.valueOf(ph_no);
                        if(value.length()==10)
                            b=false;

                    }while (b);
                    user.put(uname, new Passenger(name, uname, password, ph_no, age));
                } else {
                    System.out.println("Username already exists.");
                }
            } else {
                System.out.println("Username does not match the criteria.");
                createNewAccount();
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating a new account: " + e.getMessage());
        }
    }

    private static String login() {
        try {
            System.out.print("Enter your username:");
            String uname = in.next();
            if (user.containsKey(uname)) {
                Passenger address = user.get(uname);
                System.out.println("Enter Your password");
                if (in.next().equals(address.getPassword())) {
                    System.out.println("Done");
                } else {
                    throw new InvalidUserName();
                }
            } else {
                throw new InvalidUserName();
            }
            return uname;
        } catch (InvalidUserName e) {
            System.out.println(e.getMessage());
            return login();
        } catch (Exception e) {
            System.out.println("An error occurred while logging in: " + e.getMessage());
            return null;
        }
    }

    private static void bookTicket(String uname) {
        try {
            System.out.println("Enter the source");
            String start = in.next();
            Iterator iter = Train.train.iterator();
            boolean trainFound = false;

            while (iter.hasNext()) {
                Train train = (Train) iter.next();

                if (start.equalsIgnoreCase(train.getStartLoc())) {
                    System.out.println("Enter the destination");
                    String end=in.next();
                    if (end.equalsIgnoreCase(train.getEndLoc())) {
                        if (Payment.isSuccessful()) {
                            System.out.println("Ticket Booked Successfully");
                            Passenger address = user.get(uname);
                            double d = Math.random() * 9999999 + 12;
                            int num = (int) d;

                            if (start.equalsIgnoreCase("chennai")) {
                                int trainNum = 23124;
                                Ticket.SEAT_COUNT++;
                                Ticket.train1ticket.add(new PassengerDetails(address.getName(), address.getAge(), num, trainNum,start,end));
                                address.tickets.add(new Ticket(num, trainNum, train.getStartLoc(), train.getEndLoc()));
                            } else {
                                int trainNum = 54261;
                                Ticket.train2ticket.add(new PassengerDetails(address.getName(), address.getAge(), num, trainNum,start,end));
                                address.tickets.add(new Ticket(num, trainNum, train.getStartLoc(), train.getEndLoc()));
                            }
                        } else {
                            System.out.println("Payment not successful");
                        }

                        trainFound = true;
                        break;
                    } else {
                        System.out.println("No Trains available");
                        trainFound = true;
                        break;
                    }
                }
            }

            if (!trainFound) {
                System.out.println("No Trains available");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while booking the ticket: " + e.getMessage());
        }
    }
    static void cancelTicket(String uname){
        ArrayList list= user.get(uname).tickets;
        System.out.println("Enter the Pnr number:");
        Integer pnr=in.nextInt();
        System.out.println("Enter the Train Number");
        Integer traino=in.nextInt();
        for(int i=0;i<list.size();i++){
            Ticket ticket=(Ticket) list.get(i);
            if(pnr.equals(ticket.getPnrNo()) && traino.equals(ticket.getTrainCode())){
                ticket.setStatus("Cancelled");
                System.out.println("Cancelled Succesfully");
            }
            else
                System.out.println("Pnr No not found");
        }
        if(traino.equals(23124)){
            ArrayList train=Ticket.train1ticket;
            for (int i=0;i<train.size();i++){
                PassengerDetails details=(PassengerDetails) train.get(i);
                if(pnr.equals(details.getPnrNo()) && traino.equals(details.getTrainCode()))
                    details.setStatus("Cancelled");
                else
                    System.out.println("Pnr Not found");
            }
        }else {
            ArrayList train=Ticket.train2ticket;
            for (int i=0;i<train.size();i++){
                PassengerDetails details=(PassengerDetails) train.get(i);
                if(pnr.equals(details.getPnrNo()))
                    details.setStatus("Cancelled");

                else
                    System.out.println("Pnr Not found");
        }
    }
}
}
