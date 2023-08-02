package com.jap;

import java.util.Objects;

    public class Student {
        private int s_rollNo;
        private String s_name;
        private double s_totalMarks;
        private String s_grade;

        Student() { }

        public Student(int s_rollNo, String s_name, double s_totalMarks, String s_grade) {
            this.s_rollNo = s_rollNo;
            this.s_name = s_name;
            this.s_totalMarks = s_totalMarks;
            this.s_grade = s_grade;
        }

        public int getS_rollNo() {
            return s_rollNo;
        }

        public void setS_rollNo(int s_rollNo) {
            this.s_rollNo = s_rollNo;
        }

        public String getS_name() {
            return s_name;
        }

        public void setS_name(String s_name) {
            this.s_name = s_name;
        }

        public double getS_totalMarks() {
            return s_totalMarks;
        }

        public void setS_totalMarks(double s_totalMarks) {
            this.s_totalMarks = s_totalMarks;
        }

        public String getS_grade() {
            return s_grade;
        }

        public void setS_grade(String s_grade) {
            this.s_grade = s_grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "s_rollNo=" + s_rollNo +
                    ", s_name='" + s_name + '\'' +
                    ", s_totalMarks=" + s_totalMarks +
                    ", s_grade=" + s_grade +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof com.jap.Student)) return false;
            com.jap.Student student = (com.jap.Student) o;
            return getS_rollNo() == student.getS_rollNo() && Double.compare(student.getS_totalMarks(), getS_totalMarks()) == 0 && getS_grade() == student.getS_grade() && getS_name().equals(student.getS_name());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getS_rollNo(), getS_name(), getS_totalMarks(), getS_grade());
        }
    }
