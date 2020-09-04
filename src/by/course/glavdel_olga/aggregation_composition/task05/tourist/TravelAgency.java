package by.course.glavdel_olga.aggregation_composition.task05.tourist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelAgency {

	private Voucher[] vouchers;
	private String nameAgency;

	public TravelAgency() {
		this.nameAgency = "noName";
	}

	public TravelAgency(Voucher[] vouchers, String nameAgency) {
		super();
		this.vouchers = vouchers;
		this.nameAgency = nameAgency;
	}

	public List<Voucher> chooseType(Type type, Voucher[] vouchers) {

		List<Voucher> voucherType = new ArrayList<Voucher>();

		for (Voucher voucher : vouchers) {

			if (voucher.isType(type)) {
				voucherType.add(voucher);
			}
		}
		return voucherType;
	}

	public List<Voucher> chooseTransport(Transport transport, Voucher[] vouchers) {
		List<Voucher> voucherTransport = new ArrayList<Voucher>();

		for (Voucher voucher : vouchers) {

			if (voucher.isTransport(transport)) {
				voucherTransport.add(voucher);
			}
		}
		return voucherTransport;
	}

	public List<Voucher> chooseTypeEat(TypeEat typeEat, Voucher[] vouchers) {
		List<Voucher> voucherTypeEat = new ArrayList<Voucher>();

		for (Voucher voucher : vouchers) {

			if (voucher.isTypeEat(typeEat)) {
				voucherTypeEat.add(voucher);
			}
		}
		return voucherTypeEat;
	}

	public List<Voucher> chooseDays(int days, Voucher[] vouchers) {
		List<Voucher> voucherDays = new ArrayList<Voucher>();

		for (Voucher voucher : vouchers) {

			if (voucher.isDays(days)) {
				voucherDays.add(voucher);
			}
		}
		return voucherDays;
	}

	public void sortByPrice(Voucher[] vouchers) {

		Voucher voucherTemp = new Voucher();

		for (int i = 0; i < vouchers.length; i++) {

			for (int j = 0; j < vouchers.length; j++) {

				if (vouchers[i].getPrice() < vouchers[j].getPrice()) {
					voucherTemp = vouchers[j];
					vouchers[j] = vouchers[i];
					vouchers[i] = voucherTemp;
				}
			}
		}
	}

	public Voucher[] getVouchers() {
		return vouchers;
	}

	public void setVouchers(Voucher[] vouchers) {
		this.vouchers = vouchers;
	}

	public String getNameAgency() {
		return nameAgency;
	}

	public void setNameAgency(String nameAgency) {
		this.nameAgency = nameAgency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAgency == null) ? 0 : nameAgency.hashCode());
		result = prime * result + Arrays.hashCode(vouchers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelAgency other = (TravelAgency) obj;
		if (nameAgency == null) {
			if (other.nameAgency != null)
				return false;
		} else if (!nameAgency.equals(other.nameAgency))
			return false;
		if (!Arrays.equals(vouchers, other.vouchers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelAgency [vouchers=" + Arrays.toString(vouchers) + ", nameAgency=" + nameAgency + "]";
	}
	
}
