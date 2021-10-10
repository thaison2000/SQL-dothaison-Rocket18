package ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ManagementNew mn = new ManagementNew();
        News N;
        while(true){
            System.out.println("Application Manager New");
            System.out.println("Enter 1: To insert new");
            System.out.println("Enter 2: To view list news");
            System.out.println("Enter 3: To get average rate");
            System.out.println("Enter 4: To exit:");
            int n = scanner.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();

                    System.out.println("Enter tittle:");
                    String tittle = scanner.nextLine();

                    System.out.println("Enter PublishDate: ");
                    String PublishDate = scanner.nextLine();

                    System.out.println("Enter author: ");
                    String Author = scanner.nextLine();

                    System.out.println("Enter content: ");
                    String content = scanner.nextLine();
                    
                    N = new News(id, tittle, PublishDate, Author, content);
                    mn.addNew(N);
                    System.out.println(N.toString());
                    scanner.nextLine();
                    break;

                }
                case 2: {
                    mn.showInfor();
                    break;

                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

                }

            
        }


    }

