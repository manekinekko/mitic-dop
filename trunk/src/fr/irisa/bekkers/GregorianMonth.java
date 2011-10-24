
package fr.irisa.bekkers;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 * Created on 20 nov. 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author bekkers
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class GregorianMonth extends GregorianCalendar {

	private static SimpleDateFormat monthFormatter = new SimpleDateFormat(
			"MMMMM yyyy", Locale.FRANCE);

	private static SimpleDateFormat dayFormatter = new SimpleDateFormat(
			"DDDDDD", Locale.FRANCE);

	/**
	 * 
	 * @param year année
	 * @param month mois dans l'année (0 = janvier)
	 */
	public GregorianMonth(int year, int month) {
		// on initialise au premier jour du mois
		super(year, month, 1);
	}
	
	// start : [0..6] numéro dans la semaine du premier jour du mois (0 = "lundi")
	public int start() {
		return get(DAY_OF_WEEK);
	}
	// last : [0..31] nombre de jour dans le mois
	public int last() {
		return getActualMaximum(DAY_OF_MONTH);
	}
	// titre : nom du mois (e.g. "décembre 2004")
	public String titre() {
		return monthFormatter.format(getTime());
	}

}