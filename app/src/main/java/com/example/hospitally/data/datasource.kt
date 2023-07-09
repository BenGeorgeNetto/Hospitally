package com.example.hospitally.data

import com.example.hospitally.data.models.Hospital

class Datasource {
    fun loadHospitals(): List<Hospital> {
        return listOf(
            Hospital(
                hospitalName = "Amar Maternity and Fertility Centre",
                address = "Attingal, Thiruvananthapuram",
                specializations = "Fertility Care, Sexual Disorders",
                contact = "7947267790",
                lat = 8.701054166481631,
                long = 76.81369176875393
            ),
            Hospital(
                hospitalName = "G G Hospital",
                address = "Kumarapuram, Thiruvananthapuram",
                specializations = "General, Dialysis, Skin Care",
                contact = "7947311880",
                lat = 8.515619231139238,
                long = 76.93326157239709
            ),
            Hospital(
                hospitalName = "IMB Hospital and Research Centre",
                address = "Sreekaryam, Thiruvananthapuram",
                specializations = "General, Orthopedic, De-addiction",
                contact = "7419596255",
                lat = 8.557680385371008,
                long = 76.91672592735937
            ),
            Hospital(
                hospitalName = "Precise Speciality Eye Care Hospital",
                address = "PMG Junction, Thiruvananthapuram",
                specializations = "Ophtalmology",
                contact = "7419637185",
                lat = 8.510239505696346,
                long = 6.94926312180002
            ),
            Hospital(
                hospitalName = "Meditrina Hospital",
                address = "Pattom, Thiruvananthapuram",
                specializations = "General, Cardiology, Neurology, Opthalmology",
                contact = "7947181086",
                lat = 8.51562603933906,
                long = 76.94426987999344
            ),
            Hospital(
                hospitalName = "SAF Hospital",
                address = "Vattappara, Thiruvananthapuram",
                specializations = "General, ENT, Orthopedic",
                contact = "7419637155",
                lat = 8.593105630399805,
                long = 76.95159733603987
            ),
            Hospital(
                hospitalName = "Life Line Hospital",
                address = "Thiruvananthapuram Fort, Thiruvananthapuram",
                specializations = "Pediatrics, Preventive Medicine",
                contact = "7947324889",
                lat = 8.544845255947912,
                long = 76.8788128232838
            ),
            Hospital(
                hospitalName = "Vinity Polyclinic",
                address = "Puliyarakonam, Thiruvananthapuram",
                specializations = "General, Pediatrics, Hypertension",
                contact = "9061311117",
                lat = 8.540628798878105,
                long = 77.02389554577633
            ),
            Hospital(
                hospitalName = "Lords Hospital",
                address = "Anayara, Thiruvananthapuram",
                specializations = "General, Gasstrology, Pregnancy",
                contact = "6384470916",
                lat = 8.507337996515513,
                long = 76.91085404137142
            ),
            Hospital(
                hospitalName = "Pulse Medicare Hospital",
                address = "Mannanathala, Thiruvananthapuram",
                specializations = "General, Diabetics, Preventive Medicine",
                contact = "6384487669",
                lat = 8.568652500469861,
                long = 76.9453029450781
            ),
            Hospital(
                hospitalName = "Noorul Islam Multi Speciality Hospital",
                address = "Aralumoodu, Thiruvananthapuram",
                specializations = "General, Cardiology, Urology, Pediatrics",
                contact = "9745586411",
                lat = 8.412365152471223,
                long = 77.06629626227357
            )
        )
    }
}
