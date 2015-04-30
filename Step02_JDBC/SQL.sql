select * from employees

create table emp
as
select employee_id id, first_name name,
	last_name password, hire_date hire,
	salary, commission_pct commission,
	department_id did
from employees

select * from emp

select * from emp where id = 100
insert into emp(id, name, password, hire, salary, commission, did)
values((select nvl(max(id), 0)+1 from emp),'hong', '123', sysdate, 10000, 0.1, 100)
update emp set salary = 12000, commission = 0.1, did = 50
where id = 208