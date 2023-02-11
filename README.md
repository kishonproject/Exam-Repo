# Exam-Repo

http://localhost:8089/doctor/getDoctors
	[
    {
        "id": 2,
        "name": "Nithin",
        "qualification": "MBBS",
        "experience": 2,
        "specialization": "Gynecologist",
        "consultingFees": 1500
    },
    {
        "id": 3,
        "name": "RavitejaSripathi",
        "qualification": "MBBS",
        "experience": 1000,
        "specialization": "Nuro",
        "consultingFees": 1000
    }
]

http://localhost:8089/doctor/createDoctor
	{
        "id": 3,
        "name": "Raviteja",
        "qualification": "MBBS",
        "experience": 5.2,
        "specialization": "Nuro",
        "consultingFees": 1000
    }
   
http://localhost:8089/doctor/getDoctor/3
 true

http://localhost:8089/doctor/update/3
	{
    "id": 3,
    "name": "RavitejaSripathi",
    "qualification": "MBBS",
    "experience": 1000,
    "specialization": "Nuro",
    "consultingFees": 1000
    }
   
http://localhost:8089/doctor/delete/1
  true
