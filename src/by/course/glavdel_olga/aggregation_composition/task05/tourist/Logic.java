package by.course.glavdel_olga.aggregation_composition.task05.tourist;

import java.util.List;

public class Logic {

	public List<Voucher> chooseType(Type type, TravelAgency agency) {
		List<Voucher> voucherList = agency.chooseType(type, agency.getVouchers());

		return voucherList;
	}

	public List<Voucher> chooseTransport(Transport transport, TravelAgency agency) {
		List<Voucher> voucherList = agency.chooseTransport(transport, agency.getVouchers());

		return voucherList;
	}

	public List<Voucher> chooseTypeEat(TypeEat typeEat, TravelAgency agency) {
		List<Voucher> voucherList = agency.chooseTypeEat(typeEat, agency.getVouchers());

		return voucherList;
	}

	public List<Voucher> chooseDays(int days, TravelAgency agency) {
		List<Voucher> voucherList = agency.chooseDays(days, agency.getVouchers());

		return voucherList;
	}

	public List<Voucher> chooseTypeTransportTypeEatDays(Type type, Transport transport, TypeEat typeEat, int days,
			TravelAgency agency) {

		Voucher[] vouchers;

		List<Voucher> voucherList = agency.chooseType(type, agency.getVouchers());
		vouchers = listToArray(voucherList);

		voucherList = agency.chooseTransport(transport, vouchers);
		vouchers = listToArray(voucherList);

		voucherList = agency.chooseTypeEat(typeEat, vouchers);
		vouchers = listToArray(voucherList);

		voucherList = agency.chooseDays(days, vouchers);

		return voucherList;
	}

	private Voucher[] listToArray(List<Voucher> voucherList) {

		Voucher[] vouchers = new Voucher[voucherList.size()];
		voucherList.toArray(vouchers);

		return vouchers;
	}

	public void sortByPrice(TravelAgency agency) {
		
		agency.sortByPrice(agency.getVouchers());
	}

}
