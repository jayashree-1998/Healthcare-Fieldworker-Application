package com.example.project3.services;

import com.example.project3.entities.Employee;
import com.example.project3.entities.Patient;

import java.util.List;

public interface PatientServices {


    Patient createPatient(Patient patientDto);
    Patient updatePatient(Patient patientDto, Integer id);
    Patient getPatientById(Integer id);
    List<Patient> getAllPatient();
}
