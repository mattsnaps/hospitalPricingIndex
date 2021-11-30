delete from `hospital_procedure_price`;
delete from `procedure`;
delete from `hospital`;

insert into hospital (id, hospital_Name)
values  (1, 'Monroe Clinic'),
        (2, 'St. Mary''s Hospital'),
        (3, 'St. Anges Hospital'),
       (4, 'Fake Test Hospital');

insert into sample_hospital_pricing_schema.procedure (id, code, code_type, code_desc, code_desc_english)
values  (1, '76700', 'CPT', 'HC US ABDOMEN COMPLETE', 'Ultrasound, abdominal, real time with image documentation'),
        (2, '78452', 'CPT', 'HT MUSCLE IMAGE SPECT, MULT', 'Myocardial perfusion imaging, tomographic (SPECT) (including attenuation correction, qualitative or quantitative wall motion, ejection fraction by first pass or gated technique, additional quantification, when performed)'),
        (3, '80048',  'CPT', 'METABOLIC PANEL TOTAL CA', 'BASIC METABOLIC PANEL - Glucose, Urea Nitrogen (BUN), Creatinine, Sodium (Na), Potassium (K),
                        Chloride (CL), Carbon Dioxide (CO2), Anion Gap, Calcium'),
        (4, '806', 'DRG', 'VAGINAL DELIVERY WITHOUT STERILIZATION/D&C WITH CC', 'VAGINAL DELIVERY WITHOUT STERILIZATION/D&C WITH CC'),
        (5, '93017', 'CPT', 'HC CARD STRESS TEST ROUTINE', 'Cardiovascular stress test using maximal or submaximal treadmill or bicycle exercise, continuous electrocardiographic monitoring, and/or pharmacological stress');


insert into sample_hospital_pricing_schema.hospital_procedure_price (hospital_id, procedure_id, price)
values  (1, 1, '1611'),
        (2, 1, '1198'),
        (3, 1, '632'),
        (1, 2, '4843'),
        (2, 2, '4667'),
        (3, 2, '4086'),
        (1, 3, '123'),
        (2, 3, '352'),
        (3, 3, '174'),
        (1, 4, '16561'),
        (2, 4, '11328'),
        (3, 4, '5838'),
        (1, 5, '786'),
        (2, 5, '892'),
        (3, 5, '1083');
