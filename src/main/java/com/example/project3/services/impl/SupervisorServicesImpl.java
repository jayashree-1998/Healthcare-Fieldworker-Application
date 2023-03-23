package com.example.project3.services.impl;

import com.example.project3.entities.Employee;
import com.example.project3.entities.Patient;
import com.example.project3.repo.EmployeeRepo;
import com.example.project3.repo.PatientRepo;
import com.example.project3.services.EmployeeServices;
import com.example.project3.services.SupervisorServices;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorServicesImpl implements SupervisorServices {

    @Autowired
    private PatientRepo patientRepo;
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Patient assignFieldWorker(Integer pid, Integer fid) {
        Patient patient = this.patientRepo.findById(pid).orElseThrow();
        Employee employee = this.employeeRepo.findById(fid).orElseThrow();
        patient.setFieldworker(employee);
        this.patientRepo.save(patient);
//        employee.getPatients().add(patient);
        return patient;
    }
}