package study_center.reports;

import study_center.Program;
import study_center.persons.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LongReport implements Report {
  SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy HH:mm");

  public void showReportForStudent(Student currentStudent) {
    format.setLenient(false);
    Program program = currentStudent.getStudentsProgram();
    Date programStartDate = program.getProgramStartDate();
    Date programStopDate = program.getProgramEndDate();
    StringBuilder fullInfo = new StringBuilder();
    fullInfo.append("STUDENT: " + currentStudent.getName() + " " + currentStudent.getSurName() + "\n");
    fullInfo.append("STUDENTS PRORAM: " + program.getProgramName() + "\n");
    fullInfo.append("START: " + format.format(programStartDate) + "\n");
    fullInfo.append("PROGRAM DURATION: " + program.countProgramDuration() + " hours" + "\n");
    if (program.getCourses() != null) {
      fullInfo.append(program.showProgramCourses());
    } else {
      fullInfo.append("No assigned courses for this student \n");
    }
    System.out.println(fullInfo.toString());
  }
}

