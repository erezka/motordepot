package epam.finalproject.motordepot;

import epam.finalproject.motordepot.Service.DriverService;
import epam.finalproject.motordepot.entities.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MotordepotApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(MotordepotApplication.class, args);

		DriverService driverService = context.getBean(DriverService.class);
		System.out.println(driverService.getDriverFromBDByID(1));
		driverService.addDriver(new Driver("Shevchuck Anton Ivanovich",29,11,00000000));
		System.out.println("Все водители: "+"\n" + driverService.getAllDrivers());
		driverService.updateDriver("driving_licence_number","123987","6");
		System.out.println(driverService.getDriverFromBDByID(6));
		driverService.addDriver(new Driver("Ignatiev Sergey Leonidovich",55,30,112233));
		driverService.addDriver(new Driver("Petrov Ilia Vasilievich",40,20,116777));
		driverService.addDriver(new Driver("Shevchuck Anton Ivanovich",29,11,112233));
		driverService.addDriver(new Driver("Nikitin Savelii Innokintievich",81,9,444444));
		driverService.addDriver(new Driver("Ustinov Vlasii Demianovich",29,10,448899));
		driverService.addDriver(new Driver("Sorokin Nison Anatolevich",32,9,223366));
		driverService.addDriver(new Driver("Strelkov Varlam Glebovich",45,15,9652314));
		driverService.addDriver(new Driver("Kuznetsov Vadim Platonovich",24,3,786523));
		driverService.addDriver(new Driver("Grishin Viktor Feliksovich",31,7,786321));
		System.out.println("Все водители: "+"\n" + driverService.getAllDrivers());
		System.out.println(driverService.getDriverFromBDByID(10));
		driverService.updateDriver("driving_licence_number","619042","10");
		System.out.println(driverService.getDriverFromBDByID(10));
		System.out.println(driverService.getDriverFromBDByID(1));
		driverService.updateDriver("driving_licence_number","524035","1");
		System.out.println(driverService.getDriverFromBDByID(1));
		System.out.println(driverService.getDriverFromBDByID(13));
		driverService.updateDriver("driving_licence_number","965231","13");
		System.out.println(driverService.getDriverFromBDByID(13));
		driverService.deleteDriverById(6);
		System.out.println("Все водители: "+"\n" + driverService.getAllDrivers());

	}


}
