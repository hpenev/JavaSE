package loopsBookChapter16;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ������� �� ����");
		System.out.print("�������� ���: ");
		int ivanDay = sc.nextInt();
		System.out.print("�������� �����: ");
		int ivanMonth = sc.nextInt();
		System.out.print("�������� ������: ");
		int ivanYear = sc.nextInt();

		System.out.println("���� �� ������� �� �����");
		System.out.print("�������� ���: ");
		int peterDay = sc.nextInt();
		System.out.print("�������� �����: ");
		int peterMonth = sc.nextInt();
		System.out.print("�������� ������: ");
		int peterYear = sc.nextInt();
		sc.close();

		boolean isLean = false;

		int diffDays = 0;
		int maxDay = Math.max(ivanDay, peterDay);
		int minDay = Math.min(ivanDay, peterDay);

		while (minDay < maxDay) {

			diffDays += 1;
			minDay++;

		}
		System.out.println(diffDays);

		int maxMonth = Math.max(ivanMonth, peterMonth);
		int minMonth = Math.min(ivanMonth, peterMonth);
		int diffDaysInMonths = 0;

		while (minMonth < maxMonth) {
			int daysInCurrentMonth = 0;
			switch (minMonth) {
			case 1:
				daysInCurrentMonth = 31;
				break;
			case 2:
				daysInCurrentMonth = 28;
				break;
			case 3:
				daysInCurrentMonth = 31;
				break;
			case 4:
				daysInCurrentMonth = 30;
				break;
			case 5:
				daysInCurrentMonth = 31;
				break;
			case 6:
				daysInCurrentMonth = 30;
				break;
			case 7:
				daysInCurrentMonth = 31;
				break;
			case 8:
				daysInCurrentMonth = 31;
				break;
			case 9:
				daysInCurrentMonth = 30;
				break;
			case 10:
				daysInCurrentMonth = 31;
				break;
			case 11:
				daysInCurrentMonth = 30;
				break;
			case 12:
				daysInCurrentMonth = 31;
				break;
			default:
				daysInCurrentMonth = 0;
				break;
			}
			diffDaysInMonths += daysInCurrentMonth;
			minMonth++;
		}

		int maxYear = Math.max(ivanYear, peterYear);
		int minYear = Math.min(ivanYear, peterYear);
		int diffDaysInYears = 0;

		while (minYear < maxYear) {
			if ((minYear % 4 == 0) && (!(minYear % 100 == 0) || (minYear % 400 == 0))) {
				isLean = true;
			} else {
				isLean = false;
			}

			if (isLean) {
				diffDaysInYears += 366;
			} else {
				diffDaysInYears += 365;
			}
			minYear++;
		}

		// for (int i = Math.min(peterYear, ivanYear); i < Math.max(peterYear,
		// ivanYear); i++) {
		// if ((i % 4 == 0) && (!(i % 100 == 0) || (i % 400 == 0))) {
		// isLean = true;
		// } else {
		// isLean = false;
		// }
		//
		// if (isLean) {
		// diffDaysInYears += 366;
		// } else {
		// diffDaysInYears += 365;
		// }
		// }
		//
		// for (int m = Math.min(peterMonth, ivanMonth); m <
		// Math.max(peterMonth, ivanMonth); m++) {
		// int daysInCurrentMonth = 0;
		// switch (m) {
		// case 1:
		// daysInCurrentMonth = 31;
		// break;
		// case 2:
		// daysInCurrentMonth = 28;
		// break;
		// case 3:
		// daysInCurrentMonth = 31;
		// break;
		// case 4:
		// daysInCurrentMonth = 30;
		// break;
		// case 5:
		// daysInCurrentMonth = 31;
		// break;
		// case 6:
		// daysInCurrentMonth = 30;
		// break;
		// case 7:
		// daysInCurrentMonth = 31;
		// break;
		// case 8:
		// daysInCurrentMonth = 31;
		// break;
		// case 9:
		// daysInCurrentMonth = 30;
		// break;
		// case 10:
		// daysInCurrentMonth = 31;
		// break;
		// case 11:
		// daysInCurrentMonth = 30;
		// break;
		// case 12:
		// daysInCurrentMonth = 31;
		// break;
		// default:
		// daysInCurrentMonth = 0;
		// break;
		// }
		//
		// diffDaysInMonths += daysInCurrentMonth;
		// }
		//
		// for (int i = Math.min(peterDay, ivanDay); i < Math.max(peterDay,
		// ivanDay); i++) {
		// diffDays += 1;
		// }
		//
		// System.out.println(diffDaysInYears + diffDaysInMonths + diffDays);

	}
}
