use sys;

create table val(Discharge_Capacity double,
Nominal_Capacity double);

select * from val;

select *,Discharge_Capacity/Nominal_Capacity*100 as 'soh' from val;



