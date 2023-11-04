
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println(now);


        OffsetDateTime yesterday = OffsetDateTime.parse("2023-10-29T09:05:49.361998100+01:00");
        System.out.println(yesterday);

        OffsetDateTime primoGennaio2023 = OffsetDateTime.of(2023,1,1,15,15,0,0, ZoneOffset.UTC);
        System.out.println(primoGennaio2023);


        //Formatter
        System.out.println("Formatter of localizedDate");
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00z");
        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataString1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String dataString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Data");
        System.out.println(data);
        System.out.println("Format FULL");
        System.out.println(dataString);
        System.out.println("Format LONG");
        System.out.println(dataString1);
        System.out.println("Format MEDIUM");
        System.out.println(dataString2);
        System.out.println("Format SHORT");
        System.out.println(dataString3);

        System.out.println("Formatter of localizedTime");
        //String timeString = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
        //String timeString1 = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        String timeString2 = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        String timeString3 = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println("FULL");
        //System.out.println(timeString);
        System.out.println("LONG");
       // System.out.println(timeString1);
        System.out.println("MEDIUM");
        System.out.println(timeString2);
        System.out.println("SHORT");
        System.out.println(timeString3);


        System.out.println("Formatter.ofPattern");
        String patternString = data.format(DateTimeFormatter.ofPattern("yyyy"));
        String patternString1 = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String patternString2 = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        System.out.println("yyyy");
        System.out.println(patternString);
        System.out.println("dd MMMM yyyy");
        System.out.println(patternString1);
        System.out.println("dd MMMM yyyy, Locale.ITALY");
        System.out.println(patternString2);

        System.out.println("Formatter of localizedDateTime");
        String dateTimeString1 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM));
        System.out.println(dateTimeString1);
        String dateTimeString2 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        System.out.println(dateTimeString2);


        System.out.println("ISO 8601");
        String dataISO = data.format(DateTimeFormatter.ISO_DATE);
        System.out.println("ISO-DATE");
        System.out.println(dataISO);
        String dataISO1 = data.format(DateTimeFormatter.ISO_TIME);
        System.out.println("ISO_TIME");
        System.out.println(dataISO1);
        String dataISO2 = data.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO_DATE_TIME");
        System.out.println(dataISO2);
        String dataISO3 = data.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO_LOCAL_DATE");
        System.out.println(dataISO3);
        String dataISO4 = data.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println("ISO_ORDINAL_DATE");
        System.out.println(dataISO4);

        System.out.println("Timezones");
        OffsetDateTime data1 = OffsetDateTime.parse("2023-10-29T09:05:49.361998100+01:00");
        //String timeZone1 = data1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        ZonedDateTime zoneDate = OffsetDateTime.parse("2023-10-29T09:05:49.361998100+01:00").toZonedDateTime();
        String timeZone2 = zoneDate.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        System.out.println("OffsetDateTime.toZoneDateTime() and then DateTimeFormatter.ofLocalizedTime(FormatStyle.Long)");
        System.out.println(timeZone2);

        ZonedDateTime zoneDate1 = OffsetDateTime.parse("2023-10-29T09:05:49.361998100+01:00").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String timeZone3 = zoneDate1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
        System.out.println("OffsetDateTime.parse(\"2023-10-29T09:05:49.361998100+01:00\").atZoneSimilarLocal(ZoneId.of(\"Europe/Rome\"))");
        System.out.println(timeZone3);

        System.out.println();
        System.out.println("OffesetDateTime operations");


        OffsetDateTime dataOp = OffsetDateTime.parse("2023-10-03T11:12:04+02:00");
        System.out.println("Start date");
        System.out.println(dataOp);

        OffsetDateTime dataOpPlus = dataOp.plusDays(1);
        System.out.println("Plus 1 day");
        System.out.println(dataOpPlus);

        System.out.println();
        System.out.println("java.time");
        System.out.println("LocalDate");

        LocalDate myLocalDate = LocalDate.now();
        System.out.println("LocalDate.now()");
        System.out.println(myLocalDate);

        LocalTime myLocalTime = LocalTime.now();
        System.out.println("LocalTime.now()");
        System.out.println(myLocalTime);

        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now()");
        System.out.println(myLocalDateTime);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myLocalDateTime.format(myFormatObj);
        System.out.println(formattedDate);

        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate.now()");
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2015, 02, 20);
        System.out.println("LocalDate.of(2015, 02, 20)");
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.parse("2015-02-20");
        System.out.println("LocalDate.parse(\"2015-02-20\")");
        System.out.println(localDate2);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("LocalDate.now().plusDays(1)");
        System.out.println(tomorrow);

        LocalDate previousMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("LocalDate.now().minus(1, ChronoUnit.MONTHS)");
        System.out.println(previousMonth);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("LocalDate.parse(\"2016-06-12\").getDayOfWeek()");
        System.out.println(sunday);

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("LocalDate.parse(\"2016-06-12\").getDayOfMonth()");
        System.out.println(twelve);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("LocalDate.now().isLeapYear()");
        System.out.println(leapYear);

        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("LocalDate.parse(\"2016-06-12\").isBefore(LocalDate.parse(\"2016-06-11\"))");
        System.out.println(notBefore);

        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("LocalDate.parse(\"2016-06-12\").isAfter(LocalDate.parse(\"2016-06-11\"))");
        System.out.println(isAfter);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("LocalDate.parse(\"2016-06-12\").atStartOfDay()");
        System.out.println(beginningOfDay);

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("LocalDate.parse(\"2016-06-12\").with(TemporalAdjusters.firstDayOfMonth())");
        System.out.println(firstDayOfMonth);

        System.out.println("LocalTime");

        LocalTime now1 = LocalTime.now();
        System.out.println("LocalTime.now()");
        System.out.println(now1);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("LocalTime.parse(\"06:30\")");
        System.out.println(sixThirty);

        LocalTime sixThirty1 = LocalTime.of(6,30);
        System.out.println("LocalTime.of(6,30)");
        System.out.println(sixThirty1);

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1,ChronoUnit.HOURS);
        System.out.println("LocalTime.parse(\"06:30\").plus(1,ChronoUnit.HOURS)");
        System.out.println(sevenThirty);

        int six = LocalTime.parse("06:30").getHour();
        System.out.println("LocalTime.parse(\"06:30\").getHour()");
        System.out.println(six);

        boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("LocalTime.parse(\"06:30\").isBefore(LocalTime.parse(\"07:30\"))");
        System.out.println(isBefore);

        LocalTime maxTime = LocalTime.MAX;
        LocalTime minTime = LocalTime.MIN;
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime noon = LocalTime.NOON;
        System.out.println("LocalTime.MAX");
        System.out.println(maxTime);
        System.out.println("LocalTime.MIN");
        System.out.println(minTime);
        System.out.println("LocalTime.MIDNIGHT");
        System.out.println(midnight);
        System.out.println("LocalTime.NOON");
        System.out.println(noon);

        System.out.println();
        System.out.println("LocalDateTime");

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("LocalDateTime.now()");
        System.out.println(now2);

        LocalDateTime dateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20,06,30);
        System.out.println("LocalDateTime.of(2015, Month.FEBRUARY, 20,06,30)");
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.parse("2015-02-20T06:30:00");
        System.out.println("LocalDateTime.parse((\"2015-02-20T06:30:00\"))");
        System.out.println(dateTime1);

        LocalDateTime tomorrow1 = now2.plusDays(1);
        System.out.println("now2.plusDays(1)");
        System.out.println(tomorrow1);

        LocalDateTime todayMinus2Hours = now2.minusHours(2);
        System.out.println("now2.minusHours(2)");
        System.out.println(todayMinus2Hours);

        Month month = now2.getMonth();
        System.out.println("Month month = now2.getMonth()");
        System.out.println(month);

        System.out.println();
        System.out.println("ZoneDateTimeAPI");

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId zoneId = ZoneId.of(\"Europe/Paris\")");
        System.out.println(zoneId);

//        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
//        for (String element : allZoneIds ) {
//            System.out.println(element);
//        }

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println("ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId)");
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println("ZonedDateTime.parse(\"2015-05-03T10:15:30+01:00[Europe/Paris]\")");
        System.out.println(zonedDateTime1);

        LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime1, offset);
        System.out.println(offSetByTwo);


        System.out.println();
        System.out.println("Period class");

        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println(initialDate);
        System.out.println("initialDate.plus(Period.ofDays(5))");
        System.out.println(finalDate);

        int five = Period.between(initialDate, finalDate).getDays();
        System.out.println("Period.between(initialDate, finalDate).getDays()");
        System.out.println(five);

        long five1 = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println("ChronoUnit.DAYS.between(initialDate, finalDate)");
        System.out.println(five1);


        System.out.println();
        System.out.println("Duration class");

        LocalTime initialTime = LocalTime.of(6,30,0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        System.out.println("Duration.between(initialTime, finalTime).getSeconds()");
        System.out.println(thirty);

        long thirty1 = ChronoUnit.SECONDS.between(initialTime, finalTime);
        System.out.println("ChronoUnit.SECONDS.between(initialTime, finalTime)");
        System.out.println(thirty1);

        System.out.println();
        System.out.println("Date and Time formatting");

        LocalDateTime localDateTime2 = LocalDateTime.of(2015, Month.JANUARY, 25,6,30);
        System.out.println(localDateTime2);

        //String localDateString = localDateTime2.format(DateTimeFormatter.ISO_DATE);
        //System.out.println(localDateString);

        String localDateTime3 = localDateTime2.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDateTime3);

        String localDateTime4 = localDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
        System.out.println(localDateTime4);








    }
}
