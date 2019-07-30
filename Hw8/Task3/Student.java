package com.softserve;

    public class Student {
        String name;
        int courseName;

        public Student(String name, int courseName) {
            this.name = name;
            this.courseName = courseName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourseName() {
            return courseName;
        }

        public void setCourseName(int courseName) {
            this.courseName = courseName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", courseName=" + courseName +
                    '}';
        }
    }
