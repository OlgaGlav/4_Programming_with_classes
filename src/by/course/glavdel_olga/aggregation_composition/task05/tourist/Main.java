package by.course.glavdel_olga.aggregation_composition.task05.tourist;

import java.util.List;

//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
//различного типа (отдых, круиз, лечение,...) для оптимального выбора. Учитывать возможность 
//выбора транспорта, питания и числа дней.Реализовать выбор и сортировку путевок

public class Main {

	public static void main(String[] args) {
		
		Voucher voucher1 = new Voucher(TypeEat.AL, Transport.AVIA, 9, 156.0);
		Voucher voucher2 = new Voucher(Country.GEORGIA, Type.EXCURSION, TypeEat.BB, Transport.BUS, 5, 240.0);
		Voucher voucher3 = new Voucher(12, 70.0);
		Voucher voucher4 = new Voucher(Country.GREES, 12, 520.0);
		Voucher voucher5 = new Voucher(TypeEat.AL, Transport.BUS, 10, 130.0);
		Voucher voucher6 = new Voucher(Type.RECREATION, TypeEat.FB, 23, 2541.0);
		Voucher voucher7 = new Voucher(Country.GEORGIA, Type.SHOPPING, TypeEat.BB, Transport.TRAIN, 3, 257.0);

		TravelAgency agency = new TravelAgency(
				new Voucher[] { voucher1, voucher2, voucher3, voucher4, voucher5, voucher6, voucher7 }, "Agency");

		
		Logic logic = new Logic();
		View view = new View();
		
		List<Voucher> listChooseByTypeVoucher = logic.chooseType(Type.EXCURSION, agency);
		view.printList(listChooseByTypeVoucher);
		
		List<Voucher> listChooseByTransport =  logic.chooseTransport(Transport.AVIA, agency);
		view.printList(listChooseByTransport);
		
		List<Voucher> listChooseByTypeEat =  logic.chooseTypeEat(TypeEat.AL, agency);
		view.printList(listChooseByTypeEat);
		
		List<Voucher> listChooseByDays =  logic.chooseDays(12, agency);
		view.printList(listChooseByDays);
		
		List<Voucher> listChooseTypeTransportTypeEatDays =  logic.chooseTypeTransportTypeEatDays(Type.SHOPPING,Transport.TRAIN,TypeEat.BB,3, agency);
		view.printList(listChooseTypeTransportTypeEatDays);
		
		logic.sortByPrice(agency);
		view.print(agency);
		
	}

}
