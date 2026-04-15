import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser =DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now =LocalDateTime.now();
        return now.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return (hour>=12&&hour<18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String time = appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a"));
        int date =appointmentDate.getDayOfMonth();
        String day = appointmentDate.format(DateTimeFormatter.ofPattern("EEEE"));
        String month = appointmentDate.format(DateTimeFormatter.ofPattern("MMMM"));
        int year = appointmentDate.getYear();
        
        return "You have an appointment on "+day+", "+month+" "+date+", "+year+", at "+time+".";
    }

    public LocalDate getAnniversaryDate() {
        int year=LocalDate.now().getYear();
        return  LocalDate.of(year,9,15);
    }
}
