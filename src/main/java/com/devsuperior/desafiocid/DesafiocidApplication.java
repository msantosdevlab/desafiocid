package com.devsuperior.desafiocid;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafiocid.entities.Order;
import com.devsuperior.desafiocid.services.OrderService;

@SpringBootApplication
public class DesafiocidApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafiocidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Code: ");
        int code = sc.nextInt();

        System.out.print("Basic: ");
        double basic = sc.nextDouble();

		System.out.print("Discount: ");
        double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("%nPedido código %d%n", order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

		sc.close();
	}

}
