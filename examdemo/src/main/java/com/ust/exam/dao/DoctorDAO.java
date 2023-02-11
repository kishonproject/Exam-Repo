package com.ust.exam.dao;

import java.util.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ust.exam.domine.Doctor;


//Fill your code
@Component
@SpringBootApplication
public class DoctorDAO {
	
    static ArrayList<Doctor> doctorList = new ArrayList<Doctor>();

	static {
		doctorList.add(new Doctor(1,"Harini","MBBS",4.2,"Orthologist",750.00));
		doctorList.add(new Doctor(2,"Nithin","MBBS",2.0,"Gynecologist",1500.00));

	}

	public List<Doctor> list() {
		return doctorList;
	}

	public Boolean save(Doctor doctor) {
		
		Doctor d=new Doctor();
		d.setId(doctor.getId());
		d.setName(doctor.getName());
		d.setConsultingFees(doctor.getConsultingFees());
		d.setExperience(doctor.getConsultingFees());
		d.setQualification(doctor.getQualification());
		d.setSpecialization(doctor.getSpecialization());
		doctorList.add(d);
		return true;
		//Fill your code
	}

	public Doctor get(Integer id)
	{
		for(int i=0;i<doctorList.size();i++)
		{
			if(doctorList.get(i).getId()==(id)) {
				return doctorList.get(i);
			}
		}
		//Fill your code
		return null;
	}
	
	public Boolean update(Integer id, Doctor doctor) {
		//Fill your code
		int idx=0;
		for(int i=0;i<doctorList.size();i++)
		{
			if(doctorList.get(i).getId()==id) {
				idx=i;
				break;
			}
		}
		
		Doctor doctor1=new Doctor();
		doctor1.setId(id);
		doctor1.setConsultingFees(doctor.getConsultingFees());
		doctor1.setExperience(doctor.getExperience());
		doctor1.setName(doctor.getName());
		doctor1.setQualification(doctor.getQualification());
		doctor1.setSpecialization(doctor.getSpecialization());
		doctorList.set(idx, doctor);
		return true;
		
	}

	public boolean delete(Integer id) {
		//Fill your code
		doctorList.removeIf(doc->doc.getId()==(id));
		return true;
	}

}
