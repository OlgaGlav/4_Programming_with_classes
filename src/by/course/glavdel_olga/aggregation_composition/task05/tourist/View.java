package by.course.glavdel_olga.aggregation_composition.task05.tourist;

import java.util.List;

public class View {

	public void printList(List<Voucher> list) {
		for (Voucher voucher : list) {

			System.out.println("Страна " + voucher.getCountry() + " тип " + voucher.getType() + ", цена "
					+ voucher.getPrice() + ", тип питания " + voucher.getTypeEat() + ", количество дней "
					+ voucher.getDays() + ", транспорт " + voucher.getTransport());
		}
		System.out.println();
	}

	public void print(TravelAgency agency) {
		for (Voucher voucher : agency.getVouchers()) {

			System.out.println("Страна " + voucher.getCountry() + " тип " + voucher.getType() + ", цена "
					+ voucher.getPrice() + ", тип питания " + voucher.getTypeEat() + ", количество дней "
					+ voucher.getDays() + ", транспорт " + voucher.getTransport());
		}

	}

}
